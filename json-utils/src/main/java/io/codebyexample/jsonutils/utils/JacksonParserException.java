package io.codebyexample.jsonutils.utils;

/**
 * @author huypva
 */
public class JacksonParserException extends RuntimeException {

  public JacksonParserException() {
    super();
  }

  public JacksonParserException(String message) {
    super(message);
  }

  public JacksonParserException(Throwable cause) {
    super(cause);
  }

  public JacksonParserException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
