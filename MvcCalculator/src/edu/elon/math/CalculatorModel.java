/**
 * CalculatorModel.java 1.0 Nov 16, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds. All Rights Reserved
 */
package edu.elon.math;

import java.util.Observable;

/**
 * Start each Class or interface with a summary description line
 * 
 * @author RexIII
 * @version 1.0
 * 
 */
public class CalculatorModel extends Observable implements CalculatorModelInterface {

  private float numOne;
  private float numTwo;
  private float result;

  /*
   * (non-Javadoc)
   * 
   * @see edu.elon.math.CalculatorModelInterface#add()
   */
  @Override
  public void add(float n1, float n2) {
    this.numOne = n1;
    this.numTwo = n2;
    result = numOne + numTwo;
    setChanged();
    notifyObservers();

  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.elon.math.CalculatorModelInterface#subtract()
   */
  @Override
  public void subtract(float n1, float n2) {
    this.numOne = n1;
    this.numTwo = n2;
    result = numOne - numTwo;
    setChanged();
    notifyObservers();

  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.elon.math.CalculatorModelInterface#multiply()
   */
  @Override
  public void multiply(float n1, float n2) {
    this.numOne = n1;
    this.numTwo = n2;
    result = (numOne * numTwo);
    setChanged();
    notifyObservers();

  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.elon.math.CalculatorModelInterface#divide()
   */
  @Override
  public void divide(float n1, float n2) {
    this.numOne = n1;
    this.numTwo = n2;
    if (numTwo == 0) {
      setChanged();
      notifyObservers("CAN'T BE ZERO");
    } else {
      result = (numOne / numTwo);
      setChanged();
      notifyObservers();
    }
  }

  /**
   * @return float
   */
  public float getResult() {

    return result;
  }

}
