package Day_12_1;

public class MobileUser {
	public static void main(String[] args) {
		Airtel user1= new Airtel();
		user1.makeCall("9876543123");
		user1.browseInternet();
		Jio  user2= new Jio();
		user2.makeCall("9876543123");
		user2.browseInternet();
	}

}
