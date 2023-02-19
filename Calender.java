/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3q2;

import java.util.Vector;

/**
 *
 * @author Harrey Be
 */
public class Calender {
    String Calender_Type;
    static Vector<Appointment> appointments;
    Calender(String calender_type){
        Calender_Type = calender_type;
        appointments = new Vector<Appointment>(0);
    }
    static boolean CheckIf(String S1){
        for(int i=0;i<appointments.capacity();i++){
            if(appointments.get(i).Start_Date == S1){
                System.out.println("Date Already Booked with "+appointments.get(i).App_Name);
                return false;
            }
        }
        return true;
    }
}

