package baitapjava;

public class bai2_2 {
	public static double gt(float n)
	{
		float s=1;
		for(int i=1;i<=n;i++) s*=i;
		return s;
	}
    public static float tong (int n)
    {
    	float i;
    	float s=15;
    	for ( i=1;i<=n;i++) s+=(Math.pow(-1,i))/gt(i);
    	return s;
    }
	public static void main(String[] args) {
		System.out.println("tong s= "+tong(5));
	}

}
