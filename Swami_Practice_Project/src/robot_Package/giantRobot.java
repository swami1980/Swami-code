package robot_Package;
//PET IS AN INTERFACE USED ACROSS PACKAGES AND ACROSS DIFFERENT CLASS TREES
import animal_Package.*;
public class giantRobot extends robot implements pet {

	public void dosurgery(){
		
	}
	
	public void play(){
		System.out.println("Play with kids");
	}
	public void befriendly(){
		System.out.println("Dont fight with people");
}
}
