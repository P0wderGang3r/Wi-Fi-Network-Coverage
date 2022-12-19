package Simulation.DefaultClasses;

import java.util.ArrayList;
import java.util.Arrays;

public enum Frequency {
    HZ2400 {
        private final ArrayList<FreqStruct> bands = new ArrayList<FreqStruct>(
            Arrays.asList(
                    new FreqStruct("1", 2412),
                    new FreqStruct("2", 2417),
                    new FreqStruct("3", 2422),
                    new FreqStruct("4", 2427),
                    new FreqStruct("5", 2432),
                    new FreqStruct("6", 2437),
                    new FreqStruct("7", 2442),
                    new FreqStruct("8", 2447),
                    new FreqStruct("9", 2452),
                    new FreqStruct("10", 2457),
                    new FreqStruct("11", 2462),
                    new FreqStruct("12", 2467),
                    new FreqStruct("13", 2472),
                    new FreqStruct("14", 2484)
            )
        );

        @Override
        public ArrayList<String> getBandNames() {
            var bandNames = new ArrayList<String>();

            for (var band: bands) {
                bandNames.add(band.bandName);
            }

            return bandNames;
        }

        @Override
        public double getBandValue(String bandName) {
            for (var band: bands) {
                if (band.bandName.equals(bandName)) {
                    return band.bandValue;
                }
            }

            return -1;
        }
    };

    public abstract ArrayList<String> getBandNames();

    public abstract double getBandValue(String bandName);

    private static class FreqStruct {
        private final String bandName;

        public String getBandName() {
            return bandName;
        }

        private final int bandValue;

        public int getBandValue() {
            return bandValue;
        }

        public FreqStruct(String bandName, int bandValue) {
            this.bandName = bandName;
            this.bandValue = bandValue;
        }
    }
}