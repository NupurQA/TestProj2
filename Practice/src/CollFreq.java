import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//author : Nupur
public class CollFreq {
	 public static void main(String[] args) {
	
    Map<String, Integer> m = new HashMap<String, Integer>();
String s="hello this is hello to check hello freq";
String sss[]=s.split(" ");
    // Initialize frequency table from command line
    for (String a : sss) {
        Integer freq = m.get(a);
        System.out.print(" " +freq);
        
        m.put(a, (freq == null) ? 1 : freq + 1);
    }
    System.out.println();
for(String a2:sss)
{
	
	System.out.print(" "+a2);
}
    
    System.out.println(m.size() + " distinct words:");
    System.out.println(m);
    System.out.println(m.entrySet());
    Set<Entry<String, Integer>> set= m.entrySet();
    System.out.println(set);


}
}