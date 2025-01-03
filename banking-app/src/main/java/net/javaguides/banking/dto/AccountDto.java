package net.javaguides.banking.dto;

import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;

//@Data
//@AllArgsConstructor
public class AccountDto {
    // Getters
//    @Getter
    private Long id;
    private String accountHolderName;
    private double balance;

    public AccountDto(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Long getId() {
        return id;
}

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    // Setters (if needed)
    public void setId(Long id) {
        this.id = id;
    }


    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }



}
