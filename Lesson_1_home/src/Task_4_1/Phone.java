package Task_4_1;

public class Phone {

	private String number;

	public Phone(String number) {
		this.number = number;
	}

	public Phone() {
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void call(Network myNetork, String number) {
		System.out.println("Call from : " + this.number + " to : " + number + ", network = " + myNetork.getName());
		myNetork.call(this.number, number);
	}

	public void incoming(String numberFrom) {
		System.out.println("(Good) Number : " + number + " is incoming, from : " + numberFrom);
	}

	public void registerInNetwork(Network network) {
		network.addNumber(number);
	}
}
