import com.Kovalov.HW12.HW12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHW12 {
    HW12 a = new HW12();
    int [] b = {1,2,3,4,5};
    int [][] c = {{1,2,3},{1,2,3},{1,2,3}};
    @Test
    public void testHW12(){
       Assertions.assertFalse(a.task1(b));
    }

    @Test
    public void testTask2(){
        Assertions.assertTrue(a.task2(c));
    }

}
