package forloop2;

public class displayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=2368999;
int Remaindernumber=0;
int dividedNumber=0;
int i=0;
double a=0;
while(n>0) {
	Remaindernumber=n%10;
	dividedNumber=n/10;
	n= dividedNumber;
	System.out.println(Remaindernumber);
	
}

	

	}

}
