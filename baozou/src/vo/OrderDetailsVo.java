package vo;

public class OrderDetailsVo {
	private String details_id;
	private String order_id;
	private String goods_id;
	private int goods_num;
	private int isGoods;
	private double total_price;
	private String status;
	public OrderDetailsVo() {
		super();
	}
	public OrderDetailsVo(String details_id, String order_id, String goods_id, int goods_num, int isGoods,
			double total_price, String status) {
		super();
		this.details_id = details_id;
		this.order_id = order_id;
		this.goods_id = goods_id;
		this.goods_num = goods_num;
		this.isGoods = isGoods;
		this.total_price = total_price;
		this.status = status;
	}
	public String getDetails_id() {
		return details_id;
	}
	public void setDetails_id(String details_id) {
		this.details_id = details_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public int getGoods_num() {
		return goods_num;
	}
	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}
	public int getIsGoods() {
		return isGoods;
	}
	public void setIsGoods(int isGoods) {
		this.isGoods = isGoods;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderDetails [details_id=" + details_id + ", order_id=" + order_id + ", goods_id=" + goods_id
				+ ", goods_num=" + goods_num + ", isGoods=" + isGoods + ", total_price=" + total_price + ", status="
				+ status + "]";
	}
	
	
}
