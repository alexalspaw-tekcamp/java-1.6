package com.teksystems.finish.LSP;

import java.math.BigDecimal;

public abstract class WithdrawableAccount extends Account {
    @Override
    protected abstract void deposit(BigDecimal amount);

    protected abstract void withdraw(BigDecimal amount);
}
