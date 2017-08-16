package com.edusoft.dao;

import com.edusoft.dto.Seller;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 2017/8/10.
 */
public interface ISellerDao {

    //按条件表达式模糊查询
    List<Seller> getAll(String queryValue) throws SQLException;

    //按ID查询
    Seller get(String id) throws SQLException;

    //执行插入操作
    int insert(Seller seller) throws SQLException;

    //执行删除操作
    int delete(String id) throws SQLException;

    //执行修改操作
    int update(Seller seller) throws SQLException;
}

