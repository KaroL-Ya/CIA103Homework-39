package Hw3;//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形

import java.util.Scanner;

public class Hw1 {
   public static void main (String[] args) {
	 
	 int i,j,k;
	 i=0;j=0;k=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("請輸入:");
	 if(sc.hasNextInt()) {
		 i =sc.nextInt();
	 }
	 
	 if(sc.hasNextInt()) {
		 j =sc.nextInt();
	 }
	 
	 if(sc.hasNextInt()) {
		 k =sc.nextInt();
	 }
	 
	 if(i+j<=k || j+k<=i || i+k<=j) 
	 {
		System.out.println("不是三角形") ;
	 }
	 else if(i==j &&j==k&&i==k)
	 {
		 System.out.println("正三角形") ;
	 }
	 else if (i==j || j==k || i==k)
	 {
		 System.out.println("等腰三角形") ;
	 }
	 
	 else
	 {
		 System.out.println("其他三角形") ;
	 }
		 
		 		 
 }
}
