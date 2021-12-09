import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws Triangle.SideIsTooLargeException, Triangle.NonPositiveSideException {
        Triangle t = new Triangle(8, 9, 10);
        System.out.println("Площадь треугольника: " + t.square());
    }
}
