package swami_First_Package;

   public  class bark {
	   public bark(){
	   if (size==0){
		   System.out.println(" we have an issue here");
	   }
	   }
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int size;
	String breed;
	
	public void bark(){
		if( size >= 10){
			System.out.println("Giant dog 1");
		}
		else if ( size  > 5 && size <= 8)  {
			System.out.println("Medium dog");	
		}
		else if ( size  > 2 && size <= 5)  {
			System.out.println("Small dog");	
		
	}
	}
}
