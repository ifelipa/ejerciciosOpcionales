package ex1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashExample {

	


	    public static void main(String[] args) {
	        Set<String> hs=new HashSet<String>();
	        hs.add("hvinod");
	        hs.add("santhosh");
	        hs.add("ajay");
	        hs.add("2ajay");
	      

	        Set<String> ts=new TreeSet<String>();
	        ts.add("vinod");
	        ts.add("santhosh");
	        ts.add("ajay");
	      

	        Set<String> ls=new LinkedHashSet<String>();
	        ls.add("vinod");
	        ls.add("santhosh");
	        ls.add("ajay");
	       

	       System.out.println("Hashset "+hs); //No order
	        System.out.println("TreeSet "+ts);//Natural ordering
	        System.out.println("LinkedHashSet "+ls); // Insertion order

	    }

	
}
