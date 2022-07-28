package assistedpractice;
import java.util.*;
public class MapsProject {

	public static void main(String[] args) {
		
		   //Hashmap
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Rajkumar");    
	      hm.put(2,"Gopal");    
	      hm.put(3,"Durairaj");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Subash");  
	      ht.put(5,"Anbarasu");  
	      ht.put(6,"Kabilesh");  
	      ht.put(7,"Venkat");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Chennai");    
	      map.put(9,"Mumbai");    
	      map.put(10,"Delhi");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}



