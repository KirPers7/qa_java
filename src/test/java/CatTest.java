import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    //Проверка, что метод getSound() возвращает "Мяу"
    @Test
    public void checkGetSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedGetSound = "Мяу";
        String actualGetSound = cat.getSound();
        Assert.assertEquals(expectedGetSound, actualGetSound);
    }

    //Проверка, что метод getFood() работает
    @Test
    public void checkGetFood() throws Exception{
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actualGetFood = cat.getFood();
        List<String> expectedGetFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedGetFood, actualGetFood);
    }
}
