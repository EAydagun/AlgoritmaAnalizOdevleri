import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashFunction {
	public static void main(String args[]) {
		// Creating Hashtable for example
		Hashtable companies = new Hashtable();
		
		companies.put("Google", "United States");
		companies.put("Nokia", "Finland");
		companies.put("Sony", "Japan");
		
		companies.get("Google");
		
		System.out.println("Does hashtable contains Google as key: "+ companies.containsKey("Google"));
		
		
		System.out.println("Does hashtable contains Japan as value: "+ companies.containsValue("Japan"));
		
		Enumeration enumeration = companies.elements();
		
		while (enumeration.hasMoreElements()) {
			System.out.println("hashtable values: " + enumeration.nextElement());
			
		}
		System.out.println("Is companies hashtable empty: "+ companies.isEmpty());
		
		System.out.println("Size of hashtable in Java: " + companies.size());

		Set hashtableKeys = companies.keySet();
		
		Enumeration hashtableKeysEnum = companies.keys();
		
		Enumeration hashtableValuesEnum = companies.elements();
		
		Collection hashtableValues = companies.values();
		
		companies.clear();

	}
}
