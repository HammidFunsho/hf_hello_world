package com.coveros5.hello_world5;

import java.util.Random;

public class EvenNumberGenerator {
	public static int generateRandomEven(){
		Random randomGenerator = new Random();
		int result = randomGenerator.nextInt();
		if (result%2!=0){
			result++;
		}
		return result;
	}
	public static int generateRandomOdd(){
		Random randomGenerator = new Random();
		int result = randomGenerator.nextInt();
		
		if (result%2!=0){
			result++;
		}
		return result;
	}
}
