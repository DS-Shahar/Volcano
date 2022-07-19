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
