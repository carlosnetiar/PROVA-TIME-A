/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.util;

import br.com.siag.swing.FrmPrincipal;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author marcus
 */
public class HoraAtual {

    public HoraAtual() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(
                new Runnable() {
            public void run() {
                FrmPrincipal.JL_HORA_SISTEMA.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }, 1, 1, TimeUnit.SECONDS);
    }

    /**
     * 
     * @return DIA ATUAL DO SISTEMA NO FORMATO yyyy-MM-dd
     */
    public static String dataSistema() {
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");        
        return dateFormat.format(d);
    }
}
