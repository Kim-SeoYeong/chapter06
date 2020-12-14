package com.javaex.ex03;

public class ThreadApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		DigitRunnableimpl digit = new DigitRunnableimpl();
		Thread thread = new Thread(digit);
		*/
		Thread thread = new Thread(new DigitRunnableimpl());
		thread.start();
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			Thread.sleep(1000);
		}
	}

}
