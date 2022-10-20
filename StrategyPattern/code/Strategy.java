package StrategyPattern.code;
/**
 * Strategy
 */
interface Strategy {
  public int execute(int a, int b);
  
}

class ConcreteStrategyAdd implements Strategy {
  public int execute(int a, int b) {
    return a + b;  
  }
}

class ConcreteStrategySubstract implements Strategy {
  public int execute(int a, int b) {
    return a - b;  
  }
}

class ConcreteStrategyMultiply implements Strategy {
  public int execute(int a, int b) {
    return a * b;  
  }
}