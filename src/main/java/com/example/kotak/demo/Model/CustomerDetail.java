package com.example.kotak.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class CustomerDetail {
    private int cId;
    private String customerName;
    private String customerGender;
    private String mobileNo;
    private long accountNo;
    private String panNo;
    private Double accBalance;
    private Date createdDate;
}
