package day12.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// key , value 한쌍으로
// (Set + list) 혼합형태
// key 순서없고 중복 없다. 
public class ex03 {
	public static void main(String[] args) {
		String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

		HashMap map = new HashMap(); // <TypeParmeter> wrapper class type만 들어간다.
		
		for (int i = 0; i < data.length; i++) {
			
			if( map.containsKey(data[i]) ) {
				Integer value = (Integer)map.get(data[i]);
				
				map.put(data[i], new Integer(value.intValue() + 1)); //중복되는 부분 숫자로 count
 			} else {
				map.put(data[i],1);
 			} // if end 
		} // for end
	
		Iterator it = map.entrySet().iterator();
//		System.out.println(it);
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ( (Integer)entry.getValue() ).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
		}
	}

   public static Object printBar(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }
        return new String(bar); // String(char[] chArr)
    }
}