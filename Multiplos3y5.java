package com.softtek.java.academy.exercises;


public class Multiplos3y5 {
	 public static void main(String[] args) {
	        int maxNumber = 100;
	        long answer = 0;
	        for(int i = 1; i < maxNumber; i++) {
	            if(i % 3 == 0) {
	                answer += i;
	            }
	            if(i % 5 == 0) {
	                answer += i;
	            }
	            
	        }
	        System.out.println(answer);
	    }
	}

