package com.edusoft.dao.ipml;

import com.edusoft.dao.DBUtil;
import com.edusoft.dao.IGoodsDao;
import com.edusoft.dto.Goods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/8/11.
 */
public class GoodsDaoIpml implements IGoodsDao{

    public List<Goods> getAll(String queryValue) throws SQLException {
        return null;
    }

    public Goods get(String id) throws SQLException {
        return null;
    }

    public int insert(Goods goods) throws SQLException {
        return 0;
    }

    public int delete(String id) throws SQLException {
        return 0;
    }

    public int update(Goods goods) {
        return 0;
    }
}
