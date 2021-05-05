package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {	
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " "+ customer.getLastName()+ "  müþterisi eklendi");
		}else {
			System.out.println(customer.getNationalityId() + " Mernis sisteminde bulunamadý");
		}
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " "+ customer.getLastName()+ "  müþterisi silindi");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " "+ customer.getLastName()+ "  müþterisi güncellendi");
	}

}
