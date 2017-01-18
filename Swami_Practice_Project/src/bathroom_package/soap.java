package bathroom_package;
import java.util.*;

public class soap {
public bubbles b = new bubbles();
public String shape;

enum fragrance {Musk,Lavender,Sandal};

public void cleanse(){
	
 fragrance f;
	f  = fragrance.Musk;
	if (shape == "Oval"){
	 System.out.println("Soap fragrance is " + f );
	 
	  
		 
	 
	}
}

public String getShape() {
	return shape;
}

public void setShape(String shape) {
	this.shape = shape;
}

}
