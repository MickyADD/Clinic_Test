import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;


public class Enfermeria {

    WebDriver driver;

    @Before
    public void inicializar() {
        driver = new ChromeDriver();
    }

    @Test
    public void signIn() {
       driver.get("http://clinica-dev.dennis-laurel.com/login");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.findElement(By.name("email")).sendKeys("enfermeria1@gmail.com");
       driver.findElement(By.name("password")).sendKeys("123456");
       driver.findElement(By.xpath("//*[@id='root']/main/div/form/button")).sendKeys(Keys.ENTER);

       //signos vitales
        driver.findElement((By.xpath("//*[@id=\"root\"]/div[1]/nav/div/div/ul/a[1]/div/div/li"))).click();
        driver.findElement((By.xpath("//*[@id=\"root\"]/div[1]/main/div[1]/div[1]/div/div/div[2]/div/div/table/tbody/tr[2]/td[3]"))).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //toma de signos
        driver.findElement(By.id(":r7:")).sendKeys("37");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.id(":r8:")).sendKeys("50");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.id(":r9:")).sendKeys("110");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.id(":ra:")).sendKeys("100");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":rb:")).sendKeys("45");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":rc:")).sendKeys("26");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":rd:")).sendKeys("40");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":re:")).sendKeys("50");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":rf:")).sendKeys("92");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":rg:")).sendKeys("48");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":rh:")).sendKeys("80");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":ri:")).sendKeys("80");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":rj:")).sendKeys("172");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":rk:")).sendKeys("35");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(":rl:")).sendKeys("signos tomados con normalidad");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement((By.xpath("//*[@id=\"root\"]/div[1]/main/div[1]/div[2]/form/div[3]/div/div/div/div[3]/button"))).click();

        //Realizados
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement((By.xpath("//*[@id=\"root\"]/div[1]/main/div[1]/div[3]/ul/div/div/div/li/div/div/span[2]"))).click();
        }

}
