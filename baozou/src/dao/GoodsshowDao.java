package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import database.Database;
import myinterface.FillData;
import vo.goodsinfodetailVo;

public class GoodsshowDao extends Database{
	FillData<goodsinfodetailVo> fillData=new FillData<goodsinfodetailVo>(){

		@Override
		public goodsinfodetailVo fillDate(Map<String, Object> map) {
			goodsinfodetailVo vo = new goodsinfodetailVo();
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()){
				String key = it.next();
				Object value = map.get(key);
				if(key.equals("goods_id")){
					vo.setGoods_id((String)value);
				}else if(key.equals("goods_name")){
					vo.setGoods_name((String)value);
				}else if(key.equals("goods_state")){
					vo.setGoods_state((String)value);
				}else if(key.equals("goods_category")){
					vo.setGoods_category((String)value);
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
	 * 查询所有商品信息（上架）状态为1，销量优先
	 * @return
	 */
	public List<goodsinfodetailVo> getAllGoods(){
		String sql="select goods_info_tb.goods_id,goods_info_tb.goods_name,goods_info_tb.goods_category,goods_info_tb.goods_state, `goods_details _tb`.goods_introduce,`goods_details _tb`.favorable_quantity,`goods_details _tb`.differential_quantity,`goods_details _tb`.collection_quantity,`goods_details _tb`.sales_volum,`goods_details _tb`.img_s,`goods_details _tb`.img_m,`goods_details _tb`.img_b from goods_info_tb INNER JOIN `goods_details _tb` on goods_info_tb.goods_id=`goods_details _tb`.goods_id where goods_info_tb.goods_state='1' ORDER BY `goods_details _tb`.sales_volum desc ";
		List<goodsinfodetailVo> executeQuery=this.executeQuery(sql, fillData);
		this.close();
		return executeQuery;
	}
	
	
	/**
	 * 根据商品ID查询商品
	 * @param id
	 * @return
	 */
	public goodsinfodetailVo getGoodsById(String id){
		String sql = "select goods_info_tb.goods_id,goods_info_tb.goods_name,goods_info_tb.goods_category,goods_info_tb.goods_state, `goods_details _tb`.goods_introduce,`goods_details _tb`.favorable_quantity,`goods_details _tb`.differential_quantity,`goods_details _tb`.collection_quantity,`goods_details _tb`.sales_volum,`goods_details _tb`.img_s,`goods_details _tb`.img_m,`goods_details _tb`.img_b from goods_info_tb INNER JOIN `goods_details _tb` on goods_info_tb.goods_id=`goods_details _tb`.goods_id where goods_info_tb.goods_id=? ORDER BY `goods_details _tb`.sales_volum desc ";
		List<goodsinfodetailVo> executeQuery = this.executeQuery(sql, fillData,id);
		for(goodsinfodetailVo vo : executeQuery ){
			this.close();
			return vo;
		}
		this.close();
		return null;
	}
	
	/**
	 * 根据名称字段模糊查询商品，销量优先
	 * @param name
	 * @return
	 */
	public List<goodsinfodetailVo> getGoodsByName(String name){
		String sql = "select goods_info_tb.goods_id,goods_info_tb.goods_name,goods_info_tb.goods_category,goods_info_tb.goods_state, `goods_details _tb`.goods_introduce,`goods_details _tb`.favorable_quantity,`goods_details _tb`.differential_quantity,`goods_details _tb`.collection_quantity,`goods_details _tb`.sales_volum,`goods_details _tb`.img_s,`goods_details _tb`.img_m,`goods_details _tb`.img_b from goods_info_tb INNER JOIN `goods_details _tb` on goods_info_tb.goods_id=`goods_details _tb`.goods_id where goods_info_tb.goods_name like? ORDER BY `goods_details _tb`.sales_volum desc ";
		List<goodsinfodetailVo> executeQuery=this.executeQuery(sql, fillData,name);
		this.close();
		return executeQuery;
	}
	
	/**
	 * 根据类别查询商品信息，销量优先
	 * @param categoryid
	 * @return
	 */
	public List<goodsinfodetailVo> getGoodsByCategory(String categoryid){
		String sql = "select goods_info_tb.goods_id,goods_info_tb.goods_name,goods_info_tb.goods_category,goods_info_tb.goods_state, `goods_details _tb`.goods_introduce,`goods_details _tb`.favorable_quantity,`goods_details _tb`.differential_quantity,`goods_details _tb`.collection_quantity,`goods_details _tb`.sales_volum,`goods_details _tb`.img_s,`goods_details _tb`.img_m,`goods_details _tb`.img_b from goods_info_tb INNER JOIN `goods_details _tb` on goods_info_tb.goods_id=`goods_details _tb`.goods_id where goods_info_tb.goods_category=? ORDER BY `goods_details _tb`.sales_volum desc ";
		List<goodsinfodetailVo> executeQuery=this.executeQuery(sql, fillData,categoryid);
		this.close();
		return executeQuery;
	}
	
	
}
