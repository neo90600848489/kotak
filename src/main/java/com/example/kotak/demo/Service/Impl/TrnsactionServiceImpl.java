package com.example.kotak.demo.Service.Impl;

import com.example.kotak.demo.Model.CustomerDetail;
import com.example.kotak.demo.Model.TransactionDetail;
import com.example.kotak.demo.Service.TransactionServiceKotak;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TrnsactionServiceImpl implements TransactionServiceKotak {

    @Override
    public List<TransactionDetail> getTenTransaction() {
        return null;
    }

    @Override
    public long getBalance(long accountNo) {
        return 0;
    }

    @Override
    public int updateBalance(TransactionDetail transactionDetail) {
        return 0;
    }

    @Override
    public int createCutomer(CustomerDetail customerDetail) {
        return 0;
    }

    @Override
    public int updateCustomer(CustomerDetail customerDetail) {
        return 0;
    }
}
