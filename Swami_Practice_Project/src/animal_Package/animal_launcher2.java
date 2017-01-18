package animal_Package;

//This uses Iterator and List Iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class animal_launcher2 {

	 
	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
		   
ArrayList<animal> a1  =new ArrayList<animal> ()  ;
 animal  d1 =  new dog();
 animal l1 = new lion("raja");
 animal e1 = new elephant();
 animal currentanimal = null;
  a1.add(d1);
  a1.add(l1);
  a1.add(e1);
 //for (int i =1 ;i <= a1.size() ;i++){
 
  
	 
  Iterator<animal>  itr = a1.iterator();
    ListIterator<animal>  itr1 = a1.listIterator();
  while (itr.hasNext()) {
     currentanimal = itr.next();
     currentanimal.makeNoise();
    // itr1.set(currentanimal =d1);
    
  } 
	 
	  
  }
  
	}


