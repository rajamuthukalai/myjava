package com.sannu.designpatterns;

enum AccountType {
  SAVINGS,
  CURRENT,
  HOME_LOAN,
  CAR_LOAN
}

interface Account {
  double getInterestRates();
}

class SavingsAccount implements Account {
  @Override
  public double getInterestRates() {
    return 4;
  }
}

class CurrentAccount implements Account {
  @Override
  public double getInterestRates() {
    return 2;
  }
}

class HomeLoanAccount implements Account {
  @Override
  public double getInterestRates() {
    return 12;
  }
}

class CarLoanAccount implements Account {
  @Override
  public double getInterestRates() {
    return 10;
  }
}

abstract class AccountFactory {
  abstract Account getAccount(String type);
}

class RegularAccountFactory extends AccountFactory {
  @Override
  Account getAccount(String type) {
    Account account = null;
    if (type.equals(AccountType.SAVINGS)) {
      account = new SavingsAccount();
    } else if (type.equals(AccountType.CAR_LOAN)) {
      account = new CurrentAccount();
    }
    return account;
  }
}

class LoanAccountFactory extends AccountFactory {
  @Override
  Account getAccount(String type) {
    Account account = null;
    if (type.equals(AccountType.HOME_LOAN.toString())) {
      account = new HomeLoanAccount();
    } else if (type.equals(AccountType.CAR_LOAN.toString())) {
      account = new CarLoanAccount();
    }
    return account;
  }
}

public class AbstractFactory {
  public static AccountFactory getFactory(String type) {
    AccountFactory accountFactory = null;
    if (type.equals("regular")) {
      accountFactory = new RegularAccountFactory();
    } else if (type.equals("loan")) {
      accountFactory = new LoanAccountFactory();
    }
    return accountFactory;
  }

  public static void main(String[] args) {
    double interestRate =
        AbstractFactory.getFactory("loan")
            .getAccount(AccountType.HOME_LOAN.toString())
            .getInterestRates();
    System.out.println(interestRate);
  }
}
