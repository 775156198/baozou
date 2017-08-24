package dao;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database.Database;
import myinterface.FillData;
import vo.OrderanddetailVo;

public class OrderanddetailDao extends Database{
	FillData<OrderanddetailVo> fillData=new FillData<OrderanddetailVo>(){

		@Override
		public OrderanddetailVo fillDate(Map<String, Object> map) {
			OrderanddetailVo vo = new OrderanddetailVo();
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()){
				String key = it.next();
				Object value = map.get(key);
				if(key.equals("order_id")){
					vo.setOrder_id((String)value);
				}else if(key.equals("customer_phone_number")){
					vo.setCustomer_phone_number((String)value);
				}else if(key.equals("number")){
					vo.setNumber((Integer)value);
				}else if(key.equals("order_status")){
					vo.setOrder_status((String)value);
				}else if(key.equals("payment_method")){
					vo.setPayment_method((String)value);
				}else if(key.equals("total_price")){
					vo.setTotal_price((Integer)value);
				}else if(key.equals("freight")){
					vo.setFreight((Integer)value);
				}else if(key.equals("create_time")){
					vo.setCreate_time((Timestamp)value);
				}else if(key.equals("pay_time")){
					vo.setPay_time((Timestamp)value);
				}else if(key.equals("delivery_time")){
					vo.setDelivery_time((Timestamp)value);
				}else if(key.equals("receipt_time")){
					vo.setReceipt_time((Timestamp)value);
				}else if(key.equals("address_id")){
					vo.setAddress_id((String)value);
				}else if(key.equals("details_id")){
					vo.setDetails_id((String)value);
				}else if(key.equals("goods_id")){
					vo.setGoods_id((String)value);
				}else if(key.equals("goods_num")){
					vo.setGoods_num((Integer)value);
				}else if(key.equals("isGoods")){
					vo.setIsGoods((Integer)value);
				}else if(key.equals("status")){
					vo.setStatus((String)value);
				}
			}
			return vo;
		}	
	};
	
	/**
	 * 根据订单ID查询订单详情详情信息，用于点击进入详情页面
	 * @param orderid
	 * @return
	 */
	public List<OrderanddetailVo> getOrderdetail(String orderid){
		String sql="select order_tb.order_id,order_tb.customer_phone_number,order_tb.number,order_tb.order_status,order_tb.payment_method,order_tb.total_price,order_tb.freight_price,order_tb.create_time,order_tb.pay_time,order_tb.delivery_time,order_tb.receipt_time,order_tb.address_id,order_details_tb.details_id,order_details_tb.goods_id,order_details_tb.goods_num,order_details_tb.IsGood,order_details_tb.`status` from order_tb INNER JOIN order_details_tb on order_tb.order_id=order_details_tb.order_id where order_tb.order_id=? ";
		List<OrderanddetailVo> executeQuery=this.executeQuery(sql, fillData,orderid);
		this.close();
		return executeQuery;
	}
	
	/**
	 * 根据会员号查询，用于精确查找和详情显示借，界面
	 * @param phonenumber
	 * @return
	 */
	public List<OrderanddetailVo> getOrderdetailByphonenumber(String phonenumber){
		String sql="select order_tb.order_id,order_tb.customer_phone_number,order_tb.number,order_tb.order_status,order_tb.payment_method,order_tb.total_price,order_tb.freight_price,order_tb.create_time,order_tb.pay_time,order_tb.delivery_time,order_tb.receipt_time,order_tb.address_id,order_details_tb.details_id,order_details_tb.goods_id,order_details_tb.goods_num,order_details_tb.IsGood,order_details_tb.`status` from order_tb INNER JOIN order_details_tb on order_tb.order_id=order_details_tb.order_id where order_tb.customer_phone_number=? ";
		List<OrderanddetailVo> executeQuery=this.executeQuery(sql, fillData,phonenumber);
		this.close();
		return executeQuery;
	}
}
