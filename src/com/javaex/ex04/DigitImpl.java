package com.javaex.ex04;

public class DigitImpl implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
