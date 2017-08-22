package vo;

public class goodsDetailsVo {
	
	private String goods_id;//商品编号
	private String goods_introduce;//商品介绍
	private int favorable_quantity;//好评数量
	private int differential_quantity;//差评数量
	private int collection_quantity;//收藏数量
	private int sales_volum;//销量
	private String img_s;
	private String img_m;
	private String img_b;
	
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
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
	public goodsDetailsVo(String goods_id, String goods_introduce, int favorable_quantity, int differential_quantity,
			int collection_quantity, int sales_volum, String img_s, String img_m, String img_b) {
		super();
		this.goods_id = goods_id;
		this.goods_introduce = goods_introduce;
		this.favorable_quantity = favorable_quantity;
		this.differential_quantity = differential_quantity;
		this.collection_quantity = collection_quantity;
		this.sales_volum = sales_volum;
		this.img_s = img_s;
		this.img_m = img_m;
		this.img_b = img_b;
	}
	public goodsDetailsVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  goods_id + "\t" + goods_introduce + "\t"
				+ favorable_quantity + "\t" + differential_quantity + "\t"
				+ collection_quantity + "\t" + sales_volum + "\t" + img_s + "\t" + img_m
				+ "\t" + img_b;
	}
	

}
