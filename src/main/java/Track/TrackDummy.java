package Track;

import RaceCar.RaceCar;

import java.util.ArrayList;
import java.util.List;

public class TrackDummy {

    List<TrackSegment> trackSegments;
    TrackSegment trackSegment;
    int lapTime = 0;
    int segmentTime;

    public TrackDummy() {
        trackSegments = new ArrayList<TrackSegment>();
    }

    public List<TrackSegment> getTrackSegments() {
        return trackSegments;
    }

    public void addSegment(TrackSegment trackSegment) {
        trackSegments.add(trackSegment);
    }

    public int getLapTime(RaceCar raceCar) {
        for (int segments = 0; segments < trackSegments.size(); segments++) {
            segmentTime = raceCar.getEngine().getPower() * trackSegments.get(segments).getCornering();
            lapTime = lapTime + segmentTime;
        }
        return lapTime;
    }

    @Override
    public String toString() {
        return "TrackDummy{" +
                "trackSegmentsNo=" + trackSegments.size() +
                ", trackSegments=" + trackSegments.toString() +
                '}';
    }
}
