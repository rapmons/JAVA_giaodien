package baitapjava;

public class bai11_2 {
	 public static boolean shh(int n)
	    {   int s=0;
	    	for (int i=1;i<n;i++) 
	    		if (n%i==0) s+=i;
	        if (n==s) return true;
	        else return false;
	    }
		public static void main(String[] args) {
	      for (int i=1;i<=1000;i++)
	    	  if (shh(i)==true )System.out.print(i+" ");
		}
}
