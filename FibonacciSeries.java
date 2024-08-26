import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,n,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N : ");
		n = sc.nextInt();
		
		if(n==1)
			System.out.println(a);
		else if(n==2)
			System.out.println(a +" "+b);
		else if(n > 2)
			System.out.print(a + " "+b);
		for(int i=0;i<n-2;i++) {
			c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}

	}

}
