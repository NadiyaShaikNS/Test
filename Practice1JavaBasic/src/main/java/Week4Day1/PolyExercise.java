package Week4Day1;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PolyExercise {
	
	public void reportStep(String msg, String status) {
		System.out.println(msg+status);
		}
	public void reportStep(String msg, String status, Boolean span)
	{
		System.out.println(msg+status+span);
		}
	public static void main(String[] args) {
		
		PolyExercise overridingEX = new PolyExercise();
		overridingEX.reportStep("This is Version 1.1", "Updated", true);
	}
	
}
