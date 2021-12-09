import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTriangle {
    // одна сторона слишком большая
    // могут передать буквы
    // могут быть переданы нули
    // могут передать слишком большие значения
    // могут быть переданы отрицательные значение

    @Test
    @DisplayName("одна сторона слишком большая")
    void largeSideTest() {
        Assertions.assertThrows(Triangle.SideIsTooLargeException.class, () -> {
            new Triangle(8, 8, 228);
        });
    }

    @Test
    @DisplayName("как минимум одна из сторон имеет значение 0")
     void zeroSideTest() {
        Assertions.assertThrows(Triangle.NonPositiveSideException.class, () -> {
            new Triangle(8, 0, 228);
        });
    }

    @Test
    @DisplayName("как минимум одна из сторон имеет отрицательное")
    void negativeSideTest() {
        Assertions.assertThrows(Triangle.NonPositiveSideException.class, () -> {
            new Triangle(8, -10, 228);
        });
    }
}
