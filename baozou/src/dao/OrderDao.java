package dao;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database.Database;
import myinterface.FillData;
import vo.OrderVo;

public class OrderDao extends Database{
	FillData<OrderVo> fillData=new FillData<OrderVo>(){

		@Override
		public OrderVo fillDate(Map<String, Object> map) {
			OrderVo vo = new OrderVo();
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
					vo.setTotal_price((Double)value);
				}else if(key.equals("freight_price")){
					vo.setFreight((Integer)value);;
				}else if(key.equals("create_time")){
					vo.setCreate_time((Date)value);
				}else if(key.equals("pay_time")){
					vo.setPay_time((Date)value);
				}else if(key.equals("delivery_time")){
					vo.setDelivery_time((Date)value);
				}else if(key.equals("receipt_time")){
					vo.setReceipt_time((Date)value);
				}else if(key.equals("address_id")){
					vo.setAddress_id((String)value);
				}
			}
			return vo;
		}	
	};
	
	/**
	 * 查询所有订单 ，时间优先
	 * @return
	 */
	public List<OrderVo> getAllOrder(){
		String sql="select * from order_tb ORDER BY create_time desc";
		List<OrderVo> executeQuery=this.executeQuery(sql, fillData);
		this.close();
		return executeQuery;
	}
}
