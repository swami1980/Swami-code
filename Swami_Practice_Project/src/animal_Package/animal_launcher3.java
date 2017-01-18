package animal_Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class animal_launcher3 {

	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
		   
ArrayList<Object> a1  =new ArrayList<Object> ()  ;
dog  d1 =  new dog();
 lion l1 = new lion("Raja");
 elephant e1 = new elephant();
 Object currentanimal = null;
  a1.add(d1);
  a1.add(l1);
  a1.add(e1);
 //for (int i =1 ;i <= a1.size() ;i++){
  
 
	 
  Iterator<Object>  itr = a1.iterator();
  //ListIterator<animal>  itr1 = a1.listIterator();
  while (itr.hasNext()) {
     currentanimal = itr.next();
     //currentanimal.makeNoise();
    // itr1.set(currentanimal =d1);
    
  } 
	 
	  
  }
  
}
