package com.programmers.devcourse.parser;

import com.programmers.devcourse.exception.parser.ParserException;
import com.programmers.devcourse.exception.parser.WrongTokenPositionException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostFixParser implements Parser {

  Pattern pattern = Pattern.compile("([+*-/])|([0-9]{1,7}(\\.[0-9]{1,7})?)|([()])");

  @Override
  public List<String> parse(String target) throws ParserException {
    List<String> tokens = new ArrayList<>(100);

    Matcher result = pattern.matcher(target);

    while (result.find()) {
      tokens.add(result.group());
    }

    validateTokenOrder(tokens);

    for (String token : tokens) {
    }
    // 괄호는 항상 숫자 앞에
    // 우괄호는 항상 숫자 뒤에
    // 좌괄호는 항상 숫자 앞에
    // 연산자는 항상 숫자 사이에

    // 토큰 리스트가 유효한지 파악한다.

    // 괄호의 위치가 유효한지 파악한다.
    // 연산자 위치가 유효한지 파악한다.

    return tokens;
  }

  private void validateTokenOrder(List<String> tokens)
      throws WrongTokenPositionException {

    String[] originalRegexArray = pattern.pattern().split("\\|");
    String operatorRegex = originalRegexArray[0];
    String numberRegex = originalRegexArray[1];
    String parenthesisRegex = originalRegexArray[2];



  }


}
