package com.javaex.ex04;

public class LowerImpl implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char ch = 'a'; ch <= 'z'; ch++) {
			try {
				Thread.sleep(1000);
				System.out.print(ch);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
		}
	}

}
