import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTest
{
   // this test fails!
   @Test public void lastOccurrenceInFirstElement() 
   {
      int arr[] = {2, 3, 5};
      int y = 2;
      assertEquals("Last occurence in first element", 0, FindLast.findLast(arr, y));
   }
}
