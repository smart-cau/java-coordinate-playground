package fuelingUp.domain.cars;

public class K5 extends Car {

	private final int tripDistance;
	private static final int DISTANCE_PER_LITER = 13;
	private static final String CAR_NAME = "K5";

	public K5(int tripDistance) {
		this.tripDistance = tripDistance;
	}

	@Override
	double getDistancePerLiter() {
		return DISTANCE_PER_LITER;
	}

	@Override
	double getTripDistance() {
		return tripDistance;
	}

	@Override
	String getName() {
		return CAR_NAME;
	}

}
