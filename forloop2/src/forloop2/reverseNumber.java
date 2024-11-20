package forloop2;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=998;
		int r=0;
		int rev=0;
		int d=0;
		while(n>0) {
			r=n%10; //8 9 9
			d=n/10;//89
			 rev=10*rev+r;//0+8 10*8+9 89*10+9
			 n=d;
			 System.out.print(r);
			 
		}

	}

}
