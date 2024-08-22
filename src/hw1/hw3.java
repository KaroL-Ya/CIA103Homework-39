package hw1; //請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class hw3 {
	public static void main(String[] args) {
		int a = 256559, b = 60, c = 60, d = 24;

//		 System.out.println(a/b/c/d);2天

//		 System.out.println(a/b/c);71小時

		// System.out.println(a/b);4275分
		// System.out.println(a%b);59秒

		int e = 4275, f = 71, g = 2, h = 23, i = 15, j = 59;
		// System.out.println(f%d);23小時
		// System.out.println(e%b);15分

		System.out.println(g + "天" + h + "小時" + i + "分" + j + "秒");

	}

}
