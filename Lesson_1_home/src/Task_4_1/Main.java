package Task_4_1;

public class Main {

	public static void main(String[] args) {

		Network myNetork = new Network("MTS");

		Phone myPhone = new Phone("095-215-97-16");
		myPhone.registerInNetwork(myNetork);

		Phone friendPhone = new Phone("050-015-66-00");
		friendPhone.registerInNetwork(myNetork);

		// good
		myPhone.call(myNetork, "050-015-66-00");

		System.out.println("");

		// bad
		myPhone.call(myNetork, "111-222-33-44");
	}

}
