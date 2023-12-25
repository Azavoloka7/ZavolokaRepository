package javaAbstraction;

import java.util.Objects;

public class Circle extends GraphicObject {

	private int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("Drawing a circle with radius: " + radius);
	}

	@Override
	void resize() {
		int newRadius = radius * 2;
		System.out.println("Resizing the circle to new radius: " + newRadius);
		this.radius = newRadius;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (obj == null || getClass() != obj.getClass()) return false;
		Circle circle = (Circle) obj;
		return radius == circle.radius;
	}

	@Override
	public String toString() {
		return "Circle{"+"x=" + x +", y="+y+", radius="+radius+'}';
	}
}
