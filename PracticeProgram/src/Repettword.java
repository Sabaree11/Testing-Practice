import java.util.LinkedHashMap;
import java.util.Map;

public class Repettword {
	public static void main(String[] args) {
		String s="Welcome to java class";
		String[] Spl= s.split(" ");
		
	Map<Character, Integer> ns=new LinkedHashMap<Character, Integer>();
	for (String sp:Spl) {
		if (ns.containsKey(sp)) {
			int count=ns.get(sp);
			ns.put(sp, count+1);
			
			
			
		} else {
			ns.put(sp, 1);
			

		}
		
	}
	
	}

}
 