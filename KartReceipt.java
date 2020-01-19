public abstract class KartReceipt {
	
	String description = "Total Cost of Kart Parts";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();	

}
