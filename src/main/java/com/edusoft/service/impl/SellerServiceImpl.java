package com.edusoft.service.impl;

import com.edusoft.dao.DBUtil;
import com.edusoft.dao.ICategoryDao;
import com.edusoft.dao.ISellerDao;
import com.edusoft.dto.Seller;
import com.edusoft.service.ISellerService;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 2017/8/10.
 */
public class SellerServiceImpl implements ISellerService{
    SqlSession sqlSession = DBUtil.getSession();
    ISellerDao iSellerDao = null;
    public SellerServiceImpl(){
        iSellerDao = sqlSession.getMapper(ISellerDao.class);
    }
    public List<Seller> getAll(String queryValue) throws SQLException {
        return iSellerDao.getAll(queryValue);
    }

    public Seller get(String id) throws SQLException {
        return iSellerDao.get(id);
    }

    public boolean insert(Seller seller) throws SQLException {
        int flag=0;
        try{
            flag = iSellerDao.insert(seller);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return flag > 0 ? true:false;
    }

    public boolean delete(String id) throws SQLException {
        int flag=0;
        try{
            flag = iSellerDao.delete(id);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return flag > 0 ? true:false;
    }

    public boolean update(Seller seller)throws SQLException {
        int flag=0;
        try{
            flag = iSellerDao.update(seller);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return flag > 0 ? true:false;
    }
}
