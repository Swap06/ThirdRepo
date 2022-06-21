package bhupendra.com;
public class Mconstructor {
	public Mconstructor() {
		System.out.println(" with argument");
	}
	public Mconstructor(int a) {
		this();
		System.out.println("without argument");
	}
		
		public Mconstructor(int a,int b) {
			this(6);
			System.out.println("without-2 argument");
		
	}
	public static void main(String[] args) {
		Mconstructor f=new Mconstructor(4,8);
	}
	

}
