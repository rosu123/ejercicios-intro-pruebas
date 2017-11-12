import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastZeroTest
{
   // this test fails!
   @Test public void multipleZeroes() 
   {
      int arr[] = {0, 1, 0};
      assertEquals("Multiple zeroes: should find last one", 2, LastZero.lastZero(arr));
   }
      
   @Test public void oneZero() 
   {
      int arr[] = {3, 1, 0};
      assertEquals("Multiple zeroes: should find last one", 2, LastZero.lastZero(arr));
   }
}
