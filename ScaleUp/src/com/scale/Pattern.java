package com.scale;

import java.util.Scanner;
//                **********
//                ****  ****
//                ***    ***
//                **      **
//                *        *
//                pattern designed


public class Pattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int j=0;
	for(int i=0;i<n;i++) {
		for( j=1;j<=n-i;j++) {
			System.out.print("*");
		}
		for(j=0;j<i;j++) {
		 System.out.print(" ");
		}
		for(j=n;j<2*n;j++) {
			if(j<n+i) {
				System.out.print(" ");
			}else {
			System.out.print("*");
			}
		}
		System.out.println();
		
	}
	System.out.println("pattern designed");
}
}
