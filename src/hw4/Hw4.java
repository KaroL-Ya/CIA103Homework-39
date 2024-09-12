package hw4;

import java.util.Scanner;

//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」    (提示:Scanner,二維陣列)
//| 員工編號 | 25  | 32  | 8   | 19  | 27  |
//|---------|-----|-----|-----|-----|-----|
//| 身上現金 | 2500| 800 | 500 | 1000| 1200|

public class Hw4 {
	public static void main(String[] args) {

		int[][] i = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for (int j = 0; j < i[1].length; j++) {
			
			if (a <= i[1][j]) 
			{
				System.out.print(i[0][j] + " ");
				sum++;
			}

		}
		System.out.print(sum + "人");

	}
}
