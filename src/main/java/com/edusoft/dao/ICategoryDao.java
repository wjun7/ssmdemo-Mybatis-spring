package com.edusoft.dao;

import com.edusoft.dto.Category;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/8/9.
 */
public interface ICategoryDao {

    //按条件表达式模糊查询
    List<Category> getAll(String queryValue) throws SQLException;

    //按ID查询
    Category get(String id) throws SQLException;

    //执行插入操作
    int insert(Category category) throws SQLException;

    //执行删除操作
    int delete(String id) throws SQLException;

    //执行修改操作
    int update(Category category) throws SQLException;
}
