import java.util.ArrayList;
import java.util.List;

public class MaxValueMap {

	public static List<Scenario> get() {
		List<Scenario> list = new ArrayList<>();
		list.add(new Scenario("Cen�rio 1", 10));
		list.add(new Scenario("Cen�rio 2", 15));
		list.add(new Scenario("Cen�rio 3", 25));
		list.add(new Scenario("Cen�rio 4", 50));
		list.add(new Scenario("Cen�rio 5", 100));
		
		return list;
	}
}
