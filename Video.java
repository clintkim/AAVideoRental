import java.util.Date;

public class Video extends VideoType {

	public Video(String title, int videoType, int priceCode, Date registeredDate) {
		super(registeredDate);
		this.setTitle(title) ;
		this.setVideoType(videoType) ;
		this.setPriceCode(priceCode) ;
	}

	@Override
	public int getLateReturnPointPenalty() {
		int pentalty = 0 ;
		switch ( videoType ) {
			case VHS: pentalty = 1 ; break ;
			case CD: pentalty = 2 ; break ;
			case DVD: pentalty = 3 ; break ;
		}
		return pentalty ;
	}
	@Override
	public int getPriceCode() {
		return priceCode;
	}

	@Override
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean isRented() {
		return rented;
	}

	@Override
	public void setRented(boolean rented) {
		this.rented = rented;
	}

	@Override
	public Date getRegisteredDate() {
		return registeredDate;
	}

	@Override
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	@Override
	public int getVideoType() {
		return videoType;
	}

	@Override
	public void setVideoType(int videoType) {
		this.videoType = videoType;
	}
}
