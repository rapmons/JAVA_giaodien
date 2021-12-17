package baitapjava;

public class bai5 {
	public static void main(String[] args)
	{
		int a = 1, b = 2, c = 3;

		int tg=c;
		if((a>b && a<c) || (a<b && a>c)) tg=a;
		if((b>a && b<c) || (b>c && b<a)) tg=b;

		System.out.println("So trung gian la: " + tg);
	}

}
