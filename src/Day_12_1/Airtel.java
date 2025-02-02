package Day_12_1;

public class Airtel implements NetworkProvider {

	@Override
	public void makeCall(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Airtel: Making call to"+ phoneNumber);

	}

	@Override
	public void sendSMS(String phoneNumber, String message) {
		// TODO Auto-generated method stub
		System.out.println("Airtel : Sending SMS to: " +phoneNumber +"-" +message);

	}

	@Override
	public void browseInternet() {
		// TODO Auto-generated method stub
		System.out.println("Airtel : Browsing the internet.");

	}

}
