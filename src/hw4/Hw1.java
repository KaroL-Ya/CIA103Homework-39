package hw4;

import java.util.Arrays;

//有個一維陣列如下:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素(提示:陣列,length屬性)

public class Hw1 {
	public static void main(String[] args) {
		
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(intArray);//排順序
		int sum=0;  int a;
		for(int i=0;i<intArray.length;i++) {
			
			sum +=intArray[i]; }
				
		 sum/=intArray.length;
		 a=sum;
		 System.out.println("平均值是"+ a);
		 
		 System.out.println("大於平均值的數" );
		 
		 for(int i=0;i<intArray.length;i++)
			 
		 if(a<intArray[i]) 
		 {
		 System.out.print(intArray[i]+ " ");
		 }
			
	}

}
