/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3q2;

import java.util.Scanner;

/**
 *
 * @author Harrey Be
 */
public class Lab3Q2 {

    static void Register_Appointments(User U1){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Appointment Name: ");
        String a1 = sc.nextLine();
        System.out.println("Enter Appointment Location: ");
        String a2 = sc.nextLine();
        System.out.println("Enter Appointment Start Date: ");
        String a3 = sc.nextLine();
        System.out.println("Enter Appointment End Date: ");
        String a4 = sc.nextLine();
        U1.Add_New_Appointment(a1, a2, a3, a4);
    }
    public static void main(String[] args) {
        User U1 = new User ("Joe", "Daniel", 123456789 , "Gegorian");
        Register_Appointments(U1);
    }
}
