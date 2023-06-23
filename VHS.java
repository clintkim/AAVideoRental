import java.util.Date;

public class VHS extends Video {

	public VHS(String title, int priceCode, Date registeredDate) {
		super(registeredDate);
		this.setTitle(title) ;
		this.setPriceCode(priceCode) ;
	}

	@Override
	public int getLimit() {
		return 5;
	}
	@Override
	public int getLateReturnPointPenalty() {
		return 1;
	}
}
