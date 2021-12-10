import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestTriangle {
    // одна сторона слишком большая
    // могут передать буквы
    // могут быть переданы нули
    // могут передать слишком большие значения
    // могут быть переданы отрицательные значение

    private static Logger logger = (Logger) LoggerFactory.getLogger(TestTriangle.class);

    @Test
    @DisplayName("одна сторона слишком большая")
    void largeSideTest() {
        logger.info("Попытка создать треугольник с большой стороной");
        Assertions.assertThrows(Triangle.SideIsTooLargeException.class, () -> {
            new Triangle(8, 8, 228);
        });
    }

    @Test
    @DisplayName("как минимум одна из сторон имеет значение 0")
     void zeroSideTest() {
        logger.info("Попытка создать треугольник с нулевой стороной");
        Assertions.assertThrows(Triangle.NonPositiveSideException.class, () -> {
            new Triangle(8, 0, 228);
        });
    }

    @Test
    @DisplayName("как минимум одна из сторон имеет отрицательное")
    void negativeSideTest() {
        logger.info("Попытка создать треугольник с отрицательной стороной");
        Assertions.assertThrows(Triangle.NonPositiveSideException.class, () -> {
            new Triangle(8, -10, 228);
        });
    }
}
