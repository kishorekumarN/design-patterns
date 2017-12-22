package com.producerconsumer.threadclass;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerCOnsumerDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		Integer capacity = 1;
		
		Producer producer = new Producer(queue, capacity, "PRODUCER");
		Consumer consumer = new Consumer(queue, capacity, "CONSUMER");
		
		producer.start();
		consumer.start();
	}

}
