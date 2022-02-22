package com.example.kotak.demo.Controller;

import com.example.kotak.demo.Model.CustomerDetail;
import com.example.kotak.demo.Model.TransactionDetail;
import com.example.kotak.demo.Service.TransactionServiceKotak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/kotak")
@RestController
public class FetchTransaction {
  //  public static final Logger LOGGER= Logger.getLogger(String.valueOf(FetchTransactionController.class));
    @Autowired
    private TransactionServiceKotak serviceKotak;
    @PostMapping()
    public ResponseEntity<Long> createCustomer(@RequestBody CustomerDetail customerDetail)
    {
        long id=serviceKotak.createCutomer(customerDetail);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }
    @PutMapping()
    public ResponseEntity<Long> updateCustomer(@RequestBody CustomerDetail customerDetail)
    {
        long noOfRowsAffected=serviceKotak.updateCustomer(customerDetail);
        return ResponseEntity.status(HttpStatus.OK).body(noOfRowsAffected);
    }
    @GetMapping("/lastTenTransactions")
    public ResponseEntity<List<TransactionDetail>> getlastTenTranstion()
    {
        List<TransactionDetail> transactionDetails=serviceKotak.getTenTransaction();
        return ResponseEntity.status(HttpStatus.OK).body(transactionDetails);
    }
    @GetMapping()
    public ResponseEntity<Long> checkBalance(@RequestParam long accountNo)
    {
        long balance=serviceKotak.getBalance(accountNo);
        return ResponseEntity.status(HttpStatus.OK).body(balance);
    }

}
