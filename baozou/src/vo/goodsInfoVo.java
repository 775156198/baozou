package vo;

public class goodsInfoVo {
	
	private String goods_id;//商品id
	private String goods_name;//商品名字
	private String goods_state;//商品状态
	private String goods_category;//类别编号
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
	
	public goodsInfoVo(String goods_id, String goods_name, String goods_state, String goods_category) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_state = goods_state;
		this.goods_category = goods_category;
	}
	public goodsInfoVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return   goods_id + "\t" + goods_name + "\t" + goods_state
				+ "\t" + goods_category ;
	}
	
}
