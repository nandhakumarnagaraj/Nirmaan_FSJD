package Day_12;

public  abstract class Mobile {
	String sim;
	String modelNo;
	
	public Mobile() {
	
	}
	public Mobile(String sim,String modelNo) {
		this.sim=sim;
		this.modelNo=modelNo;
	}
	public abstract void  displaymobile();
	
}
