/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzar;

/**
 *
 * @author 340745868
 */
public class UnitCalculator {
    private static String[] prefixString = {"exa", "peta", "tera", "giga", "mega", "kilo", "hecto", "deca", "none", "deci", "centi", "milli", "micro", "nano", "pico", "femto", "atto"};
    private static double[] prefixValue = {18, 15, 12, 9, 6, 3, 2, 1, 0, -1, -2, -3, -6, -9, -12, -15, -18};
    
    //String[] for imperial units here
    //double[] for value of imperial length units here

    private static double toMetricBaseUnit(int degreePower, double numberConvert, String unitIs) {
        double numberConverted = 0;
        for (int i = 0; i < prefixValue.length; i++) {
            if (unitIs.contains(prefixString[i])) {
                numberConverted = numberConvert * Math.pow(Math.pow(10, prefixValue[i]), degreePower);
            }
        }
        return numberConverted;
    }

    private static double fromMetricBaseUnit(int degreePower, double numberConvert, String unitTo) {
        double numberConverted = 0;
        for (int i = 0; i < prefixValue.length; i++) {
            if (unitTo.contains(prefixString[i])) {
                numberConverted = numberConvert / Math.pow(Math.pow(10, prefixValue[i]), degreePower);
            }
        }
        return numberConverted;
    }

    private static double toImperialLength (int degreePower, double numberConvert, String unitIs) {

        return 0;
    }

    private static double fromImperialLength(int degreePower, double numberConvert, String unitTo) {

        return 0;
    }

    /**
     * Converts a length to another length.
     * @param numberConvert is the number being converted.
     * @param unitsIn the units it's in.
     * @param unitsTo the units being converted to.
     * @return
     */
    public static double distance(double numberConvert, String unitsIn, String unitsTo) {
        double distanceConverted = 0;

        if (toMetricBaseUnit(1, numberConvert, unitsIn) != 0) {
            distanceConverted = toMetricBaseUnit(1, numberConvert, unitsIn);
        } else {
            distanceConverted = fromImperialLength(1, numberConvert, unitsIn);
        }

        if (fromMetricBaseUnit(1, numberConvert, unitsIn) != 0) {
            distanceConverted = fromMetricBaseUnit(1, distanceConverted, unitsTo);
        } else {
            distanceConverted = toImperialLength(1, numberConvert, unitsIn);
        }

        return distanceConverted;
    }

   /**
     * Converts an area to another area.
     * @param numberConvert is the number being converted.
     * @param unitsIn the units it's in.
     * @param unitsTo the units being converted to.
     * @return
     */
    public static double area(double numberConvert, String unitsIn, String unitsTo) {
        double distanceConverted = 0;

        if (toMetricBaseUnit(2, numberConvert, unitsIn) != 0) {
            distanceConverted = toMetricBaseUnit(2, numberConvert, unitsIn);
        } else {
            distanceConverted = fromImperialLength(2, numberConvert, unitsIn);
        }

        if (fromMetricBaseUnit(2, numberConvert, unitsIn) != 0) {
            distanceConverted = fromMetricBaseUnit(2, distanceConverted, unitsTo);
        } else {
            distanceConverted = toImperialLength(2, numberConvert, unitsIn);
        }

        return distanceConverted;
    }

    /**
     * Converts a volume to another volume.
     * @param numberConvert is the number being converted.
     * @param unitsIn the units it's in.
     * @param unitsTo the units being converted to.
     * @return
     */
    public static double volume(double numberConvert, String unitsIn, String unitsTo) {
        double distanceConverted = 0;

        if (toMetricBaseUnit(3, numberConvert, unitsIn) != 0) {
            distanceConverted = toMetricBaseUnit(3, numberConvert, unitsIn);
        } else {
            distanceConverted = fromImperialLength(3, numberConvert, unitsIn);
        }

        if (fromMetricBaseUnit(3, numberConvert, unitsIn) != 0) {
            distanceConverted = fromMetricBaseUnit(3, distanceConverted, unitsTo);
        } else {
            distanceConverted = toImperialLength (3, numberConvert, unitsIn);
        }

        return distanceConverted;
    }
}
