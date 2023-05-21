import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    //Проверка, что метод eatMeat() возвращает: "Животные", "Птицы", "Рыба"
    @Test
    public void checkEatMeet() throws Exception {
        Feline feline = new Feline();
        List<String> actualEatMeet = feline.eatMeat();
        List<String> expectedEatMeet = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedEatMeet, actualEatMeet);
    }

    //Проверка, что метод getFamily() возвращает: "Кошачьи"
    @Test
    public void checkGetFamily() {
        Feline feline = new Feline();
        String actualGetFamily = feline.getFamily();
        String expectedGetFamily = "Кошачьи";
        Assert.assertEquals(expectedGetFamily, actualGetFamily);
    }

    //Проверка, что метод getKittens() без параметра возвращает 1
    @Test
    public void checkGetKittens() {
        Feline feline = new Feline();
        int actualGetKettens = feline.getKittens();
        int expectedGetKittens = 1;
        Assert.assertEquals(expectedGetKittens, actualGetKettens);
    }

    //Проверка, что метод getKittens() с переданным параметром возвращает тот же переданный параметр
    @Test
    public void checkGetKittensWithParam() {
        Feline feline = new Feline();
        int actualGetKittensWithParam = feline.getKittens(5);
        int expectedGetKittensWithParam = 5;
        Assert.assertEquals(expectedGetKittensWithParam, actualGetKittensWithParam);
    }

}
