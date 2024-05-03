package org.example.entities;

public class Member {
    private int memberId;
    private String memberName;
    private String memberLastName;

    public Member() {
    }

    public Member(int memberId, String memberName, String memberLastName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberLastName = memberLastName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }
}
