package day3;

public class Primenumber {
	public static void main(String[] args) {
		int n=9;
		int count=0;
		if(n<=1) {
			System.out.println("The Number is not Prime ");
			return;
		}
		for (int i = 1; i <=n/2; i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if (count>1) {
			System.out.println("The Number is not Prime");
		}
		else {
			System.out.println("The Number is Prime");
		}
		
	}

}
