package br.ceuma.sisagenda.siag;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import br.ceuma.sisagenda.siag.br.ceuma.sisagenda.siag.model.Agendamento;

public class AgendamentoActivity extends AppCompatActivity {

    // json array response url
    private String urlJsonArray = "http://www.baoba.eco.br/rest/agenda.php?uid=";
    private ListView listadeagendamentos;
    private List<Agendamento> lista = new ArrayList<Agendamento>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamento);

        Intent intent = getIntent();

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            Toast.makeText(AgendamentoActivity.this, query.toString(), Toast.LENGTH_SHORT).show();
            listadeagendamentos = (ListView) findViewById(R.id.listView);

            /*List<Agendamento> lista = new ArrayList<Agendamento>();

            Agendamento c1 = new Agendamento();

            c1.setId(1);
            c1.setNome("Daniel Cabral");
            c1.setDataAgendamento("25/05/206");
            c1.setIdCategoria(1);
            c1.setCategoria("Categoria");
            c1.setIdServico(1);
            c1.setServico("Serviço");

            Agendamento c2 = new Agendamento();

            c2.setId(1);
            c2.setNome("Daniel Cabral");
            c2.setDataAgendamento("25/05/206");
            c2.setIdCategoria(1);
            c2.setCategoria("Categoria");
            c2.setIdServico(1);
            c2.setServico("Serviço");

            Agendamento c3 = new Agendamento();

            c3.setId(1);
            c3.setNome("Daniel Cabral");
            c3.setDataAgendamento("25/05/206");
            c3.setIdCategoria(1);
            c3.setCategoria("Categoria");
            c3.setIdServico(1);
            c3.setServico("Serviço");

            //Adiciona a Lista
            lista.add(c1);
            lista.add(c2);
            lista.add(c3);

            AgendamentoAdapter meuadapter = new AgendamentoAdapter(this, lista);
            listadeagendamentos.setAdapter(meuadapter);*/

            //solicitarWebService(query);
            teste(query);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(getApplicationContext(), "Home",
                        Toast.LENGTH_LONG).show();

                // go to previous activity
                onBackPressed();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /*private void solicitarWebService(String query){
        JsonArrayRequest req = new JsonArrayRequest(urlJsonArray + query,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        try {

                           //JSONArray jsonArray = response.getJSONArray("agendamentos");
                            for (int i = 0; i < response.length(); i++) {

                                JSONObject agendamento = response.getJSONObject(i);

                                Agendamento ag = new Agendamento();

                                ag.setNome(agendamento.getString("nome_aluno"));
                                ag.setDataAgendamento(agendamento.getString("dia"));
                                ag.setCategoria(agendamento.getString("nome_cat"));
                                ag.setServico(agendamento.getString("nome_servico"));

                                lista.add(ag);
                            }
                            AgendamentoAdapter meuadapter = new AgendamentoAdapter(getApplicationContext(), lista);
                            listadeagendamentos.setAdapter(meuadapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("Volley", "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(req);
    }*/

    private void teste(String query){
        //listadeagendamentos = (ListView) findViewById(R.id.listView);
        JsonObjectRequest req = new JsonObjectRequest(Request.Method.GET, urlJsonArray + query,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        try {

                            JSONArray jsonArray = response.getJSONArray("agendamentos");

                            for (int i = 0; i < jsonArray.length(); i++) {

                                JSONObject agendamento = jsonArray.getJSONObject(i);

                                Agendamento ag = new Agendamento();

                                ag.setNome(agendamento.getString("nome_aluno"));
                                ag.setDataAgendamento(agendamento.getString("dia"));
                                ag.setCategoria(agendamento.getString("nome_cat"));
                                ag.setServico(agendamento.getString("nome_servico"));

                                lista.add(ag);
                            }
                            AgendamentoAdapter meuadapter = new AgendamentoAdapter(getBaseContext(), lista);
                            listadeagendamentos.setAdapter(meuadapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("Volley", "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(req);
    }
}
