package com.test05;

public class MTest {

	public static void main(String[] args) {
		// array : 같은 타입의 여러개의 값을 효과적으로 관리하기 위한 객체
		/*
			0 0 0 0 0
			0 0 0 0 0
			0 0 0 0 0
			0 0 0 0 0
			0 0 0 0 0
			5 * 5 배열 -> 1차원 배열의 각각의 값은 random(0 ~ 9)
			배열 안의 모든 값을 더해서 출력
		 */
		int[] arr = new int[25];
		int sum = 0;
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i] + "  ");
			sum += arr[i];
			if(++cnt%5 == 0) {
				System.out.println();
			}
		}
		System.out.println("총 합 : " + sum);
		
		// 2차원 배열 (5*5) 만들어서 랜덤값(0~9) 넣어서 출력
		// X의 합 출력
		int[][] arr2 = new int[5][5];
		int xsum = 0;
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = (int)(Math.random()*10);
				System.out.print(arr2[i][j] + "  ");
				if(i==j || i+j==4) {
					xsum += arr2[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("x합 : " + xsum);
	}
}
