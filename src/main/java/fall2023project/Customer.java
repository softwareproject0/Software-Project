package fall2023project;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



public class Customer {
	private String name;
	private String address;
	private String phone;
	private String ID;
	private int type;
	protected static final List<Customer> CU = new ArrayList<Customer>() ;
	boolean logState;
	public double cost;
	String password;
	final Logger logger = Logger.getLogger(Customer.class.getName());
	
	
	public Customer(String name,String password,String address, String phone, String iD,double cost,int type) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		ID = iD;
		this.cost=cost;
		this.type=type;
		this.password=password;
	}
	public static List<Customer> getCU() {
		return CU;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	public void setType(int type) {
		this.type = type;
	}
		public int getType() {
		return type;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	

}