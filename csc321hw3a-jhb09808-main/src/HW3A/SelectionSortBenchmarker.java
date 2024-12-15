package HW3A;

/**
   The SelectionSortBenchmarker class performs a 
   selection sort on an int array. It keeps count 
   of the number of swaps made, comparisons, and assignments.
   Code taken from textBook ARCHIVE
   
   Author: Jerome Bustarga
   ID: JHB09808
*/

public class SelectionSortBenchmarker
{
   private int array[];  // The array to sort
   private int numSwaps; // To count the number of swaps made
   private int comparisons; // To count the number of comparisons made
   private int assignments; // To count the number of assignments made
   
   /**
      Constructor
      @param a The array to sort.
   */
   
   public SelectionSortBenchmarker(int a[])
   {
      array = a;
      numSwaps = 0;
      comparisons = 0;
      assignments = 0;
      selectionSort();
   }

   /**
      The selectionSort method performs a selection sort on
      the array.
   */

   private void selectionSort()
   {
      int startScan;   // Starting position of the scan
      int index;       // To hold a subscript value
      int minIndex;    // Element with smallest value in the scan
      int minValue;    // The smallest value found in the scan

      // The outer loop iterates once for each element in the
      // array. The startScan variable marks the position where
      // the scan should begin.
      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         comparisons++; // Comparison in for loop
         // Assume the first element in the scannable area
         // is the smallest value.
         minIndex = startScan;
         minValue = array[startScan];
         assignments += 2; // Assignments for minIndex and minValue
         
         // Scan the array, starting at the 2nd element in
         // the scannable area. We are looking for the smallest
         // value in the scannable area. 
         for(index = startScan + 1; index < array.length; index++)
         {
            comparisons++; // Comparison in for loop
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
               assignments += 2; // Assignments for minValue and minIndex
            }
         }

         // Swap the element with the smallest value 
         // with the first element in the scannable area.
         swap(array, minIndex, startScan);
      }
   }

   /**
      The swap method swaps the contents of two elements
      in an int array.
      @param The array containing the two elements.
      @param a The subscript of the first element.
      @param b The subscript of the second element.
   */
   
   private void swap(int[] array, int a, int b)
   {
      int temp;
      
      temp = array[a];
      assignments++; // Assignment for temp
      array[a] = array[b];
      assignments++; // Assignment for array[a]
      array[b] = temp;
      assignments++; // Assignment for array[b]
      numSwaps++;
   }

   /**
      The getNumSwaps method returns the number of
      swaps made.
      @return The number of swaps made.
   */
   public int getNumSwaps()
   {
      return numSwaps;
   }

   /**
      The getComparisons method returns the number of
      comparisons made.
      @return The number of comparisons made.
   */
   public int getComparisons()
   {
      return comparisons;
   }

   /**
      The getAssignments method returns the number of
      assignments made.
      @return The number of assignments made.
   */
   public int getAssignments()
   {
      return assignments;
   }
}
