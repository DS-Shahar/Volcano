
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestVolcano {

   @Test
   public void testConstructor()
   {
      Volcano v1 = new Volcano("Etna", 450);
      int c = v1.getCount();
      assertEquals(c, 0);
      String n = v1.getName();
      assertEquals(n, "Etna");
   }
   
   @Test
   public void testMethods()
   {
      Volcano v1 = new Volcano("Etna", 450);
      v1.add(1400);
      v1.add(1300);
      v1.add(1200);
      assertEquals(v1.getCount(), 3);
      v1.fix(1, 1350);
      v1.delete(1);
      assertEquals(v1.getCount(), 2);
      double a = v1.average();
      assertEquals(a, 1300);
      int m = v1.maxUnder(1300);
      assertEquals(m, 1);
   }
   
}
