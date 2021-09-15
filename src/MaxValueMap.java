import java.util.ArrayList;
import java.util.List;

public class MaxValueMap {

	public static List<Scenario> get() {
		List<Scenario> list = new ArrayList<>();
		list.add(new Scenario("Cenário 1", 10));
		list.add(new Scenario("Cenário 2", 15));
		list.add(new Scenario("Cenário 3", 25));
		list.add(new Scenario("Cenário 4", 50));
		list.add(new Scenario("Cenário 5", 100));
		
		return list;
	}
}
