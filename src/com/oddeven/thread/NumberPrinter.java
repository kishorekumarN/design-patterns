package com.oddeven.thread;

public class NumberPrinter {
	private boolean isEvenNumber = true;

	public void printOdd(int number) throws InterruptedException {
		synchronized (this) {
			if (!isEvenNumber) {
				wait();
			}
			System.out.println("Odd : " + number);
			isEvenNumber = false;

			notify();
		}
	}

	public void printEven(int number) throws InterruptedException {
		synchronized (this) {

			if (isEvenNumber) {
				wait();
			}

			System.out.println("even : " + number);
			isEvenNumber = true;

			notify();
		}
	}
}
