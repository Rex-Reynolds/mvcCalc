/**
 * CalculatorModelInterface.java 1.0 Nov 17, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds. All Rights Reserved
 */
package edu.elon.math;

import java.util.Observer;

import javafx.beans.Observable;

/**
 * Start each Class or interface with a summary description line
 * 
 * @author RexIII
 * @version 1.0
 * 
 */
public interface CalculatorModelInterface {

  public void add(float n1, float n2);

  public void subtract(float n1, float n2);

  public void multiply(float n1, float n2);

  public void divide(float n1, float n2);

}
