package bathroom_package;

public class bubbles {
	
	// instance variables are the things which bubble "HAS" .. Its a "HAS A" relationship
	public int radius;
	public int size;
	enum color{black,White};
	
	public void Float(){
		color c;
		c = color.black;
    switch (c){
    case black :
    if ((size <=1) && (radius <=2)) {
    	System.out.println("small black bubble");
        }
    else {
    	System.out.println("Big black bubble");
    	
    }
    }
	}
 public boolean transparent (boolean y) {
	 return y;
	 
 }
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	 
}
