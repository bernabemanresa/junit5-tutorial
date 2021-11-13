package org.btorres.junit5.examples.exceptions;

public class NonEnoughMoneyException extends RuntimeException {

  public NonEnoughMoneyException(String message) {
    super(message);
  }
}
