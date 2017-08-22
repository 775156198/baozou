package vo;

public class goodsspecificationsVo {
	
	private String specification_id;//商品规格编号
	private String goods_price;//商品单价
	private String goods_size;//商品尺码
	private String goods_color;//商品颜色
	private int goods_number;//商品数量
	
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
	public goodsspecificationsVo(String specification_id, String goods_price, String goods_size, String goods_color,
			int goods_number) {
		super();
		this.specification_id = specification_id;
		this.goods_price = goods_price;
		this.goods_size = goods_size;
		this.goods_color = goods_color;
		this.goods_number = goods_number;
	}
	public goodsspecificationsVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  specification_id + "\t" + goods_price
				+ "\t" + goods_size + "\t" + goods_color + "\t" + goods_number
				;
	}
	
	
	
}
