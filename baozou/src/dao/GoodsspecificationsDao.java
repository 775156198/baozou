package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database.Database;
import myinterface.FillData;
import vo.goodsspecificationsVo;

public class GoodsspecificationsDao extends Database{
	FillData<goodsspecificationsVo> fillData=new FillData<goodsspecificationsVo>(){

		@Override
		public goodsspecificationsVo fillDate(Map<String, Object> map) {
			goodsspecificationsVo vo = new goodsspecificationsVo();
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()){
				String key = it.next();
				Object value = map.get(key);
				if(key.equals("specification_id")){
					vo.setSpecification_id((String)value);
				}else if(key.equals("goods_price")){
					vo.setGoods_price((String)value);
				}else if(key.equals("goods_size")){
					vo.setGoods_size((String)value);
				}else if(key.equals("goods_color")){
					vo.setGoods_color((String)value);
				}else if(key.equals("goods_number")){
					vo.setGoods_number((Integer)value);
				}else if(key.equals("goods_name")){
					vo.setGoods_name((String)value);
				}
			}
			return vo;
		}	
	};
	
	/**
	 * 库存报警检查，精确到单一规格ID，小于等于5进入报警（小于6）
	 * @return
	 */
	public List<goodsspecificationsVo> getGoodsWarning(){
		String sql = "select * from goods_specifications_tb where goods_number<6";
		List<goodsspecificationsVo> executeQuery=this.executeQuery(sql, fillData);
		this.close();
		return executeQuery;
	}
	
	/**
	 * 根据商品名字查询商品规格信息，用于点击后进入单一商品界面
	 * @param name
	 * @return
	 */
	public List<goodsspecificationsVo> getGoodsqualityByname(String name){
		String sql = "select * from goods_specifications_tb where goods_name=?";
		List<goodsspecificationsVo> executeQuery=this.executeQuery(sql, fillData,name);
		this.close();
		return executeQuery;
	}
}
