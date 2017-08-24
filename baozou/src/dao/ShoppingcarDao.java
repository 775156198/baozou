package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database.Database;
import myinterface.FillData;
import vo.ShoppingcarVo;
import vo.ShoppingcardetailVo;

public class ShoppingcarDao extends Database{
	FillData<ShoppingcardetailVo> fillData = new FillData<ShoppingcardetailVo>(){
		@Override
		public ShoppingcardetailVo fillDate(Map<String, Object> map) {
			ShoppingcardetailVo vo = new ShoppingcardetailVo();
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()){
				String key = it.next();
				Object value = map.get(key);
				if(key.equals("customer_phone_number")){
					vo.setCustomer_phone_number((String)value);
				}else if(key.equals("goods_id")){
					vo.setGoods_id((String)value);
				}else if(key.equals("time")){
					vo.setTime((Date)value);
				}else if(key.equals("goods_name")){
					vo.setGoods_name((String)value);
				}else if(key.equals("quality_id")){
					vo.setQuality_id((String)value);
				}else if(key.equals("goods_color")){
					vo.setGoods_color((String)value);
				}else if(key.equals("goods_size")){
					vo.setGoods_size((String)value);
				}else if(key.equals("number")){
					vo.setNumber((Integer)value);
				}else if(key.equals("goods_price")){
					vo.setGoods_price((Integer)value);
				}else if(key.equals("total_price")){
					vo.setTotal_price((Integer)value);
				}else if(key.equals("goods_introduce")){
					vo.setGoods_introduce((String)value);
				}else if(key.equals("favorable_quantity")){
					vo.setFavorable_quantity((Integer)value);
				}else if(key.equals("differential_quantity")){
					vo.setDifferential_quantity((Integer)value);
				}else if(key.equals("collection_quantity")){
					vo.setCollection_quantity((Integer)value);
				}else if(key.equals("sales_volum")){
					vo.setSales_volum((Integer)value);
				}else if(key.equals("img_s")){
					vo.setImg_s((String)value);
				}else if(key.equals("img_m")){
					vo.setImg_m((String)value);
				}else if(key.equals("img_b")){
					vo.setImg_b((String)value);
				}
			}
			return vo;
		}
	};
	
	/**
	 * 查询购物车
	 * @return
	 */
	public List<ShoppingcardetailVo> getAllCustomer(String phonenumber){
		String sql = "select  shopping_car_tb.customer_phone_number,shopping_car_tb.goods_id,shopping_car_tb.time,shopping_car_tb.goods_name,shopping_car_tb.quality_id,shopping_car_tb.goods_color,shopping_car_tb.goods_size,shopping_car_tb.number,shopping_car_tb.goods_price,shopping_car_tb.total_price,`goods_details _tb`.goods_introduce,`goods_details _tb`.favorable_quantity,`goods_details _tb`.differential_quantity,`goods_details _tb`.collection_quantity,`goods_details _tb`.sales_volum,`goods_details _tb`.img_s,`goods_details _tb`.img_m,`goods_details _tb`.img_b from shopping_car_tb INNER JOIN `goods_details _tb` on shopping_car_tb.goods_id=`goods_details _tb`.goods_id where shopping_car_tb.customer_phone_number=? ORDER BY shopping_car_tb.time desc ";
		List<ShoppingcardetailVo> executeQuery = this.executeQuery(sql, fillData,phonenumber);
		this.close();
		return executeQuery;

	}
	
	/**
	 * 添加商品到购物车
	 * @param sv
	 * @return
	 * @throws SQLException
	 */
	public int insertShoppingcar(ShoppingcarVo sv) throws SQLException{
		String sql = "insert into shopping_car_tb values(?,?,?,?,?,?,?,?,?,?,?)";
		int row = this.executeUpdate(sql, sv.getCustomer_phone_number(),sv.getGoods_id(),sv.getTime(),sv.getGoods_name(),sv.getQuality_id(),sv.getGoods_color(),sv.getGoods_size()
										,sv.getNumber(),sv.getGoods_price(),sv.getTotal_price(),1);
		return row;		
	}
	
	public int deleteShoppingcar(String phonenumber,String qualityid) throws SQLException{
		String sql = "delete from shopping_car_tb where customer_phone_number=? and quality_id=?";
		int row = this.executeUpdate(sql,phonenumber,qualityid);
		return row;		
	}
}
