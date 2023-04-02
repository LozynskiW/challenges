package pl.javabasics.challenges;

import java.lang.Math;
import java.util.Arrays;

public class SinusoidPrinter {

    private int amplitude;
    private double frequency;
    private int samplingFreq;

    public SinusoidPrinter(int amplitude, double frequency, int samplingFreq) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.samplingFreq = samplingFreq;
    }

    public static void main(String[] args) {

        SinusoidPrinter sinusoidPrinter = new SinusoidPrinter(1, 2, 5);
        sinusoidPrinter.plot(5, 10);
    }

    public void plot(int quantizationLevels, int time) {

        int pointsToPlot = time*this.samplingFreq;

        char[][] chart = new char[2*quantizationLevels*this.amplitude][pointsToPlot];

        for (int i = pointsToPlot-1; i >= 0; i--) {

            double functionValue = calculateFunctionValue(i*this.samplingFreq);

            chart = assignChartPoint(chart, functionValue, i);
        }

        for (char[] row : chart) {
            System.out.println(Arrays.toString(row));
        }

    }

    private char[][] assignChartPoint(char[][] currentChart, double functionValue, int index) {

        int rowsLength = currentChart.length;
        System.out.println(rowsLength/2 );
        System.out.println((int) functionValue*10 - 1);

        int row = rowsLength/2 - (int) functionValue*10 - 1;

        System.out.println(row);

        currentChart[row][index] = '*';

        return currentChart;
    }

    private double calculateFunctionValue(float time) {

        double sinValue = this.amplitude+Math.sin(frequency*time*Math.PI);

        return  Math.round(sinValue*10)/10.0;
    }

    public int getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(int amplitude) {
        this.amplitude = amplitude;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
