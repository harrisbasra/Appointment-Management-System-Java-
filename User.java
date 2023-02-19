/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3q2;

/**
 *
 * @author Harrey Be
 */
public class User extends Calender {
    static String Name;
    static String Father_Name;
    static long NTN;
    User (String name, String father_name, long ntn, String app_name){
        super(app_name);
        Name = name;
        Father_Name = father_name;
        NTN = ntn;
    }
    void Add_New_Appointment(String n, String l, String s1, String s2){
        if(Calender.CheckIf(s1)){
            Calender.appointments.add(Appointment.Build_New_Appointment("Wedding", "Lahore", "19 Feb", "23 Feb"));        
        }
        System.out.println("Appointment "+n+" generated for "+l+" with Dates: "+s1+" - "+s2+".");
    }
}
