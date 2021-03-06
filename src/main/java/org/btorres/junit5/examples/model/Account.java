package org.btorres.junit5.examples.model;

import java.math.BigDecimal;
import java.util.Objects;

import org.btorres.junit5.examples.exceptions.NonEnoughMoneyException;

public class Account {

  private String name;
  private BigDecimal balance;

  public Account(String name, BigDecimal balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public void debit(BigDecimal amount) {
   BigDecimal newBalance =  balance.subtract(amount);
   if (newBalance.compareTo(BigDecimal.ZERO) < 0){
     throw new NonEnoughMoneyException("No enough money");
   }
   this.balance = newBalance;
  }

  public void credit(BigDecimal amount) {
    this.balance = balance.add(amount);
  }

  @Override
  public boolean equals(Object o) {
    // same object
    if (this == o) {
      return true;
    }
    if (!(o instanceof Account)) {
      return false;
    }
    Account account = (Account) o;
    return getName().equals(account.getName()) && getBalance().equals(account.getBalance());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getBalance());
  }
}
