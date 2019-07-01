package com.javacourse.exercises;

public class Diamond {

	public static void main(String[] args) {
		int a= 10;
		printDiamond(a);
	}
			
	public static void printDiamond(int a) {
	for(int i=1;i<=a;i++) {
			printDiamondLine(a,i);
				
			}
			
	for(int i=a-1;i>=1;i--) {
		printDiamondLine(a,i);
		}

	
	}

	private static void printDiamondLine(int a, int i) {
		printInitialSpaces(a,  i);
		printLeft(i);
		printRight(i);
		System.out.println();
		//metterelo sembre nel metodo se no l'ho fa una volta sola.
		
	}
	private static void printRight(int i) {
		for(int j=1;j<=i;j++) {
		System.out.print(j);
	}
		
	}
	private static void printLeft(int i) {
		for(int j=i;j>1;j--) {
		System.out.print(j);
	}
		
	}
	private static void printInitialSpaces(int a, int i) {
		for (int j = 1; j <= a - i; j++) {
			System.out.print(" ");
		}


}
}
