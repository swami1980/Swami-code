public class testLoop{
public static void main(String [] args){
int a =10 , b =20;
int c = a + b;
int testday =2;
int daytoreturn=1;
testLoop t1 = new testLoop();
System.out.println("Value of C is " + c);
t1.testif();
t1.testWhile(daytoreturn);
}
public void testif(){
	int day =20;
	if (day ==1){
		System.out.println("Sunday");
	}
	else {
		System.out.println("Some other day");
	}		
	}
public int testWhile(int d){
	 int day =3;
	while (day != 0){
	 
	if (d ==1){
		System.out.println("This is monday");
	}
	
}
return d;
}
}