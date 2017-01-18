package swami_First_Package;
// This program is to test array list
import java.util.ArrayList;

public class arrayList {
	
	int names  ;
	  
	public void arrtest(){
		 names=2;
	ArrayList a1 = new ArrayList<bark> (); {
		bark b1 = new bark();
		bark b2= new bark();
		a1.add(b1);
		a1.add(b2);
		System.out.println(a1.size());
		if (a1.isEmpty()){
			System.out.println("arr is empty");
		}
			else{
				System.out.println("arr has records");
				
			}
			
		ArrayList a3 = new ArrayList<String>(names);{
			//a3.add(names);
			if (a3.isEmpty()){
				System.out.println("arr3 is empty");
			}
				else{
					System.out.println("arr3 has records");
					
				}
		}
		}
		
}
	
	 
	public static void main(String args[]){
		arrayList a2 = new arrayList();
		a2.arrtest();
		
	}
	}
