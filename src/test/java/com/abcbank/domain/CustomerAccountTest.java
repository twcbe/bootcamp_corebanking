package com.abcbank.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CustomerAccountTest {
    @Test
    public void shouldBeAbleToDepositAmount() {
        // Given
        int currentBalance = 1;
        CustomerAccount customerAccount = new CustomerAccount(currentBalance);

        // When
        int amount = 1;
        customerAccount.deposit(amount);

        // Then
        assertThat(customerAccount.getBalance(), is(2));
    }

    @Test
    public void shouldBeAbleToDepositMaximumAllowedAmount() {

        int currentBalance = 1;
        CustomerAccount customerAccount = new CustomerAccount(currentBalance);

        int maximumAllowedAmount = 20000;
        customerAccount.deposit(maximumAllowedAmount);

        assertThat(customerAccount.getBalance(), is(20001));
    }
}
