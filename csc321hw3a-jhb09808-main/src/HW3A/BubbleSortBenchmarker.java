package HW3A;

/**
   The BubbleSortBenchmarker class performs a 
   bubble sort on an int array. It keeps count 
   of the number of swaps made, comparisons, and assignments.
   
   Author: Jerome Bustarga
   ID: JHB09808
*/

public class BubbleSortBenchmarker
{
    private int array[];  // The array to sort.
    private int numSwaps; // To count the number of swaps made.
    private int comparisons; // To count the number of comparisons made.
    private int assignments; // To count the number of assignments made.
   
    /**
      Constructor
      @param a The array to sort.
    */
   public BubbleSortBenchmarker(int a[])
   {
      array = a;
      numSwaps = 0;
      comparisons = 0;
      assignments = 0;
      bubbleSort();
   }

   /**
      The bubbleSort method uses the bubble sort algorithm
      to sort the array.
   */
   
   private void bubbleSort()
   {
      int maxElement;   // Marks the last element to compare
      int index;        // Index of an element to compare
      int temp;         // Used to swap two elements
      
      // The outer loop positions maxElement at the last element
      // to compare during each pass through the array. Initially
      // maxElement is the index of the last element in the array.
      // During each iteration, it is decreased by one.

      for (maxElement = array.length - 1; maxElement >= 0; maxElement--)
      {
         comparisons++; // Comparison in for loop
         // The inner loop steps through the array, comparing
         // each element with its neighbor. All of the elements
         // from index 0 through maxElement are involved in the
         // comparison. If two elements are out of order, they
         // are swapped.
         for (index = 0; index <= maxElement - 1; index++)
         {
            comparisons++; // Comparison in for loop
            // Compare an element with its neighbor.
            comparisons++;
            if (array[index] > array[index + 1])
            {
               // Swap the two elements.
               temp = array[index];
               assignments++; // Assignment for temp
               array[index] = array[index + 1];
               assignments++; // Assignment for array[index]
               array[index + 1] = temp;
               assignments++; // Assignment for array[index + 1]
               numSwaps++;
            }
          }
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
