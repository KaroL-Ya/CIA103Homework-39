package hw1; /*某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
				金加利息共有多少錢*/

public class hw5 {
	public static void main(String[] args) {

		double a = 1500000, b = 1.02, c = 10;

		System.out.println(a * Math.pow(b, c));
	}

}
