package in.iisn.springcurd.services;

import in.iisn.springcurd.model.CustomerInfo;
import in.iisn.springcurd.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {
    @Autowired
    CustomerRepo customerRepo;

    public CustomerInfo addData(CustomerInfo customerInfo){
        return customerRepo.save(customerInfo);
    }

    public List<CustomerInfo> viewAllData()
    {
        return customerRepo.findAll();
    }
    public Optional<CustomerInfo> getOneRecords(int id)
    {
        return customerRepo.findById(id);
    }

    public Optional<CustomerInfo> getOneRecordsByMobileNo(long mobileNo) {
        return customerRepo.findByMobileNo(mobileNo);
    }
    public Optional<CustomerInfo> getOneRecordsByMobileNoAndName(long mobileNo,String name) {
        return customerRepo.findByMobileNoAndName(mobileNo,name);
    }
}
