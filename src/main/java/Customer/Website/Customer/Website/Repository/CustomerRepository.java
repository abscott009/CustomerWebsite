package Customer.Website.Customer.Website.Repository;


import Customer.Website.Customer.Website.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
