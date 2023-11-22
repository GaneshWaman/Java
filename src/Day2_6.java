//6. Accept two numbers and calculate GCD of them.

public class Day2_6 {
	
	public static void main(String[] args) {
		Day2_6 d=new Day2_6();
		d.gcd(24, 18);
	}
	
	public void gcd(int n1, int n2) {
		int a;
		
		if (n1<n2)
			a=n1;
		else
			a= n2;
		for (int i=a; i>=2;i--) {
			if ((n1%i==0) &&(n2%i ==0)) {
				System.out.println("GCD : "+ i);
				break;
			}
			
		}
	}

}
