package dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.regexp.internal.recompile;

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
	 * 查询单个商品
	 */
	public goodsDetailsVo getGoodsDan(String goods_id){
		String sql="select*from goods_details _tb  where goods_id=?";
		List<goodsDetailsVo> executeQuery=this.executeQuery(sql, fillData,goods_id);
		for(goodsDetailsVo vo:executeQuery){
			this.close();
			return vo;
		}
		this.close();
		return null;
	}
	/**
	 * 添加商品
	 * @throws SQLException 
	 */
	public int addGoodsDetails(goodsDetailsVo vo) throws SQLException{
		int row=0;
		String sql="insert into goods_details _tb (goods_id,goods_introduce,img_s,img_m,img_b) values(?,?,?,?,?)";
		try {
			 row=this.executeUpdate(sql,vo.getGoods_id(),vo.getGoods_introduce(),vo.getImg_s(),vo.getImg_m(),vo.getImg_b());
		} catch (SQLException e) {
			throw new SQLException("添加有误");
		}
		this.close();
		return row;
	}
	/**
	 * 修改商品详情表
	 * @throws SQLException 
	 */
	public int modifyGoodsDatails(String goods_introduce,String goods_id,String img_s,String img_m,String img_b) throws SQLException{
		int rwo=0;
		String sql="update goods_details _tb goods_introduce=?,img_s=?,img_m=?,img_b=? where goods_id=?";
		try {
			 rwo=this.executeUpdate(sql,goods_introduce,img_s,img_m,img_b,goods_id);
		} catch (SQLException e) {
			throw new SQLException("修改有误");
		}
		this.close();
		return rwo;
	}
	/**
	 * 修改商品好评数量
	 */
	public int modifyGood(String goods_id){
		String sql="update goods_details _tb favorable_quantity=? where goods_id";
		fundF(goods_id);
	}
	/**
	 * 查询商品好评数量
	 */
	public goodsDetailsVo fundF(String goods_id){
		String sql="select*from  goods_details _tb where goods_id=?";
		List<goodsDetailsVo> executeQuery=this.executeQuery(sql, fillData,goods_id);
		for(goodsDetailsVo vo:executeQuery){
			this.close();
			return vo;
		}
		this.close();
		return null;
	}
}
