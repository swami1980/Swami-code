package animal_Package;
import swami_First_Package.*;


public class dog extends canine implements pet{
	static int d =0;
	
public dog( )
 {
	 
	  d= d+1;
	System.out.println("Number of dog objects is " + d);
}
	
public   void sleep(){
	bark bs = new bark();
	bs.size= 10;
	bs.bark();
	switch  (bs.size)	 {
	case 10 :
	System.out.println("Giant dog");
	break;
	default:
	System.out.println("Any other dog");	
	 

	}
}

	public void play(){
		System.out.println("wag your tail");
	}
	public void befriendly(){
		System.out.println("Dont bark at people");
	 
	}
	
	
		

	public void roam(){
	System.out.println("I roam in cities, i am a Dog");	
	}
}
