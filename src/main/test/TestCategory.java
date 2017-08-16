
import com.edusoft.dto.Category;
import com.edusoft.service.impl.CategoryServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by admin on 2017/8/9.
 */
public class TestCategory {
   /* String queryvalue = "";*/
    CategoryServiceImpl csi = null;
    Category c = null;

    @Before
    public void init(){
        //注意：人工创建对象
        csi = new CategoryServiceImpl();

    }
  @Test
    public void testInsert(){
        c = new Category();
/*        c.setId(13);*/
        c.setText("wD缺乏器SDS");

        try {
            Assert.assertTrue(csi.insert(c));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   @Test
    public void testUpdate(){
        try {
            //如果这里sqlsession.close()下面就不能用了
            c = csi.get("20170815100800106");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        c.setText("Updatebbbbbb后");
        c.setParent("you");

       try {
           Assert.assertTrue(csi.update(c));
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
    @Test
    public void testDelete(){
        try {
            Assert.assertTrue(csi.delete("20170815110800109"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testGetAll(){
        try {
            for(Category c : csi.getAll("")){
                System.out.println(c.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testGet(){
        try {
            System.out.println(csi.get("20170814030800089").toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
