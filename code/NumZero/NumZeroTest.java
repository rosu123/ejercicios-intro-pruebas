import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NumZeroTest
{
   // this test passes
   @Test public void nonZeroFirstElement() 
   {
      int arr[] = {2, 7, 0};
      assertEquals("Nonzero in first element", 1, NumZero.numZero(arr));
   }

    // this test fails!
   @Test public void zeroFirstElement() 
   {
      int arr[] = {0, 7, 2};
      assertEquals("Zero in first element", 1, NumZero.numZero(arr));
   }
}
