package methodReturn;

public class Test {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		double res = c1.addTwo(10.5, -5.6);
		System.out.println(res);
		
		double res2 = c1.average(15, 15);
		
		System.out.println(c1.discount(100, 89));

	}

}
