/**
 * Context class
 * 
 * @author Amar Suhendra (2008107010091)
 * @version 1.0
 * @since 2022-10-21
 */
public class Context {
  // Declare the strategy
  private Strategy strategy;

  /**
   * Set the strategy
   * 
   * @param strategy
   */
  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  /**
   * Execute the strategy
   * 
   * @param a
   * @param b
   * @return result
   */
  public int executeStrategy(int a, int b) {
    // Execute the strategy
    int result = strategy.execute(a, b);
    return result;
  }
}