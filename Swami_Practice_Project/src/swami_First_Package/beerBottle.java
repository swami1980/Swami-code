public class beerBottle{
public static void main(String [] args){
int bottles = 0;
int count=10;
String word = "bottles";
while (bottles <100){
// while needs to be a  block
if (bottles ==0){
word ="bottle";
bottles ++;
//System.out.println("This is " + bottles +"," + word);
System.out.println("This is " + bottles +"," + word);
}
else if ( bottles != 0) {
word ="bottles";
bottles ++;
System.out.println("This is " + bottles +"," + word);
if ((bottles%count) == 0){
System.out.println("You have reached a landmark");
}
}
}
}
}