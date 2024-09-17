import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Doctor {
    WebDriver driver;

    @Before
    public void inicializar() {

        driver = new ChromeDriver();

    }

    @Test
    public void signIn() throws InterruptedException {
        //login
        driver.get("http://clinica-dev.dennis-laurel.com/login");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("email")).sendKeys("everluizaga@hospitalmariaesperanza.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id='root']/main/div/form/button")).sendKeys(Keys.ENTER);

        //Agenda doctor
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav/div/div/ul/a[1]/div/div/li/div[2]/span")).click();

        //cola de atencion
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div[1]/div[2]/button")).click();

        //seleccion de paciente
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/ul/div[1]/div[2]/button")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\":rk:-314eeac5-a07a-411d-8fed-abfe74d24f94\"]/div/div[2]/div/div[1]/div")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\":rk:-a20c4f99-aea8-4d2c-bd92-8b66fba82789\"]/ul/div/div/div[1]/div[5]/button")).click();

        //diagnostico
        driver.findElement(By.id(":ro:")).sendKeys("Cor dextrum triatriatum");
        Thread.sleep(3000);
        //tratamiendo
        driver.findElement(By.id(":ro:")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\":rk:-a20c4f99-aea8-4d2c-bd92-8b66fba82789\"]/ul/div/div/div[1]/div[4]/div/table/tbody/tr[1]/td[4]/div/textarea[1]")).sendKeys("Es fundamental un seguimiento multidisciplinario que incluya cardiología pediátrica o adultos, según la edad del paciente.");
        //Thread.sleep(3000);
        //adenda

        driver.findElement(By.id(":rm:")).sendKeys("El paciente debe estar atento a cualquier signo de alarma, como vómitos persistentes, pérdida de peso injustificada, o dolor intenso que no cede con medicación. Ante estos síntomas, se debe buscar atención médica inmediata.");
        Thread.sleep(3000);
        //Nueva Receta
        driver.findElement(By.xpath("//*[@id=\":rk:-a20c4f99-aea8-4d2c-bd92-8b66fba82789\"]/ul/div/div/div[1]/div[6]/div/div/button")).click();

        Thread.sleep(3000);
        driver.findElement(By.id(":rp:")).sendKeys("Furosemida 20 mg: 1 tabletas, tomar por vía oral 1 vez al día.\n" +
                "Metoprolol 25 mg: 1 tabletas, tomar por vía oral 1 vez al día.");

        //Thread.sleep(3000);

    }
}

