import Track.TrackSegment;
import Track.Track;

public class RaceConstructor {
    public static void main(String[] args) {

        Track trackDummy = new Track();
        trackDummy.addSegment(new TrackSegment(10));
        trackDummy.addSegment(new TrackSegment(5));
        trackDummy.addSegment(new TrackSegment(10));
        trackDummy.addSegment(new TrackSegment(5));

        System.out.println("Track: " + trackDummy.toString());
        System.out.println("Track index test: " + trackDummy.getTrackSegments().get(0));


    }
}
