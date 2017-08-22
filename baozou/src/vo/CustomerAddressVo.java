package vo;

public class CustomerAddressVo {
	private String address_id;
	private String customer_phone_number;
	private String name;
	private String tel;
	private String phone_number;
	private String address;
	private int is_default;
	public CustomerAddressVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerAddressVo(String address_id, String customer_phone_number, String name, String tel,
			String phone_number, String address, int is_default) {
		super();
		this.address_id = address_id;
		this.customer_phone_number = customer_phone_number;
		this.name = name;
		this.tel = tel;
		this.phone_number = phone_number;
		this.address = address;
		this.is_default = is_default;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getCustomer_phone_number() {
		return customer_phone_number;
	}
	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIs_default() {
		return is_default;
	}
	public void setIs_default(int is_default) {
		this.is_default = is_default;
	}
	@Override
	public String toString() {
		return "CustomerAddressVo [address_id=" + address_id + ", customer_phone_number=" + customer_phone_number
				+ ", name=" + name + ", tel=" + tel + ", phone_number=" + phone_number + ", address=" + address
				+ ", is_default=" + is_default + "]";
	}
	
	
}
