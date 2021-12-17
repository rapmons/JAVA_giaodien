package baitapjava;

public class bai4_2 {
	 public static int gg(int n)
	    {
	    	int s=1;
	    	while (n>=1)
	    	{
	    		s*=n;
	    		n-=2;
	    	}
	    	return s;
	    }
		public static void main(String[] args) {
	      System.out.println("gt= "+gg(2));
		}



}
