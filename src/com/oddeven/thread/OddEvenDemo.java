package com.oddeven.thread;

public class OddEvenDemo {
	public static void main(String[] args) {
			int max =10;
			
			NumberPrinter numberPrinter = new NumberPrinter();
			new OddNumberGenerator(numberPrinter, max).start();
			new EvenNumberGenerator(numberPrinter, max).start();
	}
}
