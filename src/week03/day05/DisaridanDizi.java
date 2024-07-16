package week03.day05;

import java.util.Arrays;
import java.util.Scanner;

public class DisaridanDizi {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double [] array = createArray();
        double mean = calculateAverage(array);
        double standardDeviation = calculateStandardDeviation(array,mean);
        double median = calculateMedian(array);
        printResults(mean,standardDeviation,median);
    }

    private static void printResults(double mean, double standardDeviation, double median) {
        System.out.println("Average: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
        System.out.println("Median: " + median);
    }

    private static double calculateMedian(double[] array) {
        Arrays.sort(array);
        double median;
        int size = array.length;
        if (size % 2 == 0) {
            median = (array[size / 2 - 1] + array[size / 2]) / 2.0;
        } else {
            median = array[size / 2];
        }
        return median;
    }

    private static double calculateStandardDeviation(double[] array, double mean) {
        // Standart sapma hesaplama
        double sumOfSquaredDifferences = 0;
        for (double num : array) {
            sumOfSquaredDifferences += (num - mean) * (num - mean);
        }
        double standardDeviation = Math.sqrt(sumOfSquaredDifferences / (array.length));
        return standardDeviation;
    }

    private static double calculateAverage(double[] array) {
        // Ortalama hesaplama
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double mean = sum / array.length;
        return mean;
    }

    private static double[] createArray() {
        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();

        double[] array = new double[size];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
