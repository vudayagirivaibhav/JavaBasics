package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"a", "b", "c"};
	    String b[] = {"d", "e" };

	    List<String> list = new ArrayList<String>(Arrays.asList(a));
	    list.addAll(Arrays.asList(b));
	    Object [] c = list.toArray();
	    System.out.println(Arrays.toString(c));
	}

}
