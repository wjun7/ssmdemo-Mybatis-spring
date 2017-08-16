package com.edusoft.dao.ipml;

import com.edusoft.dao.DBUtil;
import com.edusoft.dao.ICategoryDao;
import com.edusoft.dto.Category;
import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/8/9.
 */
public class CategoryDaoIpml implements ICategoryDao {
    SqlSession sqlSession = DBUtil.getSession();

    public List<Category> getAll(String queryValue) throws SQLException {
        try {
            return sqlSession.selectList("test.getAll", queryValue);
        } finally {
            sqlSession.close();
        }

    }

    public Category get(String id) throws SQLException {

    /*    try {*/
            return sqlSession.selectOne("test.get", id);
/*        } finally {
            sqlSession.close();
        }*/
    }

    public int insert(Category category) throws SQLException {
        int flag = 0;
        try {
            flag = sqlSession.insert("test.insert", category);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return flag;
    }

    public int delete(String id) {
        int flag = 0;
        try {
            flag = sqlSession.delete("test.delete", id);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return flag;
    }

    public int update(Category category) {
        int flag = 0;
        try {
            flag = sqlSession.update("test.update", category);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return flag;
    }
}
