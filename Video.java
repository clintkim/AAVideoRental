import java.util.Date;

public abstract class Video {
    public static final int REGULAR = 1;
    public static final int NEW_RELEASE = 2;
    public static final int VHS = 1;
    public static final int CD = 2;
    public static final int DVD = 3;
    protected Date registeredDate;
    protected String title;
    protected int priceCode;
    protected boolean rented;
    protected  int videoType;

    public Video(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public static Video createVideo(String title, int videoType, int priceCode, Date registeredDate) {
        switch (videoType) {
            case VHS:
                return new VHS(title, priceCode, registeredDate);
            case CD:
                return new CD(title, priceCode, registeredDate);
            default:
                return new DVD(title, priceCode, registeredDate);
        }
    }

    public abstract int getLimit();
    public abstract int getLateReturnPointPenalty();

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode){
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public int getVideoType() {
        return videoType;
    }

    public void setVideoType(int videoType) {
        this.videoType = videoType;
    }
}
