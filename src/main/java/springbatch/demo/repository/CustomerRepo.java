package springbatch.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springbatch.demo.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
