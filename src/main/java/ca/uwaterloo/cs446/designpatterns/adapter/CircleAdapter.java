package ca.uwaterloo.cs446.designpatterns.adapter;

public class CircleAdapter implements Shape {
    private Circle adaptee;
	
	public CircleAdapter(Circle circle) {
		this.adaptee = circle;
	}

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int midX =  (x1 + x2) / 2;
        int midY = (y1 + y2) / 2;
        int radius = (int) Math.round(Math.hypot(midX - x1, midY - y1));
        adaptee.draw(midX, midY, radius);
    }
}
