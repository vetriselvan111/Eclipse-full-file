package com.Control_Statements;

public class For_Loop1 {
	public static void main(String[] args) {
		for (int i = 3; i >= 1; i--) {
			for (int j = 3; j >= 1; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println(" ");
		for (int i = 3; i >= 1; i--) {
			for (int j = 3; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println(" ");
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
