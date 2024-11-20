package forloop2;

public class CountDigits {

	public static void main(String[] args) {
		int a=558;
		int r=0;
		int d=0;
		int i=0;
		while(a >0) {
			r=a%10;// 8 5 5
			d=a/10;// 55 5
			
			a=d;
			System.out.println(r);
			i++;
			
		}
		System.out.println(i);

	}

}
