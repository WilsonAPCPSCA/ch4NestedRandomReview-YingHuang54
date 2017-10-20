import java.util.Scanner;
public class DiceSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program will simulate tossing a pair of dice.");
		System.out.print("How many times would you like the dice to be tossed? ");
		int times = in.nextInt();
		System.out.println("Here is the sequence of sumes, one for each toss: ");
		int two = 0;
		int thr = 0;
		int fou = 0;
		int fiv = 0;
		int six = 0;
		int sev = 0;
		int eig = 0;
		int nin = 0;
		int ten = 0;
		int ele = 0;
		int twe = 0;
		while(two+thr+fou+fiv+six+sev+eig+nin+ten+ele+twe<times){
			int d1=(int)(Math.random()*6+1);
			int d2=(int)(Math.random()*6+1);
			if(d1+d2==2)two++;
			if(d1+d2==3)thr++;
			if(d1+d2==4)fou++;
			if(d1+d2==5)fiv++;
			if(d1+d2==6)six++;
			if(d1+d2==7)sev++;
			if(d1+d2==8)eig++;
			if(d1+d2==9)nin++;
			if(d1+d2==10)ten++;
			if(d1+d2==11)ele++;
			if(d1+d2==12)twe++;
			System.out.print((d1+d2)+" ");
		}
		System.out.println();
		System.out.println();
		System.out.print(" 2: ");
		for(int i=0;i<two;i++)System.out.print("*");
		System.out.println();
		System.out.print(" 3: ");
		for(int i=0;i<thr;i++)System.out.print("*");
		System.out.println();
		System.out.print(" 4: ");
		for(int i=0;i<fou;i++)System.out.print("*");
		System.out.println();
		System.out.print(" 5: ");
		for(int i=0;i<fiv;i++)System.out.print("*");
		System.out.println();
		System.out.print(" 6: ");
		for(int i=0;i<six;i++)System.out.print("*");
		System.out.println();
		System.out.print(" 7: ");
		for(int i=0;i<sev;i++)System.out.print("*");
		System.out.println();
		System.out.print(" 8: ");
		for(int i=0;i<eig;i++)System.out.print("*");
		System.out.println();
		System.out.print(" 9: ");
		for(int i=0;i<nin;i++)System.out.print("*");
		System.out.println();
		System.out.print("10: ");
		for(int i=0;i<ten;i++)System.out.print("*");
		System.out.println();
		System.out.print("11: ");
		for(int i=0;i<ele;i++)System.out.print("*");
		System.out.println();
		System.out.print("12: ");
		for(int i=0;i<twe;i++)System.out.print("*");
		System.out.println();
	}
}
