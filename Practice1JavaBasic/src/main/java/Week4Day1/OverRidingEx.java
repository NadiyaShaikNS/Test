package Week4Day1;

public class OverRidingEx extends PolyExercise{
	
	public void reportStep(String msg, String status) {
		System.out.println(msg+" "+status);
		}
	public void reportStep(String msg, String status, Boolean span)
	{
		System.out.println(msg+status+span);
		}
public static void main(String[] args) {
	OverRidingEx ORE = new OverRidingEx();
    ORE.reportStep("Version 1.0", "old");	
}
	
}
