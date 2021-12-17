package baitapjava;

public class bai4 {
	public static void main(String[] args)
	{
		double a = 1, b = 2, c = 3;
		double d = 2, e = 1, f = 12;
		double S, Sx, Sy;
		S= a*e-d*b;
		Sx = c*e-b*f;
		Sy = a*f-c*d;
		if(S == 0) 
		{
			if(Sx + Sy == 0) System.out.println("Vo so nghiem !");
			else System.out.println("Vo nghiem!");
		}
		else
		{
			System.out.println("phuong trinh co nghiem duy nhat: x = " + Sx/S + ", y = " + Sy/S);
		}
	}

}
