package Week3Day1;

public class NestedForLoop {

	public static void main(String[] args) {
		int input1[] = {5, 9, 7, 6};
		int input2[] = {6, 8, 5, 0};
		for ( int i =0; i< input1.length; i++) 
		{
			for (int j =0; j< input2.length; j++)
			{
				if(input1== input2);
				{
					System.out.println("intersection is:"+input1[i]);
				}
			}
		}
	}
}
