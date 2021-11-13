package org.btorres.junit5.examples.model;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AccountTest {

  @Test
  void testAccountName() {
    Account account = new Account("Bernabé", new BigDecimal("0"));
    assertEquals("Bernabé", account.getName());
  }


  @Test
  void testAccountBalance() {
    Account account = new Account("Peter", new BigDecimal("1000.00"));
    assertNotNull(account.getBalance());
    assertEquals(1000.00, account.getBalance().doubleValue());
  }


  @Test
  void testCheckEquals() {
    Account account1 = new Account("Peter", new BigDecimal("1000.00"));
    Account account2 = new Account("Peter", new BigDecimal("1000.00"));
    assertEquals(account1, account2);
    assertEquals(account1, account1);
    assertEquals(account2, account2);
  }

  @Test
  void testCheckDifferent() {
    Account account1 = new Account("Peter", new BigDecimal("1000.00"));
    Account account2 = new Account("Peter", new BigDecimal("1000.01"));
    assertNotEquals(account1, account2);
  }


  //Test TDO: write first the test, after the implementation in Account.
  @Test
  void testDebitAccount(){
    Account account = new Account("Bernabé", new BigDecimal("1000.12345"));
    account.debit(new BigDecimal(100));
    assertNotNull(account.getBalance());
    assertEquals(900,account.getBalance().intValue());
    assertEquals("900.12345",account.getBalance().toPlainString());

  }


  //Test TDO: write first the test, after the implementation in Account.
  @Test
  void testCreditAccount(){
    Account account = new Account("Bernabé", new BigDecimal("1000.12345"));
    account.credit(new BigDecimal(100));
    assertNotNull(account.getBalance());
    assertEquals(1100,account.getBalance().intValue());
    assertEquals("1100.12345",account.getBalance().toPlainString());

  }





}