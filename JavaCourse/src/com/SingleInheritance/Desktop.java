package com.SingleInheritance;

public class Desktop extends Computer {
    public void desktopSize() {
		System.out.println("size:14 inch");
		System.out.println("Colour:White");

	}
    public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}
