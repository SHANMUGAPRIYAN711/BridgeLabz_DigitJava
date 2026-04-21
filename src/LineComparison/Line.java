public class Line implements Comparable<Line> {

    Point p1, p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        return Math.sqrt(
                Math.pow(p2.x - p1.x, 2) +
                        Math.pow(p2.y - p1.y, 2)
        );
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.length(), other.length());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Line)) return false;
        Line other = (Line) obj;
        return Double.compare(this.length(), other.length()) == 0;
    }
}