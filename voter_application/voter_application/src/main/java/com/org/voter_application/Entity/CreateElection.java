package com.org.voter_application.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="election_tbl")
public class CreateElection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="include_instructor")
    private Boolean includeInstructor;
    @Column(name="addition_instructor")
    private String additionalInstruction;

    @Column(name="start_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateAndTime;
    @Column(name="end_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDateAndTime;

    @Column(name="active")
    private boolean active;

    public CreateElection(Long id, String name, Boolean includeInstructor, String additionalInstruction, Date startDateAndTime, Date endDateAndTime, boolean active) {
        this.id = id;
        this.name = name;
        this.includeInstructor = includeInstructor;
        this.additionalInstruction = additionalInstruction;
        this.startDateAndTime = startDateAndTime;
        this.endDateAndTime = endDateAndTime;
        this.active = active;
    }

    public CreateElection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIncludeInstructor() {
        return includeInstructor;
    }

    public void setIncludeInstructor(Boolean includeInstructor) {
        this.includeInstructor = includeInstructor;
    }

    public String getAdditionalInstruction() {
        return additionalInstruction;
    }

    public void setAdditionalInstruction(String additionalInstruction) {
        this.additionalInstruction = additionalInstruction;
    }

    public Date getStartDateAndTime() {
        return startDateAndTime;
    }

    public void setStartDateAndTime(Date startDateAndTime) {
        this.startDateAndTime = startDateAndTime;
    }

    public Date getEndDateAndTime() {
        return endDateAndTime;
    }

    public void setEndDateAndTime(Date endDateAndTime) {
        this.endDateAndTime = endDateAndTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
