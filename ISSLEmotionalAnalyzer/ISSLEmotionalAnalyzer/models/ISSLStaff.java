package com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ISSLStaff  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String staffName;
    private String imageUrl;
    private String staffEmail;
    private String staffJobTitle;
    private String staffPhoneNum;
    @Column(nullable = false,updatable = false)
    private String staffCode;

    public  ISSLStaff(){

    }
    public  ISSLStaff(Long id, String staffName,String imageUrl,String staffEmail,String staffJobTitle,String staffPhoneNum,String staffCode)
    {

        this.id = id;
        this.imageUrl = imageUrl;
        this.staffName = staffName;
        this.staffEmail = staffEmail;
        this.staffJobTitle= staffJobTitle;
        this.staffPhoneNum = staffPhoneNum;
        this.staffCode = staffCode;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStaffJobTitle() {
        return staffJobTitle;
    }

    public void setStaffJobTitle(String staffJobTitle) {
        this.staffJobTitle = staffJobTitle;
    }

    public String getStaffPhoneNum() {
        return staffPhoneNum;
    }

    public void setStaffPhoneNum(String staffPhoneNum) {
        this.staffPhoneNum = staffPhoneNum;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    @Override
    public String toString() {
        return "ISSLStaff{" +
                "id=" + id +
                ", staffName='" + staffName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", staffEmail='" + staffEmail + '\'' +
                ", staffJobTitle='" + staffJobTitle + '\'' +
                ", staffPhoneNum='" + staffPhoneNum + '\'' +
                ", staffCode='" + staffCode + '\'' +
                '}';
    }
}
