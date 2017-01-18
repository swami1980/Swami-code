package bathroom_package;

public class bathroom_launcher {
// THIS IS TO EXPLAIN "HAS A" RELATIONSHIP AMONG CLASSES
	public static void main(String[] args) {
		// TODO Auto-generated method stub
tub t1 = new tub();
soap s1 = new soap();
t1.s.b.size=3;

t1.s.b.radius=2;
t1.s.shape="Oval";
 
t1.s.b.Float();
t1.s.cleanse();
t1.comfort();
t1.clean(s1);

	}

}
