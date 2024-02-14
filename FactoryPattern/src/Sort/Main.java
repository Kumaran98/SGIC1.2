package Sort;

import java.util.Arrays;

public  class Main implements SortingAlgorithm{
 public static void main(String[] args) {
     int[] data = {64, 25, 12, 22, 11};

     // Example usage: Creating a sorting algorithm object using the factory
     SortingAlgorithm sortingAlgorithm = SortingAlgorithmFactory.createSortingAlgorithm("bubble");
     sortingAlgorithm.sort(data);

     // Output the sorted array
     System.out.println("Sorted data using Bubble Sort: " + Arrays.toString(data));
 }
}