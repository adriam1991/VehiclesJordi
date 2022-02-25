package com.vehicles.project;

import java.util.Objects;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		checkWheelDiameter(diameter);
		this.brand = brand;
		this.diameter = diameter;
	}

	private void checkWheelDiameter(double diameter) throws Exception {

		if (diameter <= 0.4 || diameter >= 4)
			throw new Exception("The Wheel diameter is less than 0.4 or more than 4");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Wheel wheel = (Wheel) o;
		return Double.compare(wheel.diameter, diameter) == 0
				&& Objects.equals(brand, wheel.brand);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, diameter);
	}
}
