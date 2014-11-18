/**
 * CalcController.java 1.0 Nov 16, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds. All Rights Reserved
 */
package edu.elon.math;

/**
 * Start each Class or interface with a summary description line
 * 
 * @author RexIII
 * @version 1.0
 * 
 */
public class CalcController implements ControllerInterface {
  private CalculatorModel model;
  private CalculatorView view;
  private String[] strArray;
  private String delims;

  /**
   * @param model
   */
  public CalcController(CalculatorModel model) {
    this.model = model;
    view = new CalculatorView(this, model);
    view.createView();
    view.createControls();
    view.enableDotButton();
  }

  /**
   * @param aResult
   * 
   */
  public void calculate(String str) {
    if (str.contains("+")) {
      delims = "[+]";
      strArray = str.split(delims);
      model.add(Float.valueOf(strArray[0]), Float.valueOf(strArray[1]));

    } else if (str.contains("-")) {
      delims = "[-]";
      strArray = str.split(delims);
      model.subtract(Float.valueOf(strArray[0]), Float.valueOf(strArray[1]));

    } else if (str.contains("*")) {
      delims = "[*]";
      strArray = str.split(delims);
      model.multiply(Float.valueOf(strArray[0]), Float.valueOf(strArray[1]));

    } else if (str.contains("/")) {
      delims = "[/]";
      strArray = str.split(delims);
      model.divide(Float.valueOf(strArray[0]), Float.valueOf(strArray[1]));

    }

  }

}
