package hierarchicalInheritance;

public class HierarchicalInheritanceExample {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.greet();
		c1.message1();

		Child2 c2 = new Child2();
		c2.greet();
		c2.message2();
	}
}
