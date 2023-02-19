/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3q2;

/**
 *
 * @author Harrey Be
 */
public class Appointment {
    String App_Name;
    String Location;
    String Start_Date;
    String End_Date;
    Appointment (String app_name, String loc, String starting, String ending){
        App_Name = app_name;
        Location = loc;
        Start_Date = starting;
        End_Date = ending;
    }
    static Appointment Build_New_Appointment(String a_n, String l, String s, String e){
        return new Appointment(a_n, l,s,e);
    }
}
