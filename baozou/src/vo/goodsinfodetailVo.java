package vo;

public class goodsinfodetailVo {
	private String goods_id;//商品id
	private String goods_name;//商品名字
	private String goods_state;//商品状态
	private String goods_category;//类别编号
	private String goods_introduce;//商品详细介绍
	private int favorable_quantity; //好评量
	private int differential_quantity; //差评量
	private int collection_quantity;//收藏量
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
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getGoods_state() {
		return goods_state;
	}
	public void setGoods_state(String goods_state) {
		this.goods_state = goods_state;
	}
	public String getGoods_category() {
		return goods_category;
	}
	public void setGoods_category(String goods_category) {
		this.goods_category = goods_category;
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
	public goodsinfodetailVo(String goods_id, String goods_name, String goods_state, String goods_category,
			String goods_introduce, int favorable_quantity, int differential_quantity, int collection_quantity,
			int sales_volum, String img_s, String img_m, String img_b) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_state = goods_state;
		this.goods_category = goods_category;
		this.goods_introduce = goods_introduce;
		this.favorable_quantity = favorable_quantity;
		this.differential_quantity = differential_quantity;
		this.collection_quantity = collection_quantity;
		this.sales_volum = sales_volum;
		this.img_s = img_s;
		this.img_m = img_m;
		this.img_b = img_b;
	}
	public goodsinfodetailVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "goodsinfodetailVo [goods_id=" + goods_id + ", goods_name=" + goods_name + ", goods_state=" + goods_state
				+ ", goods_category=" + goods_category + ", goods_introduce=" + goods_introduce
				+ ", favorable_quantity=" + favorable_quantity + ", differential_quantity=" + differential_quantity
				+ ", collection_quantity=" + collection_quantity + ", sales_volum=" + sales_volum + ", img_s=" + img_s
				+ ", img_m=" + img_m + ", img_b=" + img_b + "]";
	}
	
}
