package Hw3;//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {
		System.out.println("開始猜數字囉");
		
		
		Scanner sc = new Scanner(System.in);
		int enter = sc.nextInt();
		int i = (int) (Math.random() * 10000);

		

			while (enter != i) {
				 
				if (enter < i) {
					System.out.println("猜大一點");
					enter = sc.nextInt();
				}
	
				if (enter > i) {
					System.out.println("猜小一點");
					enter = sc.nextInt();
				}
			}	 			 
			System.out.println("答對了");
			 
		
             
	}

}
