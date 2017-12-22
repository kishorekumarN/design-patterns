package com.producerconsumer;

import java.util.LinkedList;

public class ProducerConsumer {

	private LinkedList<Integer> buffer = new LinkedList<>();
	private Integer capcity = 2;

	public void producer() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (buffer.size() == capcity) {
					wait();
				}
				System.out.println("Produced: " + value);
				buffer.add(value++);
				notify();

				Thread.sleep(1000);

			}
		}
	}

	public void consumer() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (buffer.isEmpty()) {
					wait();
				}
				System.out.println("Consumed: " + buffer.removeFirst());
				notify();

				Thread.sleep(1000);

			}
		}
	}

}
