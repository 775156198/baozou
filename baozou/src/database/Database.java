package database;
import java.io.FileInputStream;  
import java.io.IOException;  
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import myinterface.FillData;


  
public class Database {  
    // 定义要使用的变量  
    private static Connection conn = null;  
    private static PreparedStatement ps = null;  
    private static ResultSet rs = null;  
    
  
    private static String driver = "com.mysql.jdbc.Driver";  
    private static String url = "jdbc:mysql://localhost:3306/onlinemarket?characterEncoding=UTF-8&useSSL=true";  
    private static String userName = "root";  
    private static String password = "";  
  
     
  
    // 加载驱动，只需要一次  
    static {  
        try {  
            Class.forName(driver);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  

        }  
    }  
  
    // 得到连接  
    public static Connection getConnection() {  
        try {  
            conn = DriverManager.getConnection(url, userName, password);  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        return conn;  
    }  
  
  //关闭连接
  	public void close(){
  			try {
  				if(rs!=null){
  				rs.close();
  				if (ps != null) {
  					ps.close();
  				}
  				if (conn!=null) {
  					conn.close();
  				}
  				}
  			} catch (SQLException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
  	}
  	
  	/**
  	 * 带参数查询
  	 * @param sql
  	 * @param fillDate
  	 * @param objects
  	 * @return
  	 */
  	protected <T> List<T> executeQuery(String sql,FillData<T> fillDate,Object...objects){
  		try {
  			this.getConnection();
  			ps = conn.prepareStatement(sql);
  			//设置参数
  			if(objects!=null){
  				for(int i=0;i<objects.length;i++){
  	  				ps.setObject(i+1, objects[i]);}
  			}
  			
  			rs = ps.executeQuery();
  			ResultSetMetaData cols = rs.getMetaData();
  			List<T> list = new ArrayList<T>();
  			String []colsName = new String [cols.getColumnCount()];
  			//获取所有列名
  			for(int i = 0; i<colsName.length;i++){
  				colsName[i] = cols.getColumnName(i+1);
  			}
  			
  			while(rs.next()){
  				Map<String,Object> map = new HashMap<String,Object>();
  				//把数据填充到map
  				for(int i = 0; i < colsName.length; i++){
  					map.put(colsName[i], rs.getObject(colsName[i]));
  				}
  				
  				list.add(fillDate.fillDate(map));
  				
  			}
  			return  list;
  			
  			
  		} catch (SQLException e) {
  			System.out.println("sql语句错误"+e.getMessage());
  			
  		}
  		return null;
  		
  	}
  	
  	
  	//添加、删除、修改
  	public int executeUpdate(String sql,Object...objects) throws SQLException{
  		int row = -1;
  		try {
  			this.getConnection();
  			//创建执行对象
  			ps = conn.prepareStatement(sql);
  			//设置参数
  			if(objects!=null){
  				for(int i=0;i<objects.length;i++){
  	  				ps.setObject(i+1, objects[i]);
  	  			}
  			}
 
  			row= ps.executeUpdate();
  		} catch (SQLException e) {
  			e.printStackTrace();
  		}
  		
  		return row;
  	}

}  
