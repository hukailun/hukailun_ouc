package lianxi1;

public class lianxi1_1 {

	public static void main(String args[]){
		Number n = new Number();
		System.out.println(n.addition());
		System.out.println(n.subtration());
		System.out.println(n.multiplication());
		System.out.println(n.division());
		
		
	}
}

class Number{
	private int n1,n2;
	Number(){
		n1 = 4;
		n2 = 2;
	}
	int addition(){
		return n1+n2;
	}
	int subtration(){
		
		return n1-n2;
	}
	int multiplication(){
		return n1*n2;
	}
	int division(){
		return n1/n2;
	}
}