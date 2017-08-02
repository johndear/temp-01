package com.op;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("--------- start ----------------");
		for (int i = 0; i < 200; i++) {
			System.out.println(i);
		}
		Thread.sleep(60 * 1000);
		System.out.println("--------- end! ----------------");
		
	}

}
