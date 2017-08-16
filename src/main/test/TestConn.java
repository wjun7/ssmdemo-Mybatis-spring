import com.edusoft.dao.DBUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 2017/8/9.
 */
public class TestConn {
    @Test
    public void testConn(){
        Assert.assertNotNull(DBUtil.getSession());
    }
}
