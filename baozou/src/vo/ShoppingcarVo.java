package vo;

import java.sql.Date;
import java.sql.Timestamp;

public class ShoppingcarVo {
	private String customer_phone_number;
	private String goods_id;//商品ID
	private Timestamp time;//时间
	private String goods_name;
	private String quality_id;
	private String goods_color;
	private String goods_size;
	private int number;
	private double goods_price;
	private double total_price;
	private int is_failure;
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
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getQuality_id() {
		return quality_id;
	}
	public void setQuality_id(String quality_id) {
		this.quality_id = quality_id;
	}
	public String getGoods_color() {
		return goods_color;
	}
	public void setGoods_color(String goods_color) {
		this.goods_color = goods_color;
	}
	public String getGoods_size() {
		return goods_size;
	}
	public void setGoods_size(String goods_size) {
		this.goods_size = goods_size;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public int getIs_failure() {
		return is_failure;
	}
	public void setIs_failure(int is_failure) {
		this.is_failure = is_failure;
	}
	public ShoppingcarVo(String customer_phone_number, String goods_id, Timestamp time, String goods_name,
			String quality_id, String goods_color, String goods_size, int number, double goods_price,
			double total_price, int is_failure) {
		super();
		this.customer_phone_number = customer_phone_number;
		this.goods_id = goods_id;
		this.time = time;
		this.goods_name = goods_name;
		this.quality_id = quality_id;
		this.goods_color = goods_color;
		this.goods_size = goods_size;
		this.number = number;
		this.goods_price = goods_price;
		this.total_price = total_price;
		this.is_failure = is_failure;
	}
	public ShoppingcarVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ShoppingcarVo [customer_phone_number=" + customer_phone_number + ", goods_id=" + goods_id + ", time="
				+ time + ", goods_name=" + goods_name + ", quality_id=" + quality_id + ", goods_color=" + goods_color
				+ ", goods_size=" + goods_size + ", number=" + number + ", goods_price=" + goods_price
				+ ", total_price=" + total_price + ", is_failure=" + is_failure + "]";
	}
	
	
}
