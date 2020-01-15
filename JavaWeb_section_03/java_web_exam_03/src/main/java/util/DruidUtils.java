package util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DruidUtils {

    private static DataSource ds = null;

    static {
        try {
            //1. 加载 druid.properties 配置文件
            InputStream is = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            Properties prop = new Properties();
            prop.load(is);
            //2. 创建 Druid 连接池对象
            ds = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    3. 提供 获得 连接池对象的方法
     */
    public static DataSource getDataSource(){
        return ds;
    }

    /*
    4. 提供 从连接池中 获取连接对象Connection的 方法
     */
    public static Connection getConnetion() throws SQLException {
        Connection conn = ds.getConnection();
        return  conn;
    }

    /*
     5. 提供 释放资源的方法
     */
    public static void close(ResultSet rs, Statement stat, Connection conn) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (stat != null) {
            stat.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
