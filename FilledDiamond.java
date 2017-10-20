import java.util.Scanner;
public class FilledDiamond {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Side Length of the diamoind: ");
		int sideLength = in.nextInt();
		for(int i=1;i<=sideLength;i++){
			for(int b=sideLength-i;b>0;b--)System.out.print(" ");
			for(int r=0;r<2*i-1;r++)System.out.print("*");
			System.out.println();
		}
		for(int i=1;i<sideLength;i++){
			for(int b=0;b<i;b++)System.out.print(" ");
			for(int r=2*(sideLength-i)-1;r>0;r--)System.out.print("*");
			System.out.println();
		}
		
	}

}
