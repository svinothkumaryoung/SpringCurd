package in.iisn.springcurd.services;

import in.iisn.springcurd.model.CustomerInfo;
import in.iisn.springcurd.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServices {
    @Autowired
    CustomerRepo customerRepo;

    public CustomerInfo addData(CustomerInfo customerInfo){
        return customerRepo.save(customerInfo);
    }

}
