package swami_First_Package;

public class playerGame {
	int number;
	
	public int numReturn() {
		number = (int) (Math.random() *10);
		System.out.println("The number which i have choosen is " + number);
		return number;
	}


}
