package ecpe205_delatorre;

public class TestMachine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  GUMBALL MACHINE      ");
		System.out.println("1 GUMBALL = 3 pesos ");
		GumballMachine gumballMachine = new GumballMachine();
		Person person = new Person (4);
		
		person.insertCoin(gumballMachine, 5);
		person.insertCoin(gumballMachine, 10);
		person.insertCoin(gumballMachine, 1);
		person.insertCoin(gumballMachine, 20);
		

	}

}
