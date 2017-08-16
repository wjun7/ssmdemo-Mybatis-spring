package com.edusoft.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

/**
 * Created by admin on 2017/8/9.
 */
public class DBUtil {
    public static SqlSession getSession() {
        String resoure = "mybatis.xml";
        SqlSession sqlsession = null;
        try {
            //读取属性配置文件到输入流
            InputStream inputStream = Resources.getResourceAsStream(resoure);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlsession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlsession;
    }
}
    /*    public static void close(Connection conn, PreparedStatement pst, ResultSet rs){
            try {
                if(conn != null) {
                    conn.close();
                }
                if(pst != null) {
                    pst.close();
                }
                if(rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }*/

