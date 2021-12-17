package baitapjava;

public class bai12_2 {
	 public static int sfbn(int n) {
	        if (n < 0) {
	            return -1;
	        } else if (n == 0 || n == 1) {
	            return n;
	        } else {
	            return sfbn(n - 1) + sfbn(n - 2);
	        }
	    }
		public static void main(String[] args) {
			System.out.println("100 so fibonaci dau tien: ");
	        for (int i = 0; i < 100; i++) {
	            System.out.print(sfbn(i) + " ");
	        }
		}


}
