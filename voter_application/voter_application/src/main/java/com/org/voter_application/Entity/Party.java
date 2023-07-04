package com.org.voter_application.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="party")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="new_party")
    private boolean newParty;

    @Column(name="party_name")
    private String nameOfNewParty;

    @Column(name = "images")
    private byte[] image;

    @Column(name="candidate_name")
    private String candidateName;

    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private int age;

    @Column(name="ward")
    private String ward;

    @Column(name="voter_id")
    private String voterId;

    @Column(name="vote_count")
    private int voteCount;

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public Party(Long id, boolean newParty, String nameOfNewParty, byte[] image, String candidateName, String gender, int age, String ward, String voterId) {
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

    public Party() {
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
}
