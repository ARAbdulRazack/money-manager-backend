package com.money.manager.dto;

import lombok.Data; // Keeping import to avoid error if I miss removing annotation, but I will remove annotation
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

public class DashboardStats {
    private Double totalIncome;
    private Double totalExpense;
    private Double balance;

    public DashboardStats() {
    }

    public DashboardStats(Double totalIncome, Double totalExpense, Double balance) {
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.balance = balance;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(Double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
