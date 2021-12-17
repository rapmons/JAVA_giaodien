package baitapjava;

public class bai3_2 {
	public static float tong(float n)
    {
    	float s=1, a=1;;
    	float i=3;
    	while (i<=2*n+1)
    	{   a=a/(i*(i-1));

    		s+=a;
    		i+=2;
    	}
    	return s;
    }
	public static void main(String[] args) {
		System.out.println("tong S=" + tong(2));
	}


}
