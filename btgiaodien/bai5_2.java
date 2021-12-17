package baitapjava;

public class bai5_2 {
	public static void Tinh(int n)
	{
		int t=0,s=1;
		while (n!=0)
		{
			t+=n%10;
			s*=n%10;
			n=n/10;
		}
		System.out.println("tong=" +t);
		System.out.println("tich=" +s);

	}
	public static void main(String[] args) {
		Tinh(123);
	}
}
