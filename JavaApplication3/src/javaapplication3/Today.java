/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author 123
 */
public class Today {
    static int dayToday(){
        DateFormat dateFormat = new SimpleDateFormat("dd");
        String dt;
        dt = dateFormat.format(System.currentTimeMillis());
        int s  = Integer.parseInt(dt);
        return s;
    }
    
}
