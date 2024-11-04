package hw5;

//請設計一個方法為randAvg(),
//從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
public class Hw2 {

	public static void randAvg() {
		int[] i = new int[10];

		int a = 0;
		int avg;

		for (int j = 0; j < i.length; j++) {
			i[j] = (int) (Math.random() * 100);
			System.out.print(i[j] + " ");
			a += i[j];
		}

		a /= i.length;
		avg = a;

		System.out.println();
		System.out.println("平均值是" + avg);

	}

	public static void main(String[] args) {
		randAvg();

	}

}
