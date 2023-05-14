package fuelingUp.domain;

import java.util.List;
import java.util.ArrayList;

import fuelingUp.domain.cars.Car;

public class RentCompany {

	private static final List<Car> cars = new ArrayList<>();

	private RentCompany() {
	}

	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public String generateReport() {
		StringBuffer reportBuffer = new StringBuffer();
		cars.forEach(car -> {
			reportBuffer.append(car.toString());
		});
		return reportBuffer.toString();
	}

}