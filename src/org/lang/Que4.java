package org.lang;
public class Que4 {
	public static void main(String[] args) {
		String s="Java";
		System.out.println(s);
		String s1="Java";
		System.out.println(s1);
		boolean eq = s.equals(s1);
		boolean pr = s.equalsIgnoreCase(s1);
		System.out.println(pr);
		System.out.println(eq);
		String s3="java";
		boolean eq1 = s.equals(s3);
		System.out.println(eq1);
		String s4= "Green Technology";
		String s5= "GreenTechnology.";
		boolean eq2 = s4.equals(s5);
		System.out.println(eq2);
		String s6="nisha";
		String s7= "Nisha";
		boolean eq3 = s6.equalsIgnoreCase(s7);
		System.out.println(eq3);
		
		
	}

}
