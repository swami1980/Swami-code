package animal_Package;
import swami_First_Package.*;
public class animal_launcher {
// This explains Inheritance and Polymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
dog    d1 = new dog();
dog d2 = new dog();
animal d3 = new dog();
animal a1 = new lion("Raja");
System.out.println(" i go by the name" + a1.getName());
 elephant e1 = new elephant();
vet v = new vet();
d1.decibel=40;

d1.makeNoise(); //from animal
 d1.testhierarchy(d2).befriendly();
 
d1.eat(); //from canine
d1.roam(); //from dog
d1.sleep(); // from dog

bark bs= new bark();
bs.size=10;

// make polymorphism work
a1.makeNoise();
v.vaccinate(a1);
v.vaccinate(d1);
v.vaccinate(e1);
d1.play();
System.out.println(d1.getClass()); // you get this from object class.

	}

}
