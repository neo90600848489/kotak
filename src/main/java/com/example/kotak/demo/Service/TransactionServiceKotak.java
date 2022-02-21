package com.example.kotak.demo.Service;

import com.example.kotak.demo.Model.CustomerDetail;
import com.example.kotak.demo.Model.TransactionDetail;

import java.util.List;

public interface TransactionServiceKotak {
    List<TransactionDetail> getTenTransaction();
    long getBalance(long accountNo);
    int updateBalance(TransactionDetail transactionDetail);
    int createCutomer(CustomerDetail customerDetail);
    int updateCustomer(CustomerDetail customerDetail);
}
