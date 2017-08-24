package dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database.Database;
import myinterface.FillData;
import vo.CollectionVo;
import vo.CollectiondetailVo;

public class CollectionDao extends Database{
	FillData<CollectiondetailVo> fillData = new FillData<CollectiondetailVo>(){
		@Override
		public CollectiondetailVo fillDate(Map<String, Object> map) {
			CollectiondetailVo vo = new CollectiondetailVo();
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()){
				String key = it.next();
				Object value = map.get(key);
				if(key.equals("customer_phone_number")){
					vo.setCustomer_phone_number((String)value);
				}else if(key.equals("goods_id")){
					vo.setGoods_id((String)value);
				}else if(key.equals("collect_time")){
					vo.setCollect_time((String)value);
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
	 * 查询所有被收藏的商品,时间优先
	 * @return
	 */
	public List<CollectiondetailVo> getAllCustomer(String phonemember){
		String sql = "select collection_tb.customer_phone_number,collection_tb.goods_id,collection_tb.collect_time, `goods_details _tb`.goods_introduce,`goods_details _tb`.favorable_quantity,`goods_details _tb`.differential_quantity,`goods_details _tb`.collection_quantity,`goods_details _tb`.sales_volum,`goods_details _tb`.img_s,`goods_details _tb`.img_m,`goods_details _tb`.img_b from collection_tb INNER JOIN `goods_details _tb` on collection_tb.goods_id=`goods_details _tb`.goods_id where collection_tb.customer_phone_number=? ORDER BY collection_tb.collect_time desc ";
		List<CollectiondetailVo> executeQuery =this.executeQuery(sql, fillData,phonemember);
		this.close();
		return executeQuery;
	}
	
	/**
	 * 添加收藏商品
	 * @param cv
	 * @return
	 * @throws SQLException
	 */
	public int insertCollection(CollectionVo cv) throws SQLException{
		String sql = "insert into collection_tb values(?,?,?,?)";
		int row = this.executeUpdate(sql, cv.getCustomer_phone_number(),cv.getGoods_id(),cv.getCollect_time(),1);
		return row;		
	}
	
	/**
	 * 删除收藏商品
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public int deleteCollection(String id,String phonenumber) throws SQLException{
		String sql = "delete from collection_tb where goods_id=? and customer_phone_number=?";
		int row = this.executeUpdate(sql,id,phonenumber);
		return row;		
	}
}
