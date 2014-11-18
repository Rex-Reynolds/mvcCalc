/**
 * Main.java 1.0 Nov 16, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds. All Rights Reserved
 */
package edu.elon.math;

import java.util.Observer;

/**
 * Start each Class or interface with a summary description line
 * 
 * @author RexIII
 * @version 1.0
 * 
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    CalculatorModel model = new CalculatorModel();
    CalcController controller = new CalcController(model);


  }

}
