package Day_12;

public class mobileobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile M1=new airtel("Airtel", "qwertyujv", "airtel");
		Mobile m2=new jio(null, null, "jio");
		M1.displaymobile();
		m2.displaymobile();
		airtel a1= new airtel(null, null, null);
		a1.displayairtel();
		jio j1=new jio(null, null, null);
		j1.displayJio();
		
	}

}
