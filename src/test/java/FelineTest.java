import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline(); // Инициализация объекта Feline перед каждым тестом
    }

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        int expectedKittens = 1; // Ожидаемое значение по умолчанию
        assertEquals(expectedKittens, feline.getKittens());
    }

    @Test
    public void getKittenCountTest() {
        int kittenCount = 1;
        assertEquals(kittenCount, feline.getKittens(kittenCount));
    }
}