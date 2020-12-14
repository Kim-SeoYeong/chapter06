package com.javaex.ex03;

public class DigitRunnableimpl implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int cnt = 0; cnt < 10; cnt++) {
			try {
				Thread.sleep(1000);
				System.out.print(cnt);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
