package com.softtek.java.academy.exercises;

import java.util.Scanner;

public class Sum2numbers {
	public static void main(String args[]) {
		int num1, num2, sum, op;
		do {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite el primer numero");
	num1 = sc.nextInt();
	System.out.println("Digite el segundo numero");
	num2 = sc.nextInt();
	sum= num1+num2;
	System.out.println("La suma de los dos numeros es:" + sum);
	System.out.println("Desea repetir el programa SI=1 o NO=2");
	op= sc.nextInt();
		}while(op==1);
	}
}
