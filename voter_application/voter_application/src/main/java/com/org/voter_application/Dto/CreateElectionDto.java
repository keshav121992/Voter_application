package com.org.voter_application.Dto;

import java.util.Date;

public class CreateElectionDto {

    private Long id;
    private String name;
    private Boolean includeInstructor;
    private String additionalInstruction;
    private Date startDateAndTime;
    private Date endDateAndTime;
    private boolean active;


    public CreateElectionDto(Long id, String name, Boolean includeInstructor, String additionalInstruction, Date startDateAndTime, Date endDateAndTime, boolean active) {
        this.id = id;
        this.name = name;
        this.includeInstructor = includeInstructor;
        this.additionalInstruction = additionalInstruction;
        this.startDateAndTime = startDateAndTime;
        this.endDateAndTime = endDateAndTime;
        this.active = active;
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

    @Override
    public String toString() {
        return "CreateElectionDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", includeInstructor=" + includeInstructor +
                ", additionalInstruction='" + additionalInstruction + '\'' +
                ", startDateAndTime=" + startDateAndTime +
                ", endDateAndTime=" + endDateAndTime +
                ", active=" + active +
                '}';
    }
}
