import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerServiceImpl();
		
		for (Customer customer : customerService.findAll()) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
		}
	}

}
