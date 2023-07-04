package com.org.voter_application.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="voter_reg_tbl")
public class VoterRegistration {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="voter_name",length= 255)
    private String voterName;

    @Column(name = "gender")
    private String gender;

    @Column(name="age")
    private int age;

    @Column(name="ward")
    private String ward;

    @Column(name="voter_id", unique = true)
    private String voterId;

    @Column(name="adhar_number", unique = true)
    private String adharNumber;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="address")
    private String address;

    @Column(name="password", nullable = false)
    private String password;

    public VoterRegistration(Long id, String voterName, String gender, int age, String ward, String voterId, String adharNumber, String mobileNumber, String address, String password) {
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

    public VoterRegistration() {
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
}
