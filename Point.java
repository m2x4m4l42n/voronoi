// a point in 2D, sorted by y-coordinate
public class Point implements Comparable <Point>{
	
	double x;
	double y;
	
	Point(double x0, double y0) {
		x = x0;
		y = y0;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point){
			Point p = (Point) obj;
			return p.x == x && p.y == y;
		}else
			return super.equals(obj);
	}

	public int compareTo (Point other) {
		if (this.y == other.y) {
			if (this.x == other.x) return 0;
			else if (this.x > other.x) return 1;
			else return -1;
		}
		else if (this.y > other.y) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
