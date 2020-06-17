/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;


public class Main {

    static int number ;
    
    public static void main(String[] args) {
          Scanner input  = new Scanner(System.in);
         
          int num;
          boolean ok =true;
         System.out.println("Enter number of students : ");
         number = input.nextInt();
         Method obj = new Method();
         
         while(ok){
             System.out.println("  1- Enter students names  : ");
             System.out.println("  2- Print students names and thier avarge  : ");
             System.out.println("  3- Print students names and maximum mark   : ");
             System.out.println("  4- Print best student based on mark  : ");
             System.out.println("  5- Print best student based on avarge : ");
             System.out.println("  6- Print number of successed students  : ");
             System.out.println("  7- Print Faild students names and thier avarge  : ");
             System.out.println("  8- Exit  : ");
             System.out.println("  Choose number from list : ");
             
             num = input.nextInt();
             
             switch(num){
                 case 1:
                        obj.StudentsNames();
                     break;
                 case 2:
                     obj.StuAndAvg();
                     break;
                 case 3:
                     obj.NameAndMax();
                     break;
                 case 4:
                     obj.BestStudentOnMark();
                     break;
                 case 5:
                     obj.BestStudentOnAvg();
                     break;
                 case 6:
                     obj.SuccessfulStudents();
                     break;
                 case 7:
                     obj.FailedStudents();
                     break;
                 case 8:
                     obj.Exit();
                  
             }
             
         }
         
    }
    
}

