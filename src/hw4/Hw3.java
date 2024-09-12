package hw4;
//有個字串陣列如下 (八大行星):

//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) (提示:字元比對,String方法)

public class Hw3 {
	public static void main(String[] args) {
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int a = 0;

		// 遍歷每個行星名稱
		for (int i = 0; i < planets.length; i++) {
			
			String planet = planets[i];
			// 遍歷每個字符
			for (int j = 0; j < planet.length(); j++) {
				
				char c = planet.charAt(j);
				// 檢查字符是否為母音
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					a++;
				}
			}
		}

		System.out.println("母音的總數: " + a);
	}

}
