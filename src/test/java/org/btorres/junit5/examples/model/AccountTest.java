package org.btorres.junit5.examples.model;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

  @Test
  void testAccountName(){
    Account account = new Account("Bernabé", new BigDecimal("1000.00"));
    assertEquals("Bernabé", account.getName());

    assertEquals( new BigDecimal("1000.00"), account.getBalance());
  }

}