package springbatch.demo.config;

import org.springframework.batch.item.ItemProcessor;

import springbatch.demo.model.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
//		if(customer.getCountry().equals("United States")) {
//			return customer;
//		}else {
//			return null;
//		}
		return customer;
		
	}

}
