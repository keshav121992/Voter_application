package com.org.voter_application.Dto;

import java.util.Arrays;

public class PartyDto {

    private Long id;
    private boolean newParty;
    private String nameOfNewParty;

    private byte[] image;
    private String candidateName;
    private String gender;
    private int age;
    private String ward;
    private String voterId;

    public PartyDto(Long id, boolean newParty, String nameOfNewParty, byte[] image, String candidateName, String gender, int age, String ward, String voterId) {
        this.id = id;
        this.newParty = newParty;
        this.nameOfNewParty = nameOfNewParty;
        this.image = image;
        this.candidateName = candidateName;
        this.gender = gender;
        this.age = age;
        this.ward = ward;
        this.voterId = voterId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNewParty() {
        return newParty;
    }

    public void setNewParty(boolean newParty) {
        this.newParty = newParty;
    }

    public String getNameOfNewParty() {
        return nameOfNewParty;
    }

    public void setNameOfNewParty(String nameOfNewParty) {
        this.nameOfNewParty = nameOfNewParty;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
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

    @Override
    public String toString() {
        return "PartyDto{" +
                "id=" + id +
                ", newParty=" + newParty +
                ", nameOfNewParty='" + nameOfNewParty + '\'' +
                ", image=" + Arrays.toString(image) +
                ", candidateName='" + candidateName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", ward='" + ward + '\'' +
                ", voterId='" + voterId + '\'' +
                '}';
    }
}
