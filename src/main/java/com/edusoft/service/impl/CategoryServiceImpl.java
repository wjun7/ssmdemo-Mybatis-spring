package com.edusoft.service.impl;

import com.edusoft.dao.DBUtil;
import com.edusoft.dao.ICategoryDao;
import com.edusoft.dto.Category;
import com.edusoft.service.ICategoryService;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 2017/8/9.
 */
public class CategoryServiceImpl implements ICategoryService {
    //人工造对象，才能引用其中的方法
     SqlSession sqlSession = DBUtil.getSession();
     ICategoryDao iCategoryDao = null;
    public CategoryServiceImpl(){
        iCategoryDao = sqlSession.getMapper(ICategoryDao.class);
    }
    public List<Category> getAll(String queryValue) throws SQLException {
        return iCategoryDao.getAll(queryValue);
    }

    public Category get(String id) throws SQLException {
        return iCategoryDao.get(id);
    }

    public boolean insert(Category category) throws SQLException {
        int flag=0;
        try{
            flag = iCategoryDao.insert(category);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return flag > 0 ? true:false;
    }

    public boolean delete(String id) throws SQLException{
        int flag=0;
        try{
            flag = iCategoryDao.delete(id);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return flag > 0 ? true:false;
    }

    public boolean update(Category category) throws SQLException {
        int flag=0;
        try{
            flag = iCategoryDao.update(category);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return flag > 0 ? true:false;
    }
}
