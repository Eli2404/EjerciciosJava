package com.softtek.java.academy.exercises;

import java.util.Scanner;

public class StarExerciseform2 {
	
    public static void printStars(int n) 
    { 
        int i, j; 
        for(i=0; i<n; i++) 
        { 
            for(j=0; j<=i; j++) 
            {  
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
   } 
    // Driver Function 
    public static void main(String args[]) 
    { 
        int n; 
        System.out.println("Que cantidad de filas quiere impimir");
    	Scanner sc= new Scanner(System.in);
    	n=sc.nextInt();
        printStars(n); 
    } 
}