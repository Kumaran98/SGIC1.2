package Sort;

import java.util.Arrays;

//Interface for Sorting Algorithms
interface SortingAlgorithm {
 void sort(int[] array);
}

//Bubble Sort Algorithm
class BubbleSort implements SortingAlgorithm {
 public void sort(int[] array) {
     int n = array.length;
     for (int i = 0; i < n-1; i++) {
         for (int j = 0; j < n-i-1; j++) {
             if (array[j] > array[j+1]) {
                 // swap arr[j+1] and arr[i]
                 int temp = array[j];
                 array[j] = array[j+1];
                 array[j+1] = temp;
             }
         }
     }
 }
}

//Selection Sort Algorithm
class SelectionSort implements SortingAlgorithm {
 public void sort(int[] array) {
     int n = array.length;
     for (int i = 0; i < n-1; i++) {
         int min_idx = i;
         for (int j = i+1; j < n; j++) {
             if (array[j] < array[min_idx]) {
                 min_idx = j;
             }
         }
         // Swap the found minimum element with the first element
         int temp = array[min_idx];
         array[min_idx] = array[i];
         array[i] = temp;
     }
 }
}

//Factory Class for Sorting Algorithms
class SortingAlgorithmFactory {
 public static SortingAlgorithm createSortingAlgorithm(String algorithmType) {
     switch (algorithmType.toLowerCase()) {
         case "bubble":
             return new BubbleSort();
         case "selection":
             return new SelectionSort();
         default:
             throw new IllegalArgumentException("Invalid sorting algorithm type");
     }
 }
}
