package vo;

public class goodsrefundVo {
	
	private String refund_id;//退款id
	private String customer_phone_number;//用户账号
	private String order_id;//订单编号
	private String refund_reason;//退款原因
	public String getRefund_id() {
		return refund_id;
	}
	public void setRefund_id(String refund_id) {
		this.refund_id = refund_id;
	}
	public String getCustomer_phone_number() {
		return customer_phone_number;
	}
	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getRefund_reason() {
		return refund_reason;
	}
	public void setRefund_reason(String refund_reason) {
		this.refund_reason = refund_reason;
	}
	public goodsrefundVo(String refund_id, String customer_phone_number, String order_id, String refund_reason) {
		super();
		this.refund_id = refund_id;
		this.customer_phone_number = customer_phone_number;
		this.order_id = order_id;
		this.refund_reason = refund_reason;
	}
	public goodsrefundVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return refund_id + "\t" + customer_phone_number
				+ "\t" + order_id + "\t" + refund_reason;
	}
	
}
