package com.javaex.ex01;


public class ThreadApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//준비
		Thread thread = new DigitThread();	//섞어쓰기
		Thread thread2 = new LowerThread();
		Thread thread3 = new UpperThread();
		
		//스레드 방식 --> 출장
		//thread.run() ==> 이렇게 하면 안됨.
		thread.start();
		thread2.start();
		thread3.start();

		//주의
		//thread.run();
	}

}
