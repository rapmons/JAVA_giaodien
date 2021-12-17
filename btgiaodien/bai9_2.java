package baitapjava;

public class bai9_2 {
	public static boolean dx(int n)
    {
    	int a=n;
    	int s=0;
    	while (a!=0)
    	{
    		s=s*10 +a%10;
    		a=a/10;
    	}
    	if (s==n) return true;
    	else return false;
    	
    }
	public static void main(String[] args) {
         System.out.println(dx(12321));

	}


}
