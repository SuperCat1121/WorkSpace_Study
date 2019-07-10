package com.test05;

public class Arr {

	public static void main(String[] args) {
		/*
			 1  2  3  4  5
			10  9  8  7  6
			11 12 13 14 15
			20 19 18 17 16
			21 22 23 24 25
			                  2차원 배열 만들기
		 */
		int[][] arr = new int[5][5];
		boolean flag = true;
		int cnt = 1;
		for(int i=0;i<arr.length;i++) {
			if(flag) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j] = cnt++;
				}
				flag = false;
			} else {
				for(int j=arr[i].length-1;j>=0;j--) {
					arr[i][j] = cnt++;
				}
				flag = true;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------");
		
		// 소용돌이 배열
		int[][] arr2 = new int[5][5];
		int cnt2 = 0;
		for(int i=0;i<arr.length;i++) {
			
		}
	}
}


























