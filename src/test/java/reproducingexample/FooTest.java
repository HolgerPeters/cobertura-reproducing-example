package reproducingexample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class FooTest {

   @Test
   public void testAssertions() {
      List<Integer> xs = new ArrayList<Integer>();
      xs.add(0);
      xs.add(1);
      xs.add(2);
      xs.add(3);

      List<Integer> processed = Foo.add_const(xs, 5);


      for (int i =0; i < processed.size(); i++) {
         assertEquals((int) processed.get(i), xs.get(i)  + 5);
      }

   }
}