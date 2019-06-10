import Track.TrackSegment;
import Track.TrackDummy;

public class RaceConstructor {
    public static void main(String[] args) {

        TrackDummy trackDummy = new TrackDummy();
        trackDummy.addSegment(new TrackSegment(10));
        trackDummy.addSegment(new TrackSegment(5));
        trackDummy.addSegment(new TrackSegment(10));
        trackDummy.addSegment(new TrackSegment(5));

        System.out.println("Track: " + trackDummy.toString());
        System.out.println("Track index test: " + trackDummy.getTrackSegments().get(0));


    }
}
