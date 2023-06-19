import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
  
  private Calculator calc;
  
  @BeforeEach
  void init() {
    calc = new Calculator();
  }
  
  @Test
  @DisplayName("Test calculator sum")
  void testSum() {
    assertEquals(3, calc.sum(1.0f, 2.0f));
  }
  
  @Test
  @DisplayName("Test calculator subtraction")
  
  void testSubtract() {
    assertEquals(  1.0f, calc.subtract(3.0f, 2.0f));
  }
  
  @Test
  @DisplayName("Test calculator multiplication")
  void testMultiply() {
    assertEquals(1.0f, calc.multiply(1.0f,1.0f));
  }
  
  @Test
  @DisplayName("Test calculator division")
  void testDivide() {
    assertEquals(2.0f, calc.divide(4.0f, 2.0f));
  }
  @Test
  @DisplayName("Test calculator division error case ")
  void divideException() {
    assertThrows(
      IllegalArgumentException.class, () -> calc.divide(3.0f, -2.0f)
    );
  }
}