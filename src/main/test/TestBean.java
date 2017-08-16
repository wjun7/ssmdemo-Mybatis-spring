import com.edusoft.dto.Seller;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2017/8/16.
 */
public class TestBean {
    @Test
    public void testBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Seller seller = (Seller)context.getBean("seller");
        Assert.assertNotNull(seller);
    }
}
