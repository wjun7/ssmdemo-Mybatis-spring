import com.edusoft.dto.Category;
import com.edusoft.dto.Goods;
import com.edusoft.dto.Seller;
import com.edusoft.service.impl.CategoryServiceImpl;
import com.edusoft.service.impl.GoodsServiceIpml;
import com.edusoft.service.impl.SellerServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by admin on 2017/8/11.
 */
public class TestGoods {
    GoodsServiceIpml goodsServiceIpml = null;
    Goods goods = null;
    SellerServiceImpl sellerServiceImpl = null;
    CategoryServiceImpl categoryServiceImpl = null;


    @Before
    public void init(){
        goodsServiceIpml = new GoodsServiceIpml();
        sellerServiceImpl = new SellerServiceImpl();
        categoryServiceImpl = new CategoryServiceImpl();
    }

    @Test
    public void TestInsert(){
        goods = new Goods();
        try {
            goods.setCategory(categoryServiceImpl.get("20170812010800001"));
            goods.setSeller(sellerServiceImpl.get("20170812010800002"));
            goods.setName("智能车");
            goods.setImage("NOIMAGE");
            goods.setOriginalPrice(1111.11);
            goods.setRate(0.90);
            goods.setStock(200);
            goods.setState("2");
            goodsServiceIpml.insert(goods);
        } catch (SQLException e) {

        }
    }

    @Test
    public void TestGetAll(){
        String queryValue = "智能";
        try {
            System.out.println(goodsServiceIpml.getAll(queryValue));
        } catch (SQLException e) {

        }
    }

    @Test
    public void TestGet(){
        try {
            System.out.println(goodsServiceIpml.get("20170815020800110"));
        } catch (SQLException e) {

        }
    }

    @Test
    public void TestDelete(){
        try {
            Assert.assertTrue(goodsServiceIpml.delete("20170812020800003"));
        } catch (SQLException e) {

        }
    }

    @Test
    public void TestUpdate(){
        try {
            goods = goodsServiceIpml.get("20170812040800004");
            goods.setOriginalPrice(13000.00);
            goods.setRate(0.80);
            Assert.assertTrue(goodsServiceIpml.update(goods));
        } catch (SQLException e) {

        }
    }
}
