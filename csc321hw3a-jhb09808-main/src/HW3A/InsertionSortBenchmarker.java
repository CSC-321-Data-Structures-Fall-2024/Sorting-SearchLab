package HW3A;

/**
   The InsertionSortBenchmarker class performs an
   insertion sort on an int array. It keeps count 
   of the number of swaps made, comparisons, and assignments.
   
   Author: Jerome Bustarga
   ID: JHB09808
*/

public class InsertionSortBenchmarker
{
   private int array[];  // The array to sort
   private int numSwaps; // To count the number of swaps made
   private int comparisons; // To count the number of comparisons made
   private int assignments; // To count the number of assignments made
    
   /**
      Constructor
      @param a The array to sort.
   */
   
   public InsertionSortBenchmarker(int a[])
   {
      array = a;
      numSwaps = 0;
      comparisons = 0;
      assignments = 0;
      insertionSort();
   }

   /**
      The insertionSort method performs an insertion sort on
      the array.
   */

   private void insertionSort()
   {
      int unsortedValue;  // The first unsorted value
      int scan;           // Used to scan the array
      
      // The outer loop steps the index variable through 
      // each subscript in the array, starting at 1. This
      // is because element 0 is considered already sorted.

      for (int index = 1; index < array.length; index++)
      {
         comparisons++; // Comparison in for loop
         // The first element outside the sorted subset is
         // array[index]. Store the value of this element
         // in unsortedValue.
         unsortedValue = array[index];
         assignments++; // Assignment for unsortedValue
         
         // Start scan at the subscript of the first element
         // outside the sorted subset.
         scan = index;
         assignments++; // Assignment for scan
         
         // Move the first element outside the sorted subset
         // into its proper position within the sorted subset.

         while (scan > 0 && array[scan-1] > unsortedValue)
         {
            comparisons++; // Comparison in while condition
            array[scan] = array[scan - 1];
            assignments++; // Assignment in while loop
            scan--;
         }
         comparisons++; // Final comparison when while loop exits
         
         // Insert the unsorted value in its proper position
         // within the sorted subset.
         array[scan] = unsortedValue;
         assignments++; // Assignment for inserting unsortedValue
         
         // In line 41 we stored array[index] in unsortedValue.
         // Here we just stored unsortedValue in array[scan].
         // We will count those two steps as one swap.
         numSwaps++;
      }
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
