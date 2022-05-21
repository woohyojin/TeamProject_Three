package com.example.othercock.adapter;

public class UserInfoDto {
    private int UserStamp;
    private String UserId;
    private String UserPw;
    private String UserName;
    private String UserEmail;
    private String UserPhone;
    private String UserNick;


    public UserInfoDto(int UserStamp, String UserId, String UserPw, String UserName, String UserEmail,
                       String UserPhone, String UserNick) {
        this.UserId = UserId;
        this.UserPw = UserPw;
        this.UserName = UserName;
        this.UserEmail = UserEmail;
        this.UserPhone = UserPhone;
        this.UserNick = UserNick;
        this.UserStamp = UserStamp;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserPw() {
        return UserPw;
    }

    public void setUserPw(String userPw) {
        UserPw = userPw;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }

    public String getUserNick() {
        return UserNick;
    }

    public void setUserNick(String userNick) {
        UserNick = userNick;
    }

    public int getUserStamp() {
        return UserStamp;
    }

    public void setUserStamp(int userStamp) {
        UserStamp = userStamp;
    }

    @Override
    public String toString() {
        return "UserInfoDto{" +
                "UserStamp=" + UserStamp +
                ", UserId='" + UserId + '\'' +
                ", UserPw='" + UserPw + '\'' +
                ", UserName='" + UserName + '\'' +
                ", UserEmail='" + UserEmail + '\'' +
                ", UserPhone='" + UserPhone + '\'' +
                ", UserNick='" + UserNick + '\'' +
                '}';
    }
}
