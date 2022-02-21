package com.example.kotak.demo.Dao.Impl;

import com.example.kotak.demo.Dao.Schema.TransactionSchema;
import com.example.kotak.demo.Dao.TransactionServiceKotakDao;
import com.example.kotak.demo.Model.CustomerDetail;
import com.example.kotak.demo.Model.TransactionDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
@Transactional
public class TransactionServiceKotakDaoImpl implements TransactionServiceKotakDao {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

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
        int id=jdbcTemplate.update(TransactionSchema.CREATE_CUSTOMER,TransactionSchema.addParameter(customerDetail));
        return id;
    }

    @Override
    public int updateCustomer(CustomerDetail customerDetail) {
        return 0;
    }
}
