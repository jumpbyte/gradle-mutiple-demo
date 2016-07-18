package  utour.travel.pojo;

import java.util.Date;

/*
-----------------------
* 类名称：User
* 描述：
* 创建日期：2016/6/21
* 创建者：yuanjinan
* http://jumpbyte.com/
--------------------------
*/
public class User {

    private int userId;
    private String userName;
    private String loginName;
    private int sex;
    private Date birthDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public User() {

    }

    public User(int userId, String userName, String loginName, int sex, Date birthDate) {
        this.userId = userId;
        this.userName = userName;
        this.loginName = loginName;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                '}';
    }
}
