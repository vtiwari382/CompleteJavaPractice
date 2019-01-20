package zPracticeJavaProgram;

public class PrintTrangle {

	
	public static void main(String[] args) {
		
		int i,j;
		
			for(i=1; i<=5; i++){    // i=5 means ractangle have 5 rows
			for(j=1; j<=i; j++){  // j=1 and j<=i means it will print  trangle shape of *
				System.out.print("*");    // this line will print * in same line until next time loop execute (do't use println)
			}
			System.out.println(" ");
		}
		
		
		
	}

}
