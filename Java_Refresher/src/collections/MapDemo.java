package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> countries = new HashMap<>();
		
		countries.put("india", "new delhi");
		countries.put("australia", "canberra");
		countries.put("turkey", "ankara");
		countries.put("japan", "tokyo");
		countries.put("russia", "masco");
		countries.put("france", "paris");
		
		System.out.println(countries);	
	}
}
