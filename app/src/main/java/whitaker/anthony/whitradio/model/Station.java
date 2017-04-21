package whitaker.anthony.whitradio.model;

/**
 * @author Anthony Whitaker.
 */
public class Station {

    private final int titleId;
    private final int imageId;

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
