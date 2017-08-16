
package com.edusoft.service.impl;

import com.edusoft.dao.DBUtil;
import com.edusoft.dao.IGoodsDao;
import com.edusoft.dto.Goods;
import com.edusoft.service.IGoodsService;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.List;


/**
 * Created by admin on 2017/8/11.
 */

public class GoodsServiceIpml implements IGoodsService {
    SqlSession sqlSession = DBUtil.getSession();
    IGoodsDao iGoodsDao = null;
    public GoodsServiceIpml(){
        iGoodsDao = sqlSession.getMapper(IGoodsDao.class);
    }

    public List<Goods> getAll(String queryValue) throws SQLException {
        return iGoodsDao.getAll(queryValue);
    }

    public Goods get(String id) throws SQLException {
        return iGoodsDao.get(id);
    }

    public boolean insert(Goods goods) throws SQLException {
        int flag=0;
        try{
            flag = iGoodsDao.insert(goods);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return flag > 0 ? true:false;
    }

    public boolean delete(String id) throws SQLException {
        int flag=0;
        try{
            flag = iGoodsDao.delete(id);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return flag > 0 ? true:false;
    }

    public boolean update(Goods goods) {
        int flag=0;
        try{
            flag = iGoodsDao.update(goods);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return flag > 0 ? true:false;
    }
}

