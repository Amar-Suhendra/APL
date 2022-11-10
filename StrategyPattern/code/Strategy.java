/**
 * Strategy.java
 * 
 * @author Amar Suhendra (2008107010091)
 * @version 1.0
 * @since 2022-10-21
 */

// The interface strategy
interface Strategy {
  // Execute the strategy
  public int execute(int a, int b);
}

/**
 * ConcreteStrategyAdd class
 */
class ConcreteStrategyAdd implements Strategy {
  /**
   * Execute the strategy
   * 
   * @param a
   * @param b
   * @return result a + b
   */
  public int execute(int a, int b) {
    return a + b;
  }
}

/**
 * ConcreteStrategySubstract class
 */
class ConcreteStrategySubstract implements Strategy {
  /**
   * Execute the strategy
   * 
   * @param a
   * @param b
   * @return result a - b
   */
  public int execute(int a, int b) {
    return a - b;
  }
}

/**
 * ConcreteStrategyMultiply class
 */
class ConcreteStrategyMultiply implements Strategy {
  /**
   * Execute the strategy
   * 
   * @param a
   * @param b
   * @return result a * b
   */
  public int execute(int a, int b) {
    return a * b;
  }
}