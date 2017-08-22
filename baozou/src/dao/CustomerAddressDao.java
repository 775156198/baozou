package dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database.Database;
import myinterface.FillData;
import vo.CustomerAddressVo;

public class CustomerAddressDao extends Database{
	FillData<CustomerAddressVo> fillData = new FillData<CustomerAddressVo>(){

		@Override
		public CustomerAddressVo fillDate(Map<String, Object> map) {
			CustomerAddressVo v = new CustomerAddressVo();
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()){
				String key = it.next();
				Object value = map.get(key);
				
				if(key.equalsIgnoreCase("address_id")){
					v.setAddress_id((String)value);
				}else if(key.equalsIgnoreCase("customer_phone_number")){
					v.setPhone_number((String)value);
				}else if(key.equalsIgnoreCase("name")){
					v.setName((String)value);
				}else if(key.equalsIgnoreCase("tel")){
					v.setTel((String)value);
				}else if(key.equalsIgnoreCase("phone_number")){
					v.setPhone_number((String)value);
				}else if(key.equalsIgnoreCase("address")){
					v.setAddress((String)value);
				}else if(key.equals("is_default")){
					v.setIs_default((Integer)value);
				}
			}
			return v;
		}
		
	};
	
	
	/**
	 * 查询指定用户的地址信息
	 * @param customer_phone_number 传入的用户电话号码
	 * @return 返回list集合
	 */
	public List<CustomerAddressVo> getCustomerAddress(String customer_phone_number){
		String sql = "select * from customer_address_tb where customer_phone_number=?";
		List<CustomerAddressVo> list = this.executeQuery(sql, fillData, customer_phone_number);
		return list;
	}
	
	/**
	 * 修改指定地址
	 * @param	vo 传入修改的实体类（实体类里的address_id 不让修改）
	 * @return	返回是否成功
	 * @throws SQLException  异常往上丢
	 */
	public boolean updateAddress(CustomerAddressVo vo) throws SQLException{
		String sql = "update customer_address_tb set name=?,tel=?,phone_number=?,address=?,is_default=? where address_id=?";
		int executeUpdate = this.executeUpdate(sql, vo.getName(),vo.getTel(),vo.getPhone_number(),vo.getAddress(),vo.getIs_default());
		if(executeUpdate>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	
	/**
	 * 设置默认地址
	 * @param address_id
	 * @return
	 * @throws SQLException
	 */
	public boolean setDefaultAddress(String address_id) throws SQLException{
		String sql = "update customer_address_tb set is_default=0 where address_id=?";
		int executeUpdate = this.executeUpdate(sql, address_id);
		if(executeUpdate>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	
	/**
	 * 根据id删除地址
	 * @param address_id 传入要删除的地址id
	 * @return 返回是否成功
	 * @throws SQLException
	 */
	public boolean deleteAddressByAddressId(String address_id) throws SQLException{
		String sql = "delete from customer_address_tb  where address_id=?";
		int executeUpdate = this.executeUpdate(sql, address_id);
		if(executeUpdate>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	
	/**
	 * 按用户电话删除地址
	 * @param phone_number 传入删除的手机号
	 * @return 返回是否成功
	 * @throws SQLException
	 */
	public boolean deleteAddressByPhoneNumber(String phone_number) throws SQLException{
		String sql = "delete from customer_address_tb  where customer_phone_number=?";
		int executeUpdate = this.executeUpdate(sql, phone_number);
		if(executeUpdate>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	
}
