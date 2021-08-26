package com.teksystems.start.LSP;

import java.math.BigDecimal;

public class LSPDemo {
    public static void main(String[] args) {
        Account myFixedTermDepositAccount = new FixedTermDepositAccount();
        myFixedTermDepositAccount.deposit(new BigDecimal("1000.00"));

        BankingAppWithdrawalService bankingAppWithdrawalService =
                new BankingAppWithdrawalService(myFixedTermDepositAccount);
        bankingAppWithdrawalService.withdraw(new BigDecimal("100.00"));
    }
}
