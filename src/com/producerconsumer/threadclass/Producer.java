package com.producerconsumer.threadclass;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
	private Queue<Integer> queue;
	private Integer capacity;

	public Producer(Queue<Integer> queue, Integer capacity, String name) {
		super(name);
		this.queue = queue;
		this.capacity = capacity;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (capacity == queue.size()) {
					System.out.println("queue is full waiting for consumer....");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				Random random = new Random();
				int i = random.nextInt();
				System.out.println("Producing value : " + i);
				queue.add(i);
				queue.notify();
			}
		}
	}

}
