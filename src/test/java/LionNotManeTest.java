import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class LionNotManeTest {

    //Проверяем, что выходит Exception, когда в условный операторв не переданы ни самец, ни самка
    @Test(expected = Exception.class)
    public void shouldSeeExceptionLionMane() throws Exception {
        Lion lion = new Lion("небинарный");
    }
}
