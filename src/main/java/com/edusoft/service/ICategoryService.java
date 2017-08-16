package com.edusoft.service;

import com.edusoft.dto.Category;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/8/9.
 */
public interface ICategoryService {
    //按条件表达式模糊查询
    List<Category> getAll(String queryValue) throws SQLException;

    //按ID查询
    Category get(String id) throws SQLException;

    //执行插入操作
    boolean insert(Category category) throws SQLException;

    //执行删除操作
    boolean delete(String id) throws SQLException;

    //执行修改操作
    boolean update(Category category) throws SQLException;
}
