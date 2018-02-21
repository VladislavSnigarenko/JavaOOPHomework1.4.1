package Task_4_1;

public class Main {

	public static void main(String[] args) {

		Network myNetwork = new Network("MTS");

		Phone myPhone = new Phone("095-215-97-16");
		myPhone.registerInNetwork(myNetwork);

		Phone friendPhone = new Phone("050-015-66-00");
		friendPhone.registerInNetwork(myNetwork);

		// good
		myPhone.call(myNetwork, "050-015-66-00");

		System.out.println("");

		// bad
		myPhone.call(myNetwork, "111-222-33-44");
	}

}
