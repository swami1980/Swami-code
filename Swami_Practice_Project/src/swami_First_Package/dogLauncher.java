package swami_First_Package;

public class dogLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		dogArray[] Dogs;
		 
		 
		Dogs = new dogArray[4];
		 
		Dogs[0] = new dogArray();
		Dogs[0].name ="Ceaser";
		try{
		Dogs[5].Bark();
		
		x =x+1;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("we caught an array out of bounds here " +e );
			e.printStackTrace();
		}

	 
		while (x < 4){
			Dogs[x] = new dogArray();
			Dogs[x].name ="Julie";
			Dogs[x].Bark();
			x =x +1;
			
			

		}
Dogs[2]= Dogs[0];
System.out.println(Dogs[2].name);
	}

}
