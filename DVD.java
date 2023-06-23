import java.util.Date;

public class DVD extends Video {

	public DVD(String title, int priceCode, Date registeredDate) {
		super(registeredDate);
		this.setTitle(title) ;
		this.setPriceCode(priceCode) ;
	}

	@Override
	public int getLimit() {
		return 2;
	}
	@Override
	public int getLateReturnPointPenalty() {
		return 3;
	}
}
