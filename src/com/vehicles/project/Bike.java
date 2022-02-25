package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addOneWheel(frontWheels);
		addOneWheel(backWheels);
	}

	public int getNumFrontWheels() {
		return 1;
	}

	public int getNumBackWheels() {
		return 1;
	}

	@Override
	protected void checkPlate(String plate) throws Exception {

		if(!plate.matches("[0-9]{3}[A-Z]{2}")) {
			throw new Exception();
		}

	}

}
