package com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ISSLCustomer  implements Serializable {
  @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerName;
    private String customerEmail;
    private String customerJobTitle;
    private String customerPhoneNum;
    @Column(nullable = false,updatable = false)
    private String customerCode;

    public ISSLCustomer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerJobTitle() {
        return customerJobTitle;
    }

    public void setCustomerJobTitle(String customerJobTitle) {
        this.customerJobTitle = customerJobTitle;
    }

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "ISSLCustomer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerJobTitle='" + customerJobTitle + '\'' +
                ", customerPhoneNum='" + customerPhoneNum + '\'' +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}
