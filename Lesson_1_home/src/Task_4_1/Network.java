package Task_4_1;

import java.util.ArrayList;

public class Network {

	private String name;
	private ArrayList<String> listNumber = new ArrayList<String>();

	public Network(String name) {
		this.name = name;
	}

	public Network() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addNumber(String number) {
		listNumber.add(number);
	}

	public boolean isRegisterNumber(String number) {

		for (String numb : listNumber) {
			if (number.equals(numb))
				return true;
		}

		return false;
	}

	public void call(String numberFrom, String numberTo) {
		
		if (isRegisterNumber(numberTo))
			new Phone(numberTo).incoming(numberFrom);
		else
			System.out.println("(Bad) Number : " + numberTo + " is not registered in network : " + name);
		
	}

}
