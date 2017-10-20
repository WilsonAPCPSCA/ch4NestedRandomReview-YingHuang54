
public class MultiplicationTable {

	public static void main(String[] args) {
		for(int i =1;i<=10;i++){
			for(int c=1;c<=10;c++){
				if(c*i<10)System.out.print(" ");
				if(c*i<100)System.out.print(" ");
				System.out.print(c*i+" ");
			}
			System.out.println();
		}
	} 

}
