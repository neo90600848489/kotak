package com.example.kotak.demo.Dao.Schema;

import com.example.kotak.demo.Model.CustomerDetail;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public class TransactionSchema {
    private TransactionSchema()
    {


    }
    public static final String CREATE_CUSTOMER="insert into customer_detail (customer_name,customer_gender,mobile_no,account_no,pan_no,acc_balance,created_date) values(:customerName,:CustomerGender,:MobileNo,:AccountNo,:PanNo,:AccBalance,:creationDate)";
    public static final String UPDATE_CUSTOMER="";
    public static final String UPDATE_BALANCE="";
    public static final String GET_TEN_TRANSACTION="";

    public static SqlParameterSource addParameter(CustomerDetail customerDetail)  {
        return new MapSqlParameterSource().addValue("customerName",customerDetail.getCustomerName())
                .addValue("CustomerGender",customerDetail.getCustomerGender())
                .addValue("AccBalance",customerDetail.getAccBalance())
                .addValue("AccountNo",customerDetail.getAccountNo())
                .addValue("CId",customerDetail.getCId())
                .addValue("MobileNo",customerDetail.getMobileNo())
                .addValue("PanNo",customerDetail.getPanNo())
                .addValue("creationDate", LocalDate.now());
    }
}


