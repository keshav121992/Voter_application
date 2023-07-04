package com.org.voter_application.Dto;

public class LoginDto {

    private String mobileNumber;

    private String password;

    public LoginDto(String mobileNumber, String password) {
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDto{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
