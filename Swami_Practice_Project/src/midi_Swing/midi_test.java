package midi_Swing;

import javax.sound.*;
import swami_First_Package.*;
public class midi_test {

	addition_Class a1 = new addition_Class();
	
	public void test_trycatch(){
		try{
	a1.divide(5,0);
		}
	catch(java.lang.ArithmeticException e){
		System.out.println("we caught an arithmetic exception " + e );
	}
		finally {
			System.out.println(" this will anyway execute");
		}
	}
	}	

