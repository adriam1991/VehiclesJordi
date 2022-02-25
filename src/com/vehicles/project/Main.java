package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

import Keyboard.Keyboard;

public class Main {
	private static final int BIKE = 1;
	private static final int CAR = 2;
	private static final int TRICICLE = 3;

	public static void main(String[] args) {
		try {
			int type = askVehicleType();
			Vehicle vehicle = createVehicle(type);
			addWheels(vehicle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Vehicle createVehicle(int type) throws Exception {
		String brand = askCarBrand();
		String plate = askCarPlate();
		String color = askCarColor();
		if (type == BIKE)
			return new Bike(plate, brand, color);
		else if (type == CAR)
			return new Car(plate, brand, color);
		else if (type == TRICICLE)
			return new Tricicle(plate, brand, color);
		else
			throw new Exception("It is not a car or a bike");
	}

	private static void addWheels(Vehicle vehicle) throws Exception {
		List<Wheel> frontWheels = createWheels(vehicle.getNumFrontWheels());
		List<Wheel> backWheels = createWheels(vehicle.getNumBackWheels());
		vehicle.addWheels(frontWheels, backWheels);
	}

	public static List<Wheel> createWheels(int numOfWheels) throws Exception {
		List<Wheel> backWheels = new ArrayList<Wheel>();

		for (int i = 0; i < numOfWheels; i++) {
			Wheel wheel = createWheel();
			backWheels.add(wheel);
		}
		return backWheels;
	}

	public static Wheel createWheel() throws Exception {
		String brand = askBrandWheel();
		Double diameter = askWheelDiameter();
		return new Wheel(brand, diameter);
	}

	private static int askVehicleType() throws Exception {
		System.out.println("Write the vehicle you want ('bike' , 'car' or 'tricicle'): ");
		String option = Keyboard.readString();
		if (option.equals("bike"))
			return BIKE;
		if (option.equals("car"))
			return CAR;
		if (option.equals("tricicle"))
			return TRICICLE;
		else
			throw new Exception("The written text must be 'bike' or 'car'!");
	}

	private static String askBrandWheel() {
		System.out.println("Write the wheel brand: ");
		return Keyboard.readString();
	}

	private static Double askWheelDiameter() {
		System.out.println("Write the front wheel diameter: ");
		return Keyboard.readDouble();
	}

	private static String askCarPlate() {
		System.out.println("Write the vehicle plate: ");
		return Keyboard.readString();
	}

	public static String askCarBrand() {
		System.out.println("Write the vehicle brand: ");
		return Keyboard.readString();
	}

	public static String askCarColor() {
		System.out.println("Write the vehicle color: ");
		return Keyboard.readString();
	}
}