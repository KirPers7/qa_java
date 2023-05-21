import com.example.Feline;
import com.example.Lion;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class LionTest extends TestCase {

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(sex);
        int actualGetKettens = lion.setFeline(new Feline()).getKittens();
        int expectedGetKittens = 1;
        Assert.assertEquals(expectedGetKittens, actualGetKettens);
    }

    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameter(1)
    public boolean hasMane;

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false}
        });
    }

    //Проверяем, что условный оператор возвращает нужный ответ при вводе определенного пола
    @Test
    public void checkDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex);
        Assert.assertEquals(lion.doesHaveMane(), hasMane);
    }

    //Проверяем, что метод getFood запускается с параметром "Хищник" и запускается один раз
    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion(sex);
        lion.setFeline(new Feline()).getFood();
        List<String> actualGetFood = lion.getFood();
        List<String> expectedGetFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedGetFood, actualGetFood);
        feline.getFood("Хищник");
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}