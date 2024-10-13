 
import java.util.ArrayList;
import java.util.List;
 
public class CollectionGenerics {
	public static void main(String[] args) {
    	
        List<String> stringList = new ArrayList<>();
 
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
    	
        System.out.println("Elements in the list:");
    	for (String fruit : stringList) {
            System.out.println(fruit);
    	}
    }
}
