package vo;

import java.sql.Timestamp;

public class CollectionVo {
	private String customer_phone_number;
	private String goods_id;
	private Timestamp collect_time;
	private int number;
	public String getCustomer_phone_number() {
		return customer_phone_number;
	}
	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public Timestamp getCollect_time() {
		return collect_time;
	}
	public void setCollect_time(Timestamp collect_time) {
		this.collect_time = collect_time;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public CollectionVo(String customer_phone_number, String goods_id, Timestamp collect_time, int number) {
		super();
		this.customer_phone_number = customer_phone_number;
		this.goods_id = goods_id;
		this.collect_time = collect_time;
		this.number = number;
	}
	public CollectionVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CollectionVo [customer_phone_number=" + customer_phone_number + ", goods_id=" + goods_id
				+ ", collect_time=" + collect_time + ", number=" + number + "]";
	}
	
	
}
