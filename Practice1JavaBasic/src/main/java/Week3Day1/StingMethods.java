package Week3Day1;

public class StingMethods {

	public static void main(String[] args) {
		
		String inputofchararray = "This is a sample sentence"; 
		int countofletter = 0;
		char[] inputparray = inputofchararray.toCharArray();
		System.out.println(inputparray);
		//for (int i =0 ;i< inputparray.length; i++ ) {
			//if(inputparray[i] == 'e') {
				//countofletter++;
	//System.out.println(countofletter);
		//}
	//}
	for (int i =inputparray.length-1; i>=0; i-- ) {
		System.out.println(inputparray[i]);
	}
	}
}
