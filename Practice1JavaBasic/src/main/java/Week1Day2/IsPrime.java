package Week1Day2;

public class IsPrime {
	public static void main(String[] args) {
		int num = 10;
		int i = 0;
		if(num<=1) {
			
			System.out.println(i+"Not Prime");
		}
		
		for (i = 2; i<=num; i++ ) {
			
		if(num%2==0)
			
		{ 
			System.out.println(i+"Not Prime");
		}
		else
		{
			System.out.println(i+"Prime");
		}
	}
	}
}
