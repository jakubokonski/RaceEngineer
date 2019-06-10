public class TrackSegmentOLD {

    private int position;
    private int speedMod;
    private int length;

    public TrackSegmentOLD(int position, int speedMod, int length) {
        this.position = position;
        this.speedMod = speedMod;
        this.length = length;
    }

    public int getPosition() {
        return position;
    }

    public int getSpeedMod() {
        return speedMod;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "TrackSegmentOLD{" +
                "position=" + position +
                ", speedMod=" + speedMod +
                ", length=" + length +
                '}';
    }
}
