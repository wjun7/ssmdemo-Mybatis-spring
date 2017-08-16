package com.edusoft.service;

import com.edusoft.dto.Goods;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 2017/8/11.
 */
public interface IGoodsService {
    //按条件表达式模糊查询
    List<Goods> getAll(String queryValue) throws SQLException;

    //按ID查询
    Goods get(String id) throws SQLException;

    //执行插入操作
    boolean insert(Goods goods) throws SQLException;

    //执行删除操作
    boolean delete(String id) throws SQLException;

    //执行修改操作
    boolean update(Goods goods);
}
