import java.util.Iterator;
import java.util.Random;

public class RejectedNumbersCalculator {
	
	public Integer calculate(Scenario scenario) {
		
		Random random = new Random();
		int rejectedNumbers = 0;
		int randomNumber = 0;
		boolean didNotGenerateSameNumber;
		
		for (int i = 0; i < Main.ID.length(); i++) {
			int currentNumber = Character.getNumericValue(Main.ID.charAt(i));
			didNotGenerateSameNumber = true;
			
			while ( didNotGenerateSameNumber ) {
				randomNumber = random.nextInt(scenario.getMaxValue());
				if(currentNumber == randomNumber) {
					didNotGenerateSameNumber = false;
				}
				else {
					rejectedNumbers++;
				}
			}
			
		}
		return rejectedNumbers;
	}

}
