package vo;

import java.sql.Date;

public class CollectiondetailVo {
	private String customer_phone_number;
	private String goods_id;
	private Date collect_time;
	private String goods_introduce;//鍟嗗搧璇︾粏浠嬬粛
	private int favorable_quantity; //濂借瘎閲�
	private int differential_quantity; //宸瘎閲�
	private int collection_quantity;//鏀惰棌閲�
	private int sales_volum;//閿�閲�
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
	public Date getCollect_time() {
		return collect_time;
	}
	public void setCollect_time(Date collect_time) {
		this.collect_time = collect_time;
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
	public CollectiondetailVo(String customer_phone_number, String goods_id, Date collect_time,
			String goods_introduce, int favorable_quantity, int differential_quantity, int collection_quantity,
			int sales_volum, String img_s, String img_m, String img_b) {
		super();
		this.customer_phone_number = customer_phone_number;
		this.goods_id = goods_id;
		this.collect_time = collect_time;
		this.goods_introduce = goods_introduce;
		this.favorable_quantity = favorable_quantity;
		this.differential_quantity = differential_quantity;
		this.collection_quantity = collection_quantity;
		this.sales_volum = sales_volum;
		this.img_s = img_s;
		this.img_m = img_m;
		this.img_b = img_b;
	}
	public CollectiondetailVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CollectiondetailVo [customer_phone_number=" + customer_phone_number + ", goods_id=" + goods_id
				+ ", collect_time=" + collect_time + ", goods_introduce=" + goods_introduce + ", favorable_quantity="
				+ favorable_quantity + ", differential_quantity=" + differential_quantity + ", collection_quantity="
				+ collection_quantity + ", sales_volum=" + sales_volum + ", img_s=" + img_s + ", img_m=" + img_m
				+ ", img_b=" + img_b + "]";
	}
	
}
