package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database.Database;
import myinterface.FillData;
import vo.CustomerVo;

public class CustomerDao extends Database{
	FillData<CustomerVo> fillData = new FillData<CustomerVo>(){
		@Override
		public CustomerVo fillDate(Map<String, Object> map) {
			CustomerVo vo = new CustomerVo();
			Iterator<String> it = map.keySet().iterator();
			
			while(it.hasNext()){
				String key = it.next();
				Object value = map.get(key);
				if(key.equals("customer_phone_number")){
					vo.setCustomer_phone_number((String)value);
				}else if(key.equals("password")){
					vo.setPassword((String)value);
				}
			}
			
			return vo;
		}
	
	};
	
	
	public List<CustomerVo> getAllCustomer(){
		String sql = "select * from customer_tb";
		List<CustomerVo> executeQuery = this.executeQuery(sql, fillData);
		return executeQuery;
	}
	
	public CustomerVo getCustomerByPhone(String tel){
		String sql = "select * from customer_tb where customer_phone_number=?";
		List<CustomerVo> executeQuery = this.executeQuery(sql, fillData,tel);
		for(CustomerVo vo : executeQuery ){
			return vo;
		}
		return null;
	}
}
