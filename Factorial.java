package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		
		int fact = 1;
		
		for (int i=5;i>0;i--)
		{
				//1*5=5, 5*4=20, 20*3=60, 60*2=120, 120*1=120
				fact=fact*i;
				
				System.out.print(i+"*");
				
		}
		
		System.out.println(" = "+fact);
	}

	
}
