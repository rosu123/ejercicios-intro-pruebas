public class OddOrPos
{
  /**
   * Count odd or positive elements in an array
   *
   * @param x array to search
   * @return count of odd or positive elements in x
   * @throws NullPointerException if x is null
   */
   public static int oddOrPos (int[] x)
   {  // Effects:  if x is null throw NullPointerException
      // else return the number of elements in x that
      //      are either odd or positive (or both)
      int count = 0;
   
      for (int i = 0; i < x.length; i++)
      {
         if (!(x[i]%2 == 0) || x[i] > 0)
         {
            count++;
         }
      }
      return count;
   }
      // test:  x=[-3, -2, 0, 1, 4]           
      //        Expected = 3
   
   public static void main (String []argv)
   {  // Driver method for oddOrPos
      // Read an array from standard input, call oddOrPos()
      int []inArr = new int [argv.length];
      if (argv.length == 0)
      {
         System.out.println ("Usage: java OddOrPos v1 [v2] [v3] ... ");
         return;
      }
   
      for (int i = 0; i< argv.length; i++)
      {
         try
         {
            inArr [i] = Integer.parseInt (argv[i]);
         }
         catch (NumberFormatException e)
         {
            System.out.println ("Entry must be a integer, using 1.");
            inArr [i] = 1;
         }
      }
   
      System.out.println ("Number of elements that are either odd or positive is: " + oddOrPos (inArr));
   }
}

