package org.btorres.junit5.examples.model;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AccountTest {

  @Test
  void testAccountName() {
    Account account = new Account("Bernabé", new BigDecimal("0"));
    assertEquals("Bernabé", account.getName());
  }


  @Test
  void testAccountBalance() {
    Account account = new Account("Peter", new BigDecimal("1000.00"));
    assertEquals(1000.00, account.getBalance().doubleValue());
  }


  @Test
  void checkEquals() {
    Account account1 = new Account("Peter", new BigDecimal("1000.00"));
    Account account2 = new Account("Peter", new BigDecimal("1000.00"));
    assertEquals(account1, account2);
    assertEquals(account1, account1);
    assertEquals(account2, account2);
  }

  @Test
  void checkDifferent() {
    Account account1 = new Account("Peter", new BigDecimal("1000.00"));
    Account account2 = new Account("Peter", new BigDecimal("1000.01"));
    assertNotEquals(account1, account2);
  }

}