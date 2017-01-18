package animal_Package;

public abstract class canine extends animal {
	 
	public canine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void eat(){
	 food f;
	 f=food.Meat;
	 System.out.println("We eat " + f);
	}
		public abstract void sleep();
	
	public abstract void roam();
	public dog testhierarchy(dog test1){
		//	System.out.println("test this in another method");
			return test1;
}
}
