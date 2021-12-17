package baitapjava;

public class bai8_2 {
	 public static boolean scp(int n)
	    {
	    	int i=(int)(Math.sqrt(n));
	    	if (i*i==n) return true;
	    	else return false;
	    }
		public static void main(String[] args) {

	     System.out.println(scp(23));
		}

}
