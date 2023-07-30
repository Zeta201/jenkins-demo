package com.zeta.springboot.jenkinsdemo;

import java.util.Arrays;
import java.util.List;

public class MyMath {

	public int calcSum(int numbers[]) {
		int sum = Arrays.stream(numbers).reduce(0,(a,b)->a+b);
		return sum;
	}
	
	public List<String> getList(){
		return List.of("AWS","DevOps","GCP","Azure");
	}
	
	public int[] getArray(int size){
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=i;
		}
		return arr;
	}
}
