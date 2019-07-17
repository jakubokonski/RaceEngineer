package track;

public class TrackSegment {

    /**
     * curvature value sets modifier for curvature - higher the number slower the car should go.
     * For straight curvature value should be set to 10 (max value)
     * For sharp curves curvature value should be set to 1
     */
    private int curvature;

    public TrackSegment(int curvature) {
        this.curvature = curvature;
    }

    public int getCurvature() {
        return curvature;
    }

    @Override
    public String toString() {
        return "TrackSegment{" +
                "curvature=" + curvature +
                '}';
    }
}
