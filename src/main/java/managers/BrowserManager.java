package managers;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserManager extends Thread {
    EdgeDriver driver;
    GameManager gameManager;

    public BrowserManager(){
        System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
        this.driver = new EdgeDriver();
        this.gameManager = new GameManager(driver);
        start();
    }

    @Override
    public void start() {
        super.start();
        driver.get("https://s20.wolnifarmerzy.pl/main.php?ref=pgtest");
        gameManager.checkSession();
    }
}
