import java.util.Scanner;
public class FlippingCoin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of coin flips: ");
		int times = in.nextInt();
		System.out.println("Sequence of coin flips:");
		int head = 0;
		int tail = 0;
		do{
			if(Math.random()*2>=1){
				head++;
				System.out.print("H");
			}
			else{
				tail++;
				System.out.print("T");
			}
		}while(head+tail<times);
		System.out.println();
		System.out.println(head+" heads and "+tail+" tails.");
	}

}
