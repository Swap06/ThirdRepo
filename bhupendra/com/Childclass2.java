package bhupendra.com;

public class Childclass2 extends Childclass{
	int a=30;

	public void m1() {
		
		System.out.println(a);
		System.out.println(super.a);
		Parentclass b=new Parentclass();
	    System.out.println(b.a);
	}
	public static void main(String[] args) {
		Childclass2 c=new Childclass2();
		c.m1();
	}
}
