public class BalanceOwed extends KartShoppingDecorator {
	
	
	public BalanceOwed(KartReceipt kartreceipt) {
		this.kartReceipt = kartreceipt;
		
	}
	
	public String getDescription () {
		return kartReceipt.getDescription() + ", Balance Owed";
	}
	
	public double cost() {
		return 44.00 + kartReceipt.cost();
		
	
	}

}
