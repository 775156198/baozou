package vo;

public class OrderanddetailVo {
	private String order_id;
	private String customer_phone_number;
	private int number; //购买数量
	private String order_status;//订单状态
	private String payment_method;//支付方式
	private double total_price;//总额
	private int freight;//运费
	private String create_time;//订单创建时间
	private String pay_time;//支付时间
	private String delivery_time;//发货时间
	private String receipt_time;//收货时间
	private String address_id;//地址id
	private String details_id;
	private String goods_id;
	private int goods_num;
	private int isGoods;
	private String status;
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
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getPay_time() {
		return pay_time;
	}
	public void setPay_time(String pay_time) {
		this.pay_time = pay_time;
	}
	public String getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}
	public String getReceipt_time() {
		return receipt_time;
	}
	public void setReceipt_time(String receipt_time) {
		this.receipt_time = receipt_time;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getDetails_id() {
		return details_id;
	}
	public void setDetails_id(String details_id) {
		this.details_id = details_id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public int getGoods_num() {
		return goods_num;
	}
	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}
	public int getIsGoods() {
		return isGoods;
	}
	public void setIsGoods(int isGoods) {
		this.isGoods = isGoods;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public OrderanddetailVo(String order_id, String customer_phone_number, int number, String order_status,
			String payment_method, double total_price, int freight, String create_time, String pay_time,
			String delivery_time, String receipt_time, String address_id, String details_id, String goods_id,
			int goods_num, int isGoods, String status) {
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
		this.details_id = details_id;
		this.goods_id = goods_id;
		this.goods_num = goods_num;
		this.isGoods = isGoods;
		this.status = status;
	}
	public OrderanddetailVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderanddetailVo [order_id=" + order_id + ", customer_phone_number=" + customer_phone_number
				+ ", number=" + number + ", order_status=" + order_status + ", payment_method=" + payment_method
				+ ", total_price=" + total_price + ", freight=" + freight + ", create_time=" + create_time
				+ ", pay_time=" + pay_time + ", delivery_time=" + delivery_time + ", receipt_time=" + receipt_time
				+ ", address_id=" + address_id + ", details_id=" + details_id + ", goods_id=" + goods_id
				+ ", goods_num=" + goods_num + ", isGoods=" + isGoods + ", status=" + status + "]";
	}
	
}
