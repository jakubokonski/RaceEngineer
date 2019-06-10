import java.util.List;

public class TrackOLD {

    List<TrackSegmentOLD> trackSegments;
    double lapTime;

    public TrackOLD(List<TrackSegmentOLD> trackSegments) {
        this.trackSegments = trackSegments;
    }

    public double getLapTime() {
        trackSegments.get(0).getSpeedMod();
        //getLapTime Logic here!
        return lapTime;
    }
}
