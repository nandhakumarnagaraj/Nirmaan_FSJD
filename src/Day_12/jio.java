package Day_12;

public class jio extends Mobile {
	String jio;
	
	public jio(String jio,String sim, String modelNo) 
	{
		super(sim,modelNo);
		this.jio=jio;
	}
	
	@Override
	public void displaymobile() {
		// TODO Auto-generated method stub
		System.out.println("sim="+sim);
		System.out.println("MNo="+modelNo);
		System.out.println("network="+jio);
	
	}
	public void displayJio() {
		System.out.println("jio network");
	}
	

}
