package track;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackSegment> trackSegments;
    TrackSegment trackSegment;
    int lapTime = 0;
    int segmentTime;

    public Track() {
        trackSegments = new ArrayList<TrackSegment>();
    }

    public List<TrackSegment> getTrackSegments() {
        return trackSegments;
    }

    public void addSegment(TrackSegment trackSegment) {
        trackSegments.add(trackSegment);
    }


    @Override
    public String toString() {
        return "track{" +
                "trackSegmentsNo=" + trackSegments.size() +
                ", trackSegments=" + trackSegments.toString() +
                '}';
    }
}
