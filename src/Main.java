import java.util.List;

public class Main {

	public static final String ID = "0175733";
	
	public static void main(String[] args) {

		int rejectedNumbers = 0;
		List<Scenario> scenarios = MaxValueMap.get();
		
		for (Scenario scenario : scenarios) {
			RejectedNumbersCalculator rejectedNumbersCalculator = new RejectedNumbersCalculator();
			rejectedNumbers = rejectedNumbersCalculator.calculate(scenario);
			printResult(scenario, rejectedNumbers);
		}
	}
	
	private static void printResult(Scenario scenario, int rejectedNumbers) {
		System.out.println(scenario.getDescription() 
				   + " com numero maximo de " 
				   + scenario.getMaxValue()
				   + ", teve "
				   + rejectedNumbers + " numeros rejeitados");		
	}

}
