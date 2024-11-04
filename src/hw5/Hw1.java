package hw5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height),
//當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
public class Hw1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入寬度");
		int width = sc.nextInt();
		System.out.println("請輸入高度");
		int height = sc.nextInt();
		
		starSquare( width, height);
		sc.close();
	}
		 public static void starSquare(int width, int height) {
		
		int i, j;
		for (i = 0; i < height; i++)
		{
			for (j = 0; j < width; j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
		
	}

}

