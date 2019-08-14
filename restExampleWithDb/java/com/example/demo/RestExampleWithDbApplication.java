package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Payment;
import com.example.demo.services.PaymentService;

@SpringBootApplication
public class RestExampleWithDbApplication {

	public static void main(String[] args) {
    ConfigurableApplicationContext ctx= SpringApplication.run(RestExampleWithDbApplication.class, args);
    
    PaymentService service =ctx.getBean(PaymentService.class);
//    
    Payment pmt=ctx.getBean(Payment.class);
//    
    pmt.setCustomerName("Ram");
    pmt.setTxnAmount(14500.00);
   pmt.setTxnId(10222);
    
    service.save(pmt);
    
	}

}
