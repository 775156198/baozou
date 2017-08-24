package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
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
			OrderVo ov=new OrderVo();
			//遍历
			Iterator<String> it=map.keySet().iterator();
			
			while(it.hasNext()){
				String key=it.next();//设置键
				Object value=map.get(key);//设置值（键值对）
				if(key.equals("order_id")){
					ov.setOrder_id((String)value);
				}else if(key.equals("customer_phone_number")){
					ov.setCustomer_phone_number((String)value);
				}else if(key.equals("number")){
					ov.setNumber((int)value);
				}else if(key.equals("order_status")){
					ov.setOrder_status((String)value);
				}else if(key.equals("payment_method")){
					ov.setPayment_method((String)value);
				}else if(key.equals("total_price")){
					ov.setTotal_price((double)value);
				}else if(key.equals("freight")){
					ov.setFreight((int)value);
				}else if(key.equals("create_time")){ 
					ov.setCreate_time((Timestamp)value);
				}else if(key.equals("pay_time")){
					ov.setPay_time((Timestamp)value);
				}else if(key.equals("delivery_time")){
					ov.setDelivery_time((Timestamp)value);
				}else if(key.equals("receipt_time")){
					ov.setReceipt_time((Timestamp)value);
				}else{
					ov.setAddress_id((String)value);
				}
			}
			return ov;
		}
	};
	
	/**
	 * 分页查询 查询所有订单信息（卖家）时间优先
	 * @param page
	 * @return
	 */
	public List<OrderVo> getAllOrderInfo(int page){
		page = (page-1)*10;
		String sql = "select * from order_tb ORDER BY create_time desc limit ?,10";
		List<OrderVo> list = this.executeQuery(sql, fillData,page);
		return list;
	}
	
	/**
	 * 查询所有订单信息(卖家)
	 * @return list<OrderVo>
	 */
	public List<OrderVo> getAllOrderInfo(){
		String sql="select * from order_tb ORDER BY create_time desc";
		List<OrderVo> list = this.executeQuery(sql, fillData);
		return list;
	}
	
	/**
	 * 分页查询 查询所有订单（买家）
	 * @param customer_phone_number
	 * @param page 页数
	 * @return
	 */
	public List<OrderVo> getAllOrderInfoByCustomerPhone(String customer_phone_number,int page){
		page = (page-1)*10;
		String sql = "select * from order_tb where customer_phone_number=? limit ?,10";
		List<OrderVo> list = this.executeQuery(sql, fillData,customer_phone_number,page);
		return list;
	}
	
	/**
	 * 根据手机号查询所有订单(买家、卖家)
	 * @param customer_phone_number 用户手机号
	 * @return
	 */

	public List<OrderVo> getAllOrderInfoByCustomerPhone(String customer_phone_number){
		String sql="select * from order_tb where customer_phone_number=? ORDER BY create_time desc";
		List<OrderVo> list = this.executeQuery(sql, fillData, customer_phone_number);
		return list;
	}
	
	/**
	 * 添加订单
	 * @param ov	新的订单实体类
	 * @return
	 * @throws SQLException
	 */
	public int addOrderInfo(OrderVo ov) throws SQLException{
		String sql="insert into order_tb(order_id,customer_phone_number,number,order_status,payment_method,total_price,freight_price,create_time,address_id) values(?,?,?,?,?,?,?,?,?)";
		int row=-1;
		try {
			row=this.executeUpdate(sql,autoGetOrderId(),ov.getCustomer_phone_number(),ov.getNumber(),ov.getOrder_status(),ov.getPayment_method(),ov.getTotal_price(),ov.getFreight(),ov.getCreate_time(),ov.getAddress_id());
		} catch (SQLException e) {
			throw new SQLException("数据库操作有误");
		}finally{
			this.close();
		}
		
		return row;
	}
	
	/**
	 * 修改订单状态
	 * @param phone 获取到的手机号。订单状态
	 * @param order_status
	 * @return
	 * @throws SQLException 
	 */
	public int updateOrderInfoByPhone(String phone,String order_id,String order_status) throws SQLException{
		String sql="update order_tb set order_status=? where customer_phone_number=? and order_id=?";
		int row=-1;
		try {
			row=this.executeUpdate(sql, order_status,phone,order_id);
		} catch (SQLException e) {
			throw new SQLException("数据库操作有误");
		}finally{
			this.close();
		}
		return row;
	}
	
	/**
	 * 通过状态查询订单（卖家）
	 * @param order_status 订单状态
	 * @return list《OrderVo》集合
	 */
	public List<OrderVo> getOrderInfoByStatus(String order_status){
		String sql="select * from order_tb where order_status=?";
		List<OrderVo> list=this.executeQuery(sql, fillData, order_status);
		return list;
		
	}
	
	/**
	 * 通过订单状态查询用户的订单（买家）
	 * @param phone
	 * @param order_status
	 * @return
	 */
	public List<OrderVo> getOrderInfoStatusByphone(String phone,String order_status){
		String sql="select * from order_tb where customer_phone_number=? and order_status=?";
		List<OrderVo> list = this.executeQuery(sql, fillData, phone,order_status);
		return list;
	}
	
	/**
	 * 自动获取订单id
	 * @return
	 */
	private String autoGetOrderId() {
		// TODO Auto-generated method stub
		return null;
	}
}
