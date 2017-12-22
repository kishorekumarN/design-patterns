package com.oddeven.thread;

public class OddNumberGenerator extends Thread {
	private NumberPrinter q;
	private int max;

	public OddNumberGenerator(NumberPrinter q, int max) {
		this.q = q;
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 1; i < max; i = i + 2) {
			try {
				q.printOdd(i);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
