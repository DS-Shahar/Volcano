import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestVolcano2 {
  
  @Test
  @DisplayName("Test simple constructor")
  public void testConstructor()
  {
    Volcano v = new Volcano("Etna", 45);
    int c = v.getCount();
    assertEquals(c, 0);
    String n = v.getName();
    assertEquals(n, "Etna");
  }  
  
}
