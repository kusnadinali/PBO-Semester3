package com.praktek;

import java.util.Scanner; 

public class Strings {
	public static String Capitalize(String kata) {//method membuat huruf depan menjadi kapital
		if(kata.length()==0) return kata;//jika panjang kata 0
		
		return kata.substring(0, 1).toUpperCase()+kata.substring(1);//membuat kapital huruf pertama
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("masukan kata A: ");
		String A = input.next();
		System.out.print("masukan kata B: ");
		String B = input.next();
		
		System.out.printf("jumlah kata A dan B : %d\n",A.length()+B.length());//menampilkan 
		System.out.print("A lebih besar dari B: ");
		if(A.compareTo(B)==1) {//jika A lebih besar dari B akan bernilai 1
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		System.out.println(Capitalize(A)+ " " +Capitalize(B));//menampilan Hello Java

		input.close();
	}
}
