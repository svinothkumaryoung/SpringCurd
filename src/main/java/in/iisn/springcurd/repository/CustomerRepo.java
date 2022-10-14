package in.iisn.springcurd.repository;

import in.iisn.springcurd.controller.CustomerController;
import in.iisn.springcurd.model.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.GeneratedValue;
import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerInfo,Integer> {

    Optional<CustomerInfo> findByMobileNo(long mobileNo);
    Optional<CustomerInfo> findByMobileNoAndName(long mobileNo,String name);

}
