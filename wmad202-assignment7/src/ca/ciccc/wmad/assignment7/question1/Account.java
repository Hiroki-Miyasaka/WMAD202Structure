package ca.ciccc.wmad.assignment7.question1;

public class Account {

    private Integer accountNumber;
    private String accountUserName;
    private Boolean accountIsValid;

    public Account(Integer accountNumber, String accountUserName, Boolean accountIsValid){
        this.accountNumber = accountNumber;
        this.accountUserName = accountUserName;
        this.accountIsValid = accountIsValid;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public void setAccountIsValid(Boolean accountIsValid) {
        this.accountIsValid = accountIsValid;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public Boolean getAccountIsValid() {
        return accountIsValid;
    }
}
