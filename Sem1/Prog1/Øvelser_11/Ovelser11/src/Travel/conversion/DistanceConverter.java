package Travel.conversion;

import Math.Math;

public class DistanceConverter {
    final double MILES_PER_KILOMETER = 1.61;


    public double toMiles(double kilometers) {
        return Math.multiply(kilometers, MILES_PER_KILOMETER);
    }

    public double toKilometers(double miles) {
        return Math.divide(miles, MILES_PER_KILOMETER);
    }
}
