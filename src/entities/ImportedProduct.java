package entities;

public class ImportedProduct extends Product{
	
	private double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")");
		return sb.toString();
	}

}
