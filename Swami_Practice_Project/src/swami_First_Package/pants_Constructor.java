package swami_First_Package;

public class pants_Constructor extends dress_constructor {
int size;
String color;

	public pants_Constructor(){
		size= 40;
		System.out.println("this is pant from default constructor  " + size);
	}

	public pants_Constructor(int size, String color) {
		 
		this.size = size;
		this.color = color;
		System.out.println("this is pant from user input constructor " + size + "," + color);
	}
	
}
