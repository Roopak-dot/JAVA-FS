package operatorsProject;

public class Operators {
	
	float a = 10.5f;
	int b = 10;
	
	int jay = 21;
	int veeru = 22;
	
	void add() {
		
		int c = (int)a+b;
		System.out.println(c);
	}
	
	void sub() {
		
		int c = (int)a-b;
		System.out.println(c);
	}
	
	void mul() {
		
		int c = (int)a*b;
		System.out.println(c);
	}
	
	void div() {
	
		float c = a/b;
		int val = 123;
		int div = 123/10;
		
		System.out.println(c);
		System.out.println(div);
	}
	
	void modulo() {

		float c = a%b;
		int val = 123;
		int modulo = 123%10;
		System.out.println(c);
		System.out.println(modulo);
	}
	
	void relOper() {
		
		if(jay > veeru) {
			System.out.println("jay is elder");
		} else if(jay < veeru) {
			System.out.println("jay is smaller");
		} else if(jay == veeru){
			System.out.println("both are equal");
		}
	}
	
	void logical() {
		
		boolean jay = true;
		boolean viru = false;
		
		boolean goa = jay && viru;
		boolean agra = jay || viru;
		boolean shimla = !viru;
		
		System.out.println(goa);
		System.out.println(agra);
		System.out.println(shimla);
	}
}
