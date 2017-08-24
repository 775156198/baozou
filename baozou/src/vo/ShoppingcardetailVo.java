package vo;

import java.sql.Date;

public class ShoppingcardetailVo {
	private String customer_phone_number;
	private String goods_id;
	private Date time;
	private String goods_name;
	private String quality_id;
	private String goods_color;
	private String goods_size;
	private int number;
	private double goods_price;
	private double total_price;
	private String goods_introduce;//商品详细介绍
	private int favorable_quantity; //好评量
	private int differential_quantity; //差评量
	private int collection_quantity;//收藏量
	private int sales_volum;//销量
	private String img_s;
	private String img_m;
	private String img_b;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
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
	public String getGoods_introduce() {
		return goods_introduce;
	}
	public void setGoods_introduce(String goods_introduce) {
		this.goods_introduce = goods_introduce;
	}
	public int getFavorable_quantity() {
		return favorable_quantity;
	}
	public void setFavorable_quantity(int favorable_quantity) {
		this.favorable_quantity = favorable_quantity;
	}
	public int getDifferential_quantity() {
		return differential_quantity;
	}
	public void setDifferential_quantity(int differential_quantity) {
		this.differential_quantity = differential_quantity;
	}
	public int getCollection_quantity() {
		return collection_quantity;
	}
	public void setCollection_quantity(int collection_quantity) {
		this.collection_quantity = collection_quantity;
	}
	public int getSales_volum() {
		return sales_volum;
	}
	public void setSales_volum(int sales_volum) {
		this.sales_volum = sales_volum;
	}
	public String getImg_s() {
		return img_s;
	}
	public void setImg_s(String img_s) {
		this.img_s = img_s;
	}
	public String getImg_m() {
		return img_m;
	}
	public void setImg_m(String img_m) {
		this.img_m = img_m;
	}
	public String getImg_b() {
		return img_b;
	}
	public void setImg_b(String img_b) {
		this.img_b = img_b;
	}
	public ShoppingcardetailVo(String customer_phone_number, String goods_id, Date time, String goods_name,
			String quality_id, String goods_color, String goods_size, int number, double goods_price,
			double total_price, String goods_introduce, int favorable_quantity, int differential_quantity,
			int collection_quantity, int sales_volum, String img_s, String img_m, String img_b) {
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
		this.goods_introduce = goods_introduce;
		this.favorable_quantity = favorable_quantity;
		this.differential_quantity = differential_quantity;
		this.collection_quantity = collection_quantity;
		this.sales_volum = sales_volum;
		this.img_s = img_s;
		this.img_m = img_m;
		this.img_b = img_b;
	}
	public ShoppingcardetailVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ShoppingcardetailVo [customer_phone_number=" + customer_phone_number + ", goods_id=" + goods_id
				+ ", time=" + time + ", goods_name=" + goods_name + ", quality_id=" + quality_id + ", goods_color="
				+ goods_color + ", goods_size=" + goods_size + ", number=" + number + ", goods_price=" + goods_price
				+ ", total_price=" + total_price + ", goods_introduce=" + goods_introduce + ", favorable_quantity="
				+ favorable_quantity + ", differential_quantity=" + differential_quantity + ", collection_quantity="
				+ collection_quantity + ", sales_volum=" + sales_volum + ", img_s=" + img_s + ", img_m=" + img_m
				+ ", img_b=" + img_b + "]";
	}
	
	
	
}
