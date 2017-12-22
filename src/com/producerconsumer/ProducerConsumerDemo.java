package com.producerconsumer;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		
		final ProducerConsumer pc = new ProducerConsumer();
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread Consumer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		Consumer.start();
		
		try {
			producer.join();
			Consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
