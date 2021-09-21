package com.praktek;

public class operators {
	static short methodOne(long l)
	{
		System.out.println("nilai l: "+l);
		int i = (int) l;
		System.out.println("nilai i: "+i);
		System.out.println("nilai short i: "+(short)i);
		
		return (short)i;
	}
	
	public static void main(String[] args)
	{
		double d = 10.25;
		System.out.println("nilai d: "+ d);
		float f = (float) d;
		System.out.println("niali f: "+ f);
		byte b = (byte) methodOne((long) f);
		System.out.println("nilai b: "+b);
	}
}
