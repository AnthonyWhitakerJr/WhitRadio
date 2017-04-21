package whitaker.anthony.whitradio.model;

/**
 * @author Anthony Whitaker.
 */
public class Station {

    private static final String DRAWABLE = "drawable/";
    private int titleId;
    private int imageId;

    public Station(int titleId, int imageId) {
        this.titleId = titleId;
        this.imageId = imageId;
    }

    public int getTitleId() {
        return titleId;
    }

    public int getImageId() {
        return imageId;
    }
}
