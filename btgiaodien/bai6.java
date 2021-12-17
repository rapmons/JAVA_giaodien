package baitapjava;

public class bai6 {
	public static void main(String[] args)
	{
		int a = 2;
		int b = 10;
		int t;
		if(b<=18) t = (b-a)*45000;
		else t = (b-18)*60000+(18-a)*45000;
		System.out.print("So tien: " + t+ "VND");
	}

}
