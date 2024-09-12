package hw4;
//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天

//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

import java.util.Scanner;

public class Hw5 {
	public static void main(String[] args) {

		int[] daysOfMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入年分");
		int year;
		int month;
		int day;

		while (true) {
			if (sc.hasNextInt()) {
				year = sc.nextInt();
				if (year >= 0 && year < 10000) {
					break;
				} else {
					System.out.println("輸入錯誤 ,請重新輸入");

				}
			} else {
				System.out.println("輸入錯誤 ,請重新輸入");

				sc.next();
			}
		}
		System.out.print("請輸入月分");
		while (true) {
			if (sc.hasNextInt()) {
				month = sc.nextInt();
				if (month > 0 && month <= 12) {
					break;
				} else {
					System.out.println("輸入錯誤 ,請重新輸入");

				}
			} else {
				System.out.println("輸入錯誤 ,請重新輸入");

				sc.next();
			}
		}
		System.out.print("請輸入日期");

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (isLeapYear) {
			daysOfMonth[1] = 29;

		}

		while (true)
			if (sc.hasNextInt()) {
				day = sc.nextInt();
				if (day <= daysOfMonth[(month - 1)]) {
					break;

				} else {
					System.out.println("輸入錯誤 ,請重新輸入");

//					sc.next();
				}
			} else {
				System.out.println("輸入錯誤 ,請重新輸入");

			}

		sc.close();
		int dayOfYear = 0;
		for (int i = 0; i < month - 1; i++) {

			dayOfYear += daysOfMonth[i];
		}
		dayOfYear += day;

		System.out.println("輸入的日期為該年第" + dayOfYear + "天");
	}
}
