
public class Scenario {
	
	private String description;
	private Integer maxValue;
	
	public Scenario(String description, Integer maxValue) {
		this.description = description;
		this.maxValue = maxValue;
	}

	public String getDescription() {
		return description;
	}

	public Integer getMaxValue() {
		return maxValue;
	}
	
}