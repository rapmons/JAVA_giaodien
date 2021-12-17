package baitapjava;

public class bai6_2 {
	public static int UCLN(int a, int b)
	{
		while (a!=b)
		{
			if (a>b) a=a-b;
			else b=b-a;
		}
		return a;
	}
	public static int BCNN(int a, int b)
	{
		int t=a*b;
		return t/UCLN(a,b);
	}
	public static void main(String[] args) {
		System.out.println("UCLN :"+UCLN(23,42));
		System.out.println("BCNN :"+BCNN(12,42));

	}


}
