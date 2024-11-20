package forloop2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=12421;
int rev=0;
int d=0;
int r=0;
int actualnum=n;
while(n>0) {
	r=n%10;//1 3 4 2 1
	
	d=n/10;// 1243     124    12  1
	
	
	rev=(rev*10)+r; 
	n=d;
	//System.out.println(rev);
	
}
//System.out.println(rev);
//System.out.println(actualnum);
if(actualnum==rev) {
	System.out.println("it is palindrome number");
}
else {
	System.out.println("it is not a palindrome number");
}
	}

}
