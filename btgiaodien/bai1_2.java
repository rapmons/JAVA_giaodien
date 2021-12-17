package baitapjava;

public class bai1_2 {
	 public static float tong(int n)
	    {
	    	float i;
	    	float s=1;
	    	for (i=2;i<=n;i++) s+=(1/i);
	    	return s;
	    }
		public static void main(String[] args) {
			
	     System.out.print("Tong: "+tong(8));
		}


}
