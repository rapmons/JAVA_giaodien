package baitapjava;

public class bai3 {
	public static void main(String[] arg)
	{
		double a = 1, b = 2, c = 5;
		if(a == 0)
		{
			if(b == 0) System.out.println("Vo nghiem!");
			else if(c == 0) System.out.println("Vo so nghiem!");
			else System.out.println("Nghiem cua pt la: " + -c/b);
		}
		else
		{
			double d = b*b-4*a*c;
			if(d < 0) System.out.println("Vo nghiem !");
			if(d == 0) System.out.println("phuong trinh co nghiem kep: x = " + -b/(2*a));
			if(d > 0) System.out.println("phuong trinh co 2 nghiem phan biet: x1 = " + (-b+Math.sqrt(d))/(2*a) + 
					", x2 = " + (-b-Math.sqrt(d))/(2*a));
		}
	}
}


