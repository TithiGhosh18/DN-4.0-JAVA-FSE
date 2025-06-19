package com.example.singleton;

public class Test {
	public static void main(String args[]) {
		Logger logger1 =  Logger.getInstance();
		Logger logger2 =  Logger.getInstance();
		
		logger1.log("Logger1 is printed");
		logger2.log("Logger2 is printed");
		
		if(logger1 == logger2) {
			System.out.print("True: Logger class has only one instance.");
		}else {
			System.out.print("false: Logger class has multiple instances.");
		}
	}
}
