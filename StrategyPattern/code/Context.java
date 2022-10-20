package StrategyPattern.code;
public class Context{
  private Strategy strategy;

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public int executeStrategy(int a, int b) {
    int result = strategy.execute(a, b);
    return result;
  }
}