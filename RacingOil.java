
public class RacingOil extends KartShoppingDecorator {
		
	public RacingOil(KartReceipt kartreceipt) {
		this.kartReceipt = kartreceipt;
	}	
	
	public String getDescription() {
		return kartReceipt.getDescription() + ", Racing Oil";	}
		
	public double cost() {
		return 20.94 + kartReceipt.cost();
		
	}
}
