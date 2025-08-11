package methodReturn;

public class Calculator {
	
	//Nidhee
	double addTwo(double a, double b) {
		double sum = a+b;
		System.out.println("Addition = " +sum);
		return sum;
	}
	
	//Sai
	double average(double a, double b) {
		Calculator c1 = new Calculator();
		double s = c1.addTwo(a, b);
		double avg = s/2;
		System.out.println(avg);
		return avg;
	}
	
	double discount(double a, double b) {
		Calculator c1 = new Calculator();
		double av = c1.average(a,b);
		double disc = av - (av*10/100);
		System.out.println(disc);
		return disc;
	}

}
