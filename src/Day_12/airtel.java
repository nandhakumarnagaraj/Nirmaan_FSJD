package Day_12;

public class airtel extends Mobile {
	String network;
	
	
	public airtel(String sim,String modelNo,String network) {
	super(sim,modelNo);
	this.network=network;
	}

	@Override
	public void displaymobile() {
		System.out.println("sim="+sim);
		System.out.println("MNo="+modelNo);
		System.out.println("network="+network);
		
	}
	public void displayairtel() {
		System.out.println("airtel network");
	}
	
	

}
