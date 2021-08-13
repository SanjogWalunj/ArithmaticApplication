package com.csi.arithmaticapplication;

import java.util.Scanner;

public class ArithmaticApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VALUE N1");
		int n1= sc.nextInt();
		System.out.println("ENTER THE VALUE N2");
		int n2= sc.nextInt();
		int result=n1+n2;
		System.out.println(" "+result);
	}

}
