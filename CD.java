import java.util.Date;

public class CD extends Video {

	public CD(String title, int priceCode, Date registeredDate) {
		super(registeredDate);
		this.setTitle(title) ;
		this.setPriceCode(priceCode) ;
	}

	@Override
	public int getLimit() {
		return 3;
	}

	@Override
	public int getLateReturnPointPenalty() {
		return 2;
	}
}
