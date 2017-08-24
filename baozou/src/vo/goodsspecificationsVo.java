package vo;

public class goodsspecificationsVo {
	
	private String specification_id;//商品规格编号
	private String goods_price;//商品单价
	private String goods_size;//商品尺码
	private String goods_color;//商品颜色
	private int goods_number;//商品数量
	private String goods_name;//商品名称
	public goodsspecificationsVo(String specification_id, String goods_price, String goods_size, String goods_color,
			int goods_number, String goods_name) {
		super();
		this.specification_id = specification_id;
		this.goods_price = goods_price;
		this.goods_size = goods_size;
		this.goods_color = goods_color;
		this.goods_number = goods_number;
		this.goods_name = goods_name;
	}
	public goodsspecificationsVo() {
		super();
	}
	public String getSpecification_id() {
		return specification_id;
	}
	public void setSpecification_id(String specification_id) {
		this.specification_id = specification_id;
	}
	public String getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}
	public String getGoods_size() {
		return goods_size;
	}
	public void setGoods_size(String goods_size) {
		this.goods_size = goods_size;
	}
	public String getGoods_color() {
		return goods_color;
	}
	public void setGoods_color(String goods_color) {
		this.goods_color = goods_color;
	}
	public int getGoods_number() {
		return goods_number;
	}
	public void setGoods_number(int goods_number) {
		this.goods_number = goods_number;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	@Override
	public String toString() {
		return "goodsspecificationsVo [specification_id=" + specification_id + ", goods_price=" + goods_price
				+ ", goods_size=" + goods_size + ", goods_color=" + goods_color + ", goods_number=" + goods_number
				+ ", goods_name=" + goods_name + "]";
	}
	
}
