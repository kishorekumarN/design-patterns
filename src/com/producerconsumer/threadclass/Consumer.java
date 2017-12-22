package com.producerconsumer.threadclass;

import java.util.Queue;

public class Consumer extends Thread {
	private Queue<Integer> queue;
	private Integer capacity;

	public Consumer(Queue<Integer> queue, Integer capacity, String name) {
		super(name);
		this.queue = queue;
		this.capacity = capacity;
	}
	
	@Override
	public void run() {
		while(true){
			synchronized (queue) {
				while(queue.isEmpty()) {
					System.out.println("Queue is empty waiting for producer...");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("consuming : " +queue.remove());
				queue.notify();
			}
		}
	}
}
