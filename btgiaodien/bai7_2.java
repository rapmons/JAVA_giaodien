package baitapjava;

public class bai7_2 {
	 public static boolean snt(int n)
	    {
	    	if (n<2) return false;
	    	for (int i=2;i<=Math.sqrt(n);i++)
	    		 if (n%i==0) return false;
	    	return true;
	    }
		public static void main(String[] args) {
	       System.out.println(snt(75));
		}

}
