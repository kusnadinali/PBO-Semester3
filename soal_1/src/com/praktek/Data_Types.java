package com.praktek;

import java.util.Scanner;
//import java.io.*;



public class Data_Types {
	
	
	public static void main(String[] args) {
		for (int i=0;i<6;i++) {
			DataTypeExist();
		}
	}
	public static void DataTypeExist() {
		Scanner input = new Scanner(System.in);
		boolean cek = false;
		
		if (input.hasNextByte()==true){
			System.out.println("* byte");
			cek = true;
		}
		System.out.printf("can be fifted in: \n");
		if (input.hasNextShort()==true) {
			System.out.println("* short");
			cek = true;
		}
		if (input.hasNextInt()==true) {
			System.out.println("* int");
			cek = true;
		}
		if (input.hasNextLong()==true) {
			System.out.println("* long");
			cek = true;
		}
		if (cek==false) {
			System.out.println("can't be fitted anywhere");
		}
		input.close();
		
	}
	
}
