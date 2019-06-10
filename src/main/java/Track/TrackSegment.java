package Track;

public class TrackSegment {

    /**
     * cornering value sets modifier for cornering - higher the number slower the car should go.
     * For straight cornering value should be set to 10 (max value)
     * For sharp curves cornering value should be set to 1
     */
    private int cornering;

    public TrackSegment(int cornering) {
        this.cornering = cornering;
    }

    public int getCornering() {
        return cornering;
    }

    @Override
    public String toString() {
        return "TrackSegment{" +
                "cornering=" + cornering +
                '}';
    }
}
