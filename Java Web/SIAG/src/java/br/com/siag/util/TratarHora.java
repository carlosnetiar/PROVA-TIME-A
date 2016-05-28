/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.util;

import java.util.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author marcus
 */
public class TratarHora {

    public String getHoraSys() {
        // cria um StringBuilder
        StringBuilder sb = new StringBuilder();
        // cria um GregorianCalendar que vai conter a hora atual
        GregorianCalendar d = new GregorianCalendar();
        // anexa do StringBuilder os dados da hora
        sb.append(d.get(GregorianCalendar.HOUR_OF_DAY));
        sb.append(":");
        sb.append(d.get(GregorianCalendar.MINUTE));
        sb.append(":");
        sb.append(d.get(GregorianCalendar.SECOND));
        // retorna a String do StringBuilder
        return sb.toString();
    }

    public Time tratarHora(String hora) throws ParseException {
        String str = hora;
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
        Date data = formatador.parse(str);
        Time time = new Time(data.getTime());
        
        return time;
    }
}
