package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class TestApplication {
	public static int calculateTotalPrice(int[] prices, int discount) {
// Write your code here
// To debug: System.err.println("Debug messages...");
		int total =0;
		int len = prices.length;
		Arrays.sort(prices);
		for (int i=0;i<len-1;i++){
			total+=prices[i];
		}

		return (int) ( (total+(float) ((prices[len-1])-((prices[len-1])*discount/100f))));
	}

	public static int calcculatePrice(int[] prices,int discount){

		Arrays.sort(prices);
		int total = 0;
		int len= prices.length;

		for (int i= 0; i < len; i++){
			total += prices[i];
		}
			return (int) ((total+(float) ((prices[len-1])-((prices[len-1])*discount/100f))));
	}

	public static int findSmallestInterval(int[] numbers) {
		Arrays.sort(numbers);
		int interval = numbers[1] - numbers[0];
		int tmp;
		for (int i = 1; i < numbers.length - 1; i++) {
			tmp = numbers[i + 1] - numbers[i];
			if(tmp < interval) interval = tmp;
		}
		return interval;
	}

	public static int findInterval(int [] numbers){
		Arrays.sort(numbers);
		int interval =numbers[1] - numbers[0];
		int temp;
		for (int i =1; i<numbers.length; i++)
		{
			temp = numbers[i+1] - numbers[i];
			if (temp<interval){
				interval= temp;
			}
		}
		return interval;
	}



	public static  void main(String[] args) {
 		int[] array = new int[]{100, 200, 299};
		 int result=0;
		result= calculateTotalPrice(array, 20);
		result= findSmallestInterval(array);
		System.out.println("baha" + result);
		SpringApplication.run(TestApplication.class, args);
	}

}
