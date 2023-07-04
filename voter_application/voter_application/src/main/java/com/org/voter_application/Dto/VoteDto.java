package com.org.voter_application.Dto;

public class VoteDto {
        private Long voteId;

        private String voterId;

        private boolean isVoted;

        private Long partyId;

        private String candidateVoterId;

        private String voterName;

    public VoteDto() {
    }

    public Long getVoteId() {
        return voteId;
    }

    public void setVoteId(Long voteId) {
        this.voteId = voteId;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public boolean isVoted() {
        return isVoted;
    }

    public void setVoted(boolean voted) {
        isVoted = voted;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public String getCandidateVoterId() {
        return candidateVoterId;
    }

    public void setCandidateVoterId(String candidateVoterId) {
        this.candidateVoterId = candidateVoterId;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    @Override
    public String toString() {
        return "VoteDto{" +
                "voteId=" + voteId +
                ", voterId='" + voterId + '\'' +
                ", isVoted=" + isVoted +
                ", partyId=" + partyId +
                ", candidateVoterId='" + candidateVoterId + '\'' +
                ", voterName='" + voterName + '\'' +
                '}';
    }
}
