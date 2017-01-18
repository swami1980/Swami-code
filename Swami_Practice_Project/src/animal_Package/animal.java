package animal_Package;

public abstract class  animal   {
	String picture;
	enum food{Meat,Grass} ;
	int hunger;
	int [][] boundries;
	int[][] location;
	int decibel;
	private String name;
	
public animal(){
	
}
	public animal(String name2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise(){
		 
		 
		
		if (decibel >100) {
			System.out.println("Its a elephant's trumphet");
			
		}
		else if (decibel <=100 && decibel >80) {
			System.out.println("Its a Lion's roar");
		}
		else if (decibel <=80 && decibel >50) {
			System.out.println("Its a fox howl");
		}	
		
		else if (decibel <=50 && decibel >20) {
			System.out.println("Its a hippo");
		}
		else if (decibel <=20  )  {
			System.out.println("I am a domestic animal");
		}
	}
	
	//JUST TO TEST OVERLOADING
	 public int makenoise(int a){
		System.out.println("testing overloading");
	 	return a;
	 	
		
 	}
	public abstract void eat();
	 
	public abstract void sleep();
	
	public abstract void roam();
	
	public int getDecibel() {
		return decibel;
	}

	public void setDecibel(int decibel) {
		this.decibel = decibel;
	}
	
}
