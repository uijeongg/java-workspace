package kr.ac.kopo.day05.homwork;

import java.util.Scanner;

public class HomeworkMain0502 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = {1, 2, 3, 4, 5};
		
		System.out.println("< BEFORE >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.print("Left(-), Rigth(+) : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("Start Index(0-4) : ");
		int index = sc.nextInt();
		
		System.out.println("< AFTER >");
		
		/*
		int sign = ch == '+' ? 1 : -1;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[(index + sign*i + nums.length) % nums.length] + "\t");
		}
		*/
		
		if(ch == '+') {
			for(int i = 0; i < nums.length; i++) {
				System.out.print(nums[(index+i) % nums.length] + "\t");
			}
		} else if(ch == '-') {
			for(int i = 0; i < 5; i++) {
				System.out.print(nums[(index-i+nums.length) % nums.length] + "\t");
			}
		}
		
		System.out.println();
		/*
		if(ch == '+') {
			for(int i = index; i < nums.length; i++) {
				System.out.print(nums[i] + "\t");
			}
			for(int i = 0; i < index; i++) {
				System.out.print(nums[i] + "\t");
			}
		} else if(ch == '-') {
			for(int i = index; i >= 0; i--) {
				System.out.print(nums[i] + "\t");
			}
			for(int i = nums.length-1; i > index; i--) {
				System.out.print(nums[i] + "\t");
			}
		}
		System.out.println();
		*/
	}



	}


//%연산자를 사용해서 구간을 설정할 수 있다
//구간을 통해서 삥글삥글 돌면서
//% 키워드의 특징을 잘 아는게 포인트
