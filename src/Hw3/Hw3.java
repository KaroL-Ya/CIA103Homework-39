package Hw3;//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數

import java.util.Scanner;

public class Hw3 {
	
	public static void main(String[] args) {
		 System.out.print("請輸入您不想要的數字 (1~9): ");	 
        Scanner sc = new Scanner(System.in);
        int unwantedNumber = sc.nextInt();      
        
        // 讓使用者輸入不想要的數字
//        while (true) {
//            if (sc.hasNextInt()) {
//                unwantedNumber = sc.nextInt();
//                if (unwantedNumber >= 1 && unwantedNumber <= 9) {
//                    break;
//                } else {
//                    System.out.println("請輸入範圍內的數字！");
//                }
//            } else {
//                System.out.println("請輸入有效的數字！");
//                sc.next(); 
//            }
//        }

        // 計算可選擇的號碼
        int i=0,j=0;
//		for (int i=1; i<=49; i++) {
        while(i<49) {
        	i++;
			if (i % 10 == unwantedNumber) 
				continue ;
		   if (i / 10 == unwantedNumber) 
			   continue ;
			
			j++;
			System.out.print(i+" ");
			}
	
        
        // 顯示結果
        System.out.println("您可以選擇的號碼有: " + j +"個");}
       
}


