public class Calculator {
  
  public float sum(float first_number,float second_number) {
    return first_number + second_number;
  }
  public float subtract(float first_number,float second_number) {
    return first_number - second_number;
  }
  public float multiply(float first_number,float second_number) {
    return first_number * second_number;
  }
  public float divide(float first_number,float second_number) {
    if (second_number <= 0) {
      throw new IllegalArgumentException("Il divisore non può essere minore o uguale 0");
    }
  return first_number / second_number;
  }
  
  
  
  
  
}
