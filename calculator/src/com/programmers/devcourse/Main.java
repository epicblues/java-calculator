package com.programmers.devcourse;

import com.programmers.devcourse.calculator.Calculator;
import com.programmers.devcourse.calculator.ConsoleCalculator;
import com.programmers.devcourse.parser.InFixParser;
import com.programmers.devcourse.processor.StringTokenProcessor;

public class Main {


  public static void main(String[] args) {

    Calculator calculator = new ConsoleCalculator(new InFixParser(), new StringTokenProcessor());

    calculator.start();

  }


}
