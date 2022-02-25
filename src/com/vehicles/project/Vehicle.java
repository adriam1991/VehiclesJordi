package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		checkPlate(plate);
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

	protected void checkPlate(String plate) throws Exception {

		if(!plate.matches("[0-9]{4}[A-Z]{3}")) {
			throw new Exception();
		}

	}

	public abstract void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception;

	public abstract int getNumFrontWheels();

	public abstract int getNumBackWheels();

	protected void addOneWheel(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception();

		Wheel wheel = wheels.get(0);
		this.wheels.add(wheel);
	}

	protected void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

}
