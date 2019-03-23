package org.conti.example.jpah2sb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcPgDemoApplication{

	Logger logger=LoggerFactory.getLogger(getClass());
//	@Autowired
//	AdminService service;
//	@Autowired
//	CustomerService custService;
//	@Autowired
//	SupplierService supService;
//	@Autowired
//	ProductService	prodService;
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcPgDemoApplication.class, args);
	}

//	@Override
//	@Transactional
//	public void run(String... args) throws Exception {
//		logger.info("First msg");
//		service.addAdmin();
//		SystemAdmin admin = service.getAdminByName("admin");
//		logger.info("Admin 9876->{}",admin);
//		
//		custService.addCustomer("Praveen", "Kumar", "teprave", "laptop name?", "Lenovo");
//		Customer customer = custService.getCustomerByName("Praveen");
//		logger.info("Customer Praveen->{}",customer);
//		
//		supService.signUpSupplier("Pavan", "Swaroop", "dealKing", "IBM");
//		Supplier pavan = supService.getSupplierByUserName("dealKing");
//		logger.info("Supplier Pavan->{}",pavan);
//		
//		Product product = new Product();
//		product.setName("WizerForDomi");
//		product.setPrice(2000L);
//		product.setDescription("Essentials for beast Domi");
//		prodService.addProduct(product);
//		supService.addProduct("dealKing", product);
//		
//		Supplier supplier = supService.getSupplierByUserName("dealKing");
//		logger.info("Supplier Pavan->{}",supplier);
//		logger.info("Products Pavan->{},{}",supplier,supplier.getProducts());
//		
//		List<Product> prodList = new ArrayList<Product>();
//		prodList.add(product);
//		custService.placeOrder(prodList);
//	}

}

