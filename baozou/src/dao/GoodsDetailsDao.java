package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database.Database;
import myinterface.FillData;
import vo.goodsDetailsVo;
import vo.goodsInfoVo;

public class GoodsDetailsDao extends Database{
	FillData<goodsDetailsVo> fillData=new FillData<goodsDetailsVo>() {
		public goodsDetailsVo fillDate(Map<String,Object>map){
			goodsDetailsVo vo=new goodsDetailsVo();
			Iterator<String> it=map.keySet().iterator();
			
			while(it.hasNext()){
				String key=it.next();
				Object value=map.get(key);
				if(key.equals("goods_id")){
					vo.setGoods_id((String)value);
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
					vo.setImg_b((String)value);
				}else if(key.equals("img_b")){
					vo.setImg_b((String)value);
				}
			}
			return vo;
		}
	};
	/**
	 * 查询所有商品详情表的
	 * @return
	 */
	public List<goodsDetailsVo> getAllGoodsDatails(){
		String sql="select*from goods_details _tb ";
		List<goodsDetailsVo> executeQuery=this.executeQuery(sql, fillData);
		this.close();
		return executeQuery;
	}
	/**
	 * 添加商品
	 */
}
