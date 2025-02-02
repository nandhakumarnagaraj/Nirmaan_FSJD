package Day_12_1;

public interface NetworkProvider {
	void makeCall(String phoneNumber);

	void sendSMS(String phoneNumber, String message);

	void browseInternet();

}
