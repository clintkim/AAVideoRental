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

    public abstract int getLateReturnPointPenalty();

    public abstract int getPriceCode();

    public abstract void setPriceCode(int priceCode);

    public abstract String getTitle();

    public abstract void setTitle(String title);

    public abstract boolean isRented();

    public abstract void setRented(boolean rented);

    public abstract Date getRegisteredDate();

    public abstract void setRegisteredDate(Date registeredDate);

    public abstract int getVideoType();

    public abstract void setVideoType(int videoType);
}
