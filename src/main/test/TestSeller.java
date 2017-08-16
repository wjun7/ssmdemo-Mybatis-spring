import com.edusoft.dto.Seller;
import com.edusoft.service.impl.SellerServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

/**
 * Created by admin on 2017/8/10.
 */
public class TestSeller {
    SellerServiceImpl ssi = null;
    Seller s = null;
    @Before
    public void init(){
        ssi = new SellerServiceImpl();
    }

    @Test
    public void TestInsert(){
        s = new Seller();
        s.setRealname("Xamder");
        s.setUsername("知秋一叶");
        s.setPassword("********");
        /*s.setAddress("广州加速器");*/
        s.setPostcode("515300");
        s.setEmail("2548414415@qq.com");
        s.setUrl("www.baidu.com");
        s.setPhone("phone");
        long it = Calendar.getInstance().getTime().getTime();
        s.setRegDate(new Timestamp(it));
        try {
            Assert.assertTrue(ssi.insert(s));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testGet(){

        try {
            System.out.println(ssi.get("20170815110800107").toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testGetAll(){
        s = new Seller();
        try {
            System.out.println(ssi.getAll("知秋").toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testDelete(){
        try {
            ssi.delete("20170816090800124");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testUpdate(){
        try {
            s = ssi.get("20170815110800107");
            s.setUsername("知秋一d叶");
            /*s.setPassword("************");*/
            ssi.update(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
