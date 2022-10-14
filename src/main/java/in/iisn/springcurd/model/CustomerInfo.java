package in.iisn.springcurd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="customer_register")
public class CustomerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private int customerId;
    @Column(name="customer_name")
    @Size(min = 6,max = 12)
    private String name;
    @Column(name="customer_mobileno")
    private long mobileNo;
    @Column(name="customer_emailId")
    private String emailId;
    @Column(name="customer_pincode")
    private int pinCode;
}
