package hw4;
//班上有8位同學,他們進行了6次考試結果如下:

//請算出每位同學考最高分的次數 (提示:二維陣列)
//      | 1號| 2號| 3號 | 4號| 5號| 6號| 7號| 8號 |
//|---- |----|----|--- |----|----|----|--- |----|
//| 1考 | 10 | 35 | 40 | 100| 90 | 85 | 75 | 70 |
//| 2考 | 37 | 75 | 77 | 89 | 64 | 75 | 70 | 95 |
//| 3考 | 100| 70 | 79 | 90 | 75 | 70 | 79 | 90 |
//| 4考 | 77 | 95 | 79 | 89 | 60 | 75 | 85 | 89 |
//| 5考 | 98 | 70 | 89 | 90 | 75 | 90 | 89 | 90 |
//| 6考 | 90 | 80 | 100| 75 | 50 | 20 | 99 | 75 |

public class Hw6 {
	public static void main(String[] args) {
		int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 79, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] maxScores = new int[scores[0].length];

		for (int i = 0; i < scores.length; i++) {
			int maxScore = 0;
			int highScore = 0;
			for (int j = 0; j < scores[i].length; j++) {

				if (scores[i][j] > highScore) {
					highScore = scores[i][j];
					maxScore = j;
				}

			}

			maxScores[maxScore]++;
		}

		for (int i = 0; i < maxScores.length; i++) {
			System.out.println("第" + (i+1) + "位同學獲得最高分的次數為" + maxScores[i]);
		}

	

}
}