package baitapjava;

public class bai10_2 {
	public static boolean snt(int n)
    {
    	if (n<2) return false;
    	for (int i=2;i<=Math.sqrt(n);i++)
    		 if (n%i==0) return false;
    	return true;
    }
	public static void main(String[] args) {
		for (int i=2;i<=50;i++)
			if (snt(i)==true) System.out.print(i+" ");
	}

}
