package forloop2;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int r=0;
		int d=0;
		int arm=0;
		int actualnum=n;
		for(int i=0;n>0;i++) {
			r=n%10;// 3 5 1
			
			d=n/10;//15 1
			
			n=d;
			
			arm +=r*r*r;
			//System.out.println(arm);
			
			
		}
	if(actualnum==arm) {
		System.out.println("it is a armstrong num");
	}else{
		System.out.println("it is not a armstrong num");
	}
	}

}
