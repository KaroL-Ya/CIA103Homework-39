package hw2; //請設計一隻Java程式,輸出結果為以下:
//	A
//	BB
//	CCC
//	DDDD
//	EEEEE
//	FFFFFF

public class hw7 {
	public static void main(String[] args) {
		for(int i=0; i<=5;i++) {
	    for ( int j = 0; j <= i; j++) {
	       int a=65+i;
	       char p =(char)a;
	       System.out.print(p);
	    	
	    }	
			
	    System.out.println();
			
		}
		
		
		
		
	}
}
