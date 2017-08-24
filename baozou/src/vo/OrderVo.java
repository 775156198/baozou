package vo;

import java.sql.Date;
import java.sql.Timestamp;

public class OrderVo {
	 private String order_id;
	 private String customer_phone_number;
	 private int number; //购买数量
	 private String order_status;//订单状态
	 private String payment_method;//支付方式
	 private double total_price;//总额
	 private int freight;//运费
	 private Timestamp create_time;//订单创建时间
	 private Timestamp pay_time;//支付时间
	 private Timestamp delivery_time;//发货时间
	 private Timestamp receipt_time;//收货时间
	 private String address_id;//地址id

	

	public OrderVo(String order_id, String customer_phone_number, int number, String order_status,
			String payment_method, double total_price, int freight, Timestamp create_time, Timestamp pay_time,
			Timestamp delivery_time, Timestamp receipt_time, String address_id) {
		super();
		this.order_id = order_id;
		this.customer_phone_number = customer_phone_number;
		this.number = number;
		this.order_status = order_status;
		this.payment_method = payment_method;
		this.total_price = total_price;
		this.freight = freight;
		this.create_time = create_time;
		this.pay_time = pay_time;
		this.delivery_time = delivery_time;
		this.receipt_time = receipt_time;
		this.address_id = address_id;
	}



	public OrderVo() {
		super();
	}



	public String getOrder_id() {
		return order_id;
	}



	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}



	public String getCustomer_phone_number() {
		return customer_phone_number;
	}



	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public String getOrder_status() {
		return order_status;
	}



	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}



	public String getPayment_method() {
		return payment_method;
	}



	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}



	public double getTotal_price() {
		return total_price;
	}



	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}



	public int getFreight() {
		return freight;
	}



	public void setFreight(int freight) {
		this.freight = freight;
	}



	public Timestamp getCreate_time() {
		return create_time;
	}



	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}



	public Timestamp getPay_time() {
		return pay_time;
	}



	public void setPay_time(Timestamp pay_time) {
		this.pay_time = pay_time;
	}



	public Timestamp getDelivery_time() {
		return delivery_time;
	}



	public void setDelivery_time(Timestamp delivery_time) {
		this.delivery_time = delivery_time;
	}



	public Timestamp getReceipt_time() {
		return receipt_time;
	}



	public void setReceipt_time(Timestamp receipt_time) {
		this.receipt_time = receipt_time;
	}



	public String getAddress_id() {
		return address_id;
	}



	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}



	@Override
	public String toString() {
		return  order_id + "\t\t" + customer_phone_number + "\t\t"
				+ number + "\t\t" + order_status + "\t\t" + payment_method + "\t\t"
				+ total_price + "\t\t" + freight + "\t\t" + create_time + "\t\t" + pay_time
				+ "\t\t" + delivery_time + "\t\t" + receipt_time + "\t\t" + address_id
				;
	}
	 
	 
	
}
