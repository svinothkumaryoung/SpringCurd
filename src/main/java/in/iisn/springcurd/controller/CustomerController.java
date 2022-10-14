package in.iisn.springcurd.controller;

import in.iisn.springcurd.model.CustomerInfo;
import in.iisn.springcurd.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerServices customerServices;

    @PostMapping("/add")
    public CustomerInfo AddCustomer(@Valid @RequestBody CustomerInfo customerInfo){
        return customerServices.addData(customerInfo);
    }
    @GetMapping("/reteriveData")
    public List<CustomerInfo> getCustomerDetails()
    {
        return customerServices.viewAllData();
    }
    @GetMapping("/reteriveOne/{ID}")
    public Optional<CustomerInfo> getOneCustomerDetails(@PathVariable (value = "ID") int id)
    {
        return customerServices.getOneRecords(id);
    }
    @GetMapping("/reterivebyMobileNo/{mobileNo}")
    public Optional<CustomerInfo> getOneCustomerDetails(@PathVariable (value = "mobileNo") long mobileNo)
    {
        return customerServices.getOneRecordsByMobileNo(mobileNo);
    }

    @GetMapping("/reterive/{mobile}/{name}")
    public Optional<CustomerInfo> getByMobileName
            (@PathVariable (value = "mobile") long mob,
             @PathVariable (value = "name") String name){
        return customerServices.getOneRecordsByMobileNoAndName(mob, name);
    }




}
