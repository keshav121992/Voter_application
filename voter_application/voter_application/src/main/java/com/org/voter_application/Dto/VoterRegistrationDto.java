package com.org.voter_application.Dto;

public class VoterRegistrationDto {

    private Long id;
    private String voterName;
    private String gender;
    private int age;
    private String ward;
    private String voterId;
    private String adharNumber;
    private String mobileNumber;
    private String address;
    private String password;

    public VoterRegistrationDto(Long id, String voterName, String gender, int age, String ward, String voterId, String adharNumber, String mobileNumber, String address, String password) {
        this.id = id;
        this.voterName = voterName;
        this.gender = gender;
        this.age = age;
        this.ward = ward;
        this.voterId = voterId;
        this.adharNumber = adharNumber;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(String adharNumber) {
        this.adharNumber = adharNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "VoterRegistrationDto{" +
                "id=" + id +
                ", voterName='" + voterName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", ward='" + ward + '\'' +
                ", voterId='" + voterId + '\'' +
                ", adharNumber='" + adharNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
