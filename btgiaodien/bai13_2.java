package baitapjava;

public class bai13_2 {
	public static void kt(int m)
	{
    	int x=0,y=1,z=0, d=1;
    	while(z<m){
    		z=x+y;x=y;y=z;
    		d++;
    		}
    	if(z==m) System.out.println(m+ " la so FIBONACI va o vi tri thu "+ d+" trong day");
    	else System.out.println(m+" Khong phai la so FBONACI");
    }
	public static void main(String[] args) {
		kt(6);
	}

}
