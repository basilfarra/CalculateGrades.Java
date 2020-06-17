
package project;

import java.util.Random;
import java.util.Scanner;
import static javafx.application.Platform.exit;
import static project.Main.number;

public class Method {
    
    
         String[] name = new String[number];
         int [][] marks = new int[number][number*5];
         float[] avg = new float [number];
         int [] Max = new int[number] ;
         
         
         Scanner input = new Scanner(System.in);
         Random ran = new Random();
         
         
         public void StudentsNames(){
             
             for (int i=0 ; i<number ; i++){
                 System.out.println("Enter names of students : ");
                 name[i] = input.next();
           
               for(int j=0 ; j<5 ; j++){
                   marks[i][j] = ran.nextInt(100);
                   System.out.print(" "+marks[i][j]+"\n");
               }      
         }
    }
         
         public void StuAndAvg(){
             
             System.out.println("***************** Avarge *********************** ");
            
             int sum= 0 ;
             
             for(int i =0 ; i<number ; i++){
                 for(int j =0 ; j<5 ; j++){
                     sum = sum + marks[i][j];
                 }
                 
                 sum = sum/5 ;
                 avg[i] =sum  ;
                 System.out.println(name[i]+"  : "+ avg[i] + "\n");
             }
             
         }
         
         public void NameAndMax(){
             
             int max ;
             max = marks[0][0];
             
             for(int i =0 ; i<number ; i++){
                 for(int j =1 ; j<5 ; j++){
                     
                    if(max<marks[i][j]){
                       max=marks[i][j];
                    }
                    
                  if(j==4){
                        System.out.println(name[i]+"  : "+max);
                        
                         max=0;
                }
             }
           }
         }
         public void BestStudentOnMark(){
            
             int max = marks[0][0];
             int position = 0 ;
             int i , j ;
             
               for(i =0 ; i<number ; i++){
                 for( j =0 ; j<5 ; j++){
                     
                     if (max<marks[i][j]){
                         max = marks[i][j];
                         position = i ;
                     }
                 }
         }
               System.out.println(name[position]+" is the best student based on Mark : "+ max);
    
}
         
         public void BestStudentOnAvg(){
      
             int i , position = 0;
             float max = avg[0];
             
             for( i =1 ; i<number ; i++){
                 if (max < avg[i]){
                     max = avg[i];
                     position = i ;
                 }
             }
             
             System.out.println(name[position] + " is the best student based on Avarge : " + max);
         }
         
         
         public void SuccessfulStudents(){
             
                 for (int i=0;i<number;i++){
                         if(avg[i]>50){
                                 
                         System.out.println(name[i]+" is succesful students : "+avg[i]);

                 }
           }   
}
         
         
         public void FailedStudents(){
             
             for(int i=0 ; i<number ; i++){
                 if(avg[i]<50){
                     
                      System.out.println(name[i]+" is Failed students : "+avg[i]);
                 }
             }
         }
         
         public void Exit(){
             exit();
         }
}
