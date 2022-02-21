package com.example.kotak.demo.Model;

import lombok.Data;

import java.util.Date;
@Data
public class TransactionDetail {
    private int id;
    private int transactionId;
    private int cid;
    private long accountNo;
    private String transactionValue;
    private Date transactionDate;
}
