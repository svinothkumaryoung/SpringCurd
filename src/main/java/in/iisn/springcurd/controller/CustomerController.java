package in.iisn.springcurd.controller;

import in.iisn.springcurd.model.CustomerInfo;
import in.iisn.springcurd.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerServices customerServices;

    @PostMapping("/add")
    public CustomerInfo AddCustomer(@Valid @RequestBody CustomerInfo customerInfo){
        return customerServices.addData(customerInfo);
    }
}
