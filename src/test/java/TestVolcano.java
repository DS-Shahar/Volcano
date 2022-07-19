
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestVolcano {

   private Volcano v1;
   
   @BeforeAll
   public void setup() {
      v1 = new Volcano("Etna", 12);
   }
   
   @BeforeEach     
   public void init() {
   }
   
   @Test
   public void testAdd()
   {
      v1.add(1400);
      v1.add(1300);
      v1.add(1200);
      assertEquals(v1.getCount(), 3);
   }
   
   @Test
   public void testFix() {
      testAdd();
      v1.fix(1, 1350);
   }
   
   @Test
   public void testDelete() {
      testAdd();
      v1.delete(1);
      assertEquals(v1.getCount(), 2);
   }
   
   @Test
   public void testAverage() {
      testAdd();
      double a = v1.average();
      assertEquals(a, 1300);
   }
   
   @Test
   public void testMaxUnder() {
      testAdd();
      int m = v1.maxUnder(1400);
      assertEquals(m, 1);
   }
   
   @Test
   public void testCopyConstructor() {
      testAdd();
      Volcano v2 = new Volcano(v1);
      assertEquals(v2.getName(), "Etna");
      assertEquals(v2.getCount(), 3);
   }  
}
