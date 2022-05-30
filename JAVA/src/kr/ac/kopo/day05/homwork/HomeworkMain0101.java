package kr.ac.kopo.day05.homwork;
import java.util.Scanner;

//교수님 코드 
public class HomeworkMain0101 {
	
	public static void main(String[] args) {
			int[] nums = new int[10];
			int[] sum = new int[2]; // [0]:짝수총합 ~ [1]:홀수총합
			Scanner sc = new Scanner(System.in);

			for(int i = 0; i < nums.length; ) {
				System.out.print(i + 1 + "번째 정수 입력 : ");
				nums[i] = sc.nextInt();
				if(nums[i] >= 0) {
					sum[nums[i] % 2] += nums[i];
					i++;
				}
			}
			/*
			for(int i = 0; i < nums.length; i++) {
				do{
					System.out.print(i + 1 + "번째 정수 입력 : ");
					nums[i] = sc.nextInt();
				}while(nums[i] < 0);
				sum[nums[i] % 2] += nums[i];
			}
			*/
			
			String[] title = {"짝수", "홀수"};
			for(int mod = 0; mod <= 1; mod++) {
				System.out.println("< " + title[mod] + ">");
				for(int i = 0; i < nums.length; i++) {
					if(nums[i] % 2 == mod) {
						System.out.print(nums[i] + "  ");
					}
				}
				System.out.println();
				System.out.println(title[mod] + "총합 : " + sum[mod]);
			}
		}
	}








