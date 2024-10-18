package tester;

import com.app.geometry.Point2D;

public class TestPointclass {
	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		p1.accept();
		p2.accept();
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		boolean status = false;
		if (p1.isEquals(p2)) {
			status = true;
			System.out.println("Both points are at same location!");
			System.out.println(status);
		} else {
			double distance = p1.calculateDistance(p2);
			System.out.println(distance);
		}
	}
}
