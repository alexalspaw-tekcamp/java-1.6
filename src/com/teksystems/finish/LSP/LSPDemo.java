package com.teksystems.finish.LSP;

import java.math.BigDecimal;

public class LSPDemo {
    public static void main(String[] args) {
        WithdrawableAccount myFixedTermDepositAccount = new SavingsAccount();
        myFixedTermDepositAccount.deposit(new BigDecimal("1000.00"));

        BankingAppWithdrawalService bankingAppWithdrawalService =
                new BankingAppWithdrawalService(myFixedTermDepositAccount);
        bankingAppWithdrawalService.withdraw(new BigDecimal("100.00"));
    }
}
