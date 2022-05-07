package managers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import utils.GameLogger;

public class GameManager {
    private final EdgeDriver driver;
    private final GameLogger logger = GameLogger.getLogger();

    public GameManager(EdgeDriver driver){
        this.driver = driver;
    }

    public void checkSession(){
        WebElement loginbar = driver.findElement(By.id("loginbar"));
        if (loginbar.isDisplayed()){
            logger.info("Sesja wygasła. Wymagane ponowne zalogowanie.");
        }
    }
}
