package dao;


import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database.Database;
import myinterface.FillData;
import vo.goodsInfoVo;


public class GoodsDao extends Database {
	
		FillData<goodsInfoVo> fillData=new FillData<goodsInfoVo>() {
			public goodsInfoVo fillDate(Map<String,Object>map){
				goodsInfoVo vo=new goodsInfoVo();
				Iterator<String> it=map.keySet().iterator();
				while(it.hasNext()){
					String key=it.next();
					Object value=map.get(key);
					if(key.equals("goods_id")){
						vo.setGoods_id((String)value);
					}else if(key.equals("goods_name")){
						vo.setGoods_name((String)value);
					}else if(key.equals("goods_state")){
						vo.setGoods_state((String)value);
					}else if(key.equals("goods_category")){
						vo.setGoods_category((String)value);
					}
				}
				return vo;
			}
		};
		/**
		 * 查询所有商品
		 * @return
		 */
		public List<goodsInfoVo> getAllGoods(){
			String sql="select*from goods_info_tb";
			List<goodsInfoVo> executeQuery=this.executeQuery(sql, fillData);
			this.close();
			return executeQuery;
		}
		/**
		 * 添加商品
		 * @throws SQLException 
		 */
		public int addGoods(goodsInfoVo gVo) throws SQLException{
			String sql="insert into goods_info_tb (goods_id,goods_name,goods_state,goods_category) values(?,?,?,?) ";
			int row=0;
			try {
				     row=this.executeUpdate(sql, gVo.getGoods_id(),gVo.getGoods_name(),
					gVo.getGoods_state(),gVo.getGoods_category());
			} catch (SQLException e) {
				throw new SQLException("添加失败");
			}
			this.close();
			return row;
		}
		/**
		 * 修改商品
		 * @throws SQLException 
		 */
		public int modifyGoods(String goods_id,String goods_name,String goods_state) throws SQLException{
			String sql="update goods_info_tb set goods_name=?,goods_state=? where goods_id=?";
			int row=0;
			try {
				row = this.executeUpdate(sql,goods_name,goods_state,goods_id);
			} catch (SQLException e) {
				throw new SQLException("更改商品失败");
			}
			this.close();
			return row;
		}
		/**
		 * 查询商品状态
		 *//*
		public goodsInfoVo getGoodsState(String goods_id){
			String sql="select*from goods_state where goods_id=?";
			List<goodsInfoVo> executeQuery=this.executeQuery(sql, fillData,goods_id);
			for(goodsInfoVo vo:executeQuery){
				return vo;
			}
			return null;
		}*/
}
