package hw4;

import java.util.Scanner;

//請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH(提示:String方法,陣列)

public class Hw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入:");
		String a = sc.nextLine();
		
		String re = " ";
		
		for(int i= a.length()-1; i>=0; i--) {
			
			re += a.charAt(i);
		}
		System.out.println(re);
		
		}
		
		
		
		 
	}
	                                          
	
	


