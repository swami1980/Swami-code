package swami_First_Package;

// this program helps understands inheritance and method overloading
public class call_addition_Class extends addition_Class{
	 
	public int multiply(int x,int y) {
		int z= x*y;
		return z;
	}
	//method overriding;
	public String multiply(String x, String y)
	{
		String z = x+y;
		return z;
	}
	
	

	// this helps understand inheritance
	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		int x=30;
		int y=40;
		
		String aa="Swami",bb="nathan",zz;
		
		addition_Class a1= new addition_Class();
		int z= a1.add(x, y);
		System.out.println("Added value is " + z);
		
		call_addition_Class m1 = new call_addition_Class();
		z=m1.multiply(x, y);
		System.out.println("Muliplied value is " + z);
		
		zz=m1.multiply(aa, bb);
		System.out.println("Concatenated value is " + zz);
		
	}

}
