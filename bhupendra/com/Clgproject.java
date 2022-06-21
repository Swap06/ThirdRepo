package bhupendra.com;

public class Clgproject {
	int math;
	int phy;
	int chem;
public Clgproject(int math, int phy, int chem) {
	this.math=math;
	this.phy=phy;
	this.chem=chem;


}
public void m1(){
	System.out.println("math="+ math+"   ");
	
	
	System.out.println("phy="+ phy+"  ");
	
	
	System.out.println("chem="+ chem+"  ");
	System.out.println("total mark of student="+(math+phy+chem));
}
public static void main(String[] args) {
	Clgproject tina=new Clgproject(78,67,65);
	Clgproject mina=new Clgproject(43,69,78);
	Clgproject bina=new Clgproject(34,98,43);
	tina.m1();
	
	mina.m1();
	bina.m1();
	
}

}
