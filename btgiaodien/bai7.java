package baitapjava;

public class bai7 {
	static public void main(String[] args)
	{
		int month = 2;
		int year = 2020;
		int day = 0;
		
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2: 
			if(year % 4 == 0) day=29;
			else day = 28;
			break;
		}
		System.out.print("year: " + year + " month: " + month + " day: " + day);
}}
