package Week3Day1;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		int samplearray[] = {99, 23, 54, 57, 85, 20};
		int length = samplearray.length;
		System.out.println(length);
		for (int i=0; i< samplearray.length; i++)
		{
			System.out.println(samplearray[i]);
		}
		
		//int sort[];
		int sorted[] = Arrays.sort(samplearray);
		//Arrays.sort(samplearray);
		System.out.println(sorted);
		
	}
	

}
