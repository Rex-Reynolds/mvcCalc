/**
 * frmCalcView.java 1.0 Nov 16, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds. All Rights Reserved
 */
package edu.elon.math;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Start each Class or interface with a summary description line
 * 
 * @author RexIII
 * @version 1.0
 * 
 */
public class CalculatorView implements Observer {
  CalcController controller;
  CalculatorModel model;

  private JButton calculateButton = new JButton("=");
  private JButton subtractButton = new JButton("-");
  private JButton addButton = new JButton("+");
  private JButton multiplyButton = new JButton("*");
  private JButton divideButton = new JButton("/");
  private JButton oneButton = new JButton("1");
  private JButton twoButton = new JButton("2");
  private JButton threeButton = new JButton("3");
  private JButton fourButton = new JButton("4");
  private JButton fiveButton = new JButton("5");
  private JButton sixButton = new JButton("6");
  private JButton sevenButton = new JButton("7");
  private JButton eightButton = new JButton("8");
  private JButton nineButton = new JButton("9");
  private JButton zeroButton = new JButton("0");
  private JButton dotButton = new JButton(".");
  private JTextField calcSolution = new JTextField(30);
  private JFrame viewFrame;

  /**
   * @param controller
   * @param model
   */
  public CalculatorView(CalcController controller, CalculatorModel model) {
    this.model = model;
    this.controller = controller;
    model.addObserver(this);
  }

  // Sets up the view and adds the components
  /**
   * 
   */
  public void createView() {
    viewFrame = new JFrame("Calculator");
    JPanel calcPanel = new JPanel();
    JPanel resultPanel = new JPanel();

    viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    viewFrame.setSize(400, 400);

    viewFrame.setLayout(new BorderLayout());

    calcPanel.setLayout(new GridLayout(4, 4));

    viewFrame.setVisible(true);
    calcPanel.add(addButton);
    calcPanel.add(subtractButton);
    calcPanel.add(multiplyButton);
    calcPanel.add(calculateButton);
    calcPanel.add(divideButton);
    calcPanel.add(dotButton);
    calcPanel.add(oneButton);
    calcPanel.add(twoButton);
    calcPanel.add(threeButton);
    calcPanel.add(fourButton);
    calcPanel.add(fiveButton);
    calcPanel.add(sixButton);
    calcPanel.add(sevenButton);
    calcPanel.add(eightButton);
    calcPanel.add(nineButton);
    calcPanel.add(zeroButton);

    resultPanel.add(calcSolution);

    viewFrame.add(resultPanel, BorderLayout.PAGE_START);
    viewFrame.add(calcPanel);

    // End of setting up the components --------

  }

  /**
   * 
   */
  public void createControls() {

    calculateButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        String result = calcSolution.getText();
        controller.calculate(result);
        enableDotButton();

      }

    });
    addButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "+");
        enableDotButton();

      }

    });
    subtractButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "-");
        enableDotButton();

      }

    });
    multiplyButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "*");
        enableDotButton();

      }

    });
    divideButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "/");
        enableDotButton();

      }

    });
    dotButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + ".");
        disableDotButton();

      }

    });
    oneButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "1");

      }

    });
    twoButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "2");

      }

    });
    threeButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "3");

      }

    });
    fourButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "4");

      }

    });
    fiveButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "5");

      }

    });
    sixButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "6");

      }

    });
    sevenButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "7");

      }

    });
    eightButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "8");

      }

    });
    nineButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "9");

      }

    });

    zeroButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        calcSolution.setText(calcSolution.getText() + "0");

      }

    });

  }

  /**
   * 
   */
  public void enableDotButton() {
    dotButton.setEnabled(true);
  }

  /**
   * 
   */
  public void disableDotButton() {
    dotButton.setEnabled(false);
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.util.Observer#update(java.util.Observable,
   * java.lang.Object)
   */
  @Override
  public void update(Observable calc, Object data) {
    calcSolution.setText(Float.toString(model.getResult()));

  }

}
