

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Paciente {

    public static void main(String[] args) {
        // Configurar el WebDriver de Chrome

        WebDriver driver = new ChromeDriver();

        try {
            // Crear una instancia de Faker para generar datos aleatorios
            Faker faker = new Faker();

            // Generar datos aleatorios
            String firstName = faker.name().firstName();
            String lastNameP = faker.name().lastNameF();
            String lastNameM = faker.name().lastNameM();
            String cedulaId = faker.cedula().cedulaId();
            String ssn = faker.idNumber().ssnValid();  // NIT
            String phoneNumber = faker.phoneNumber().cellPhone();


            // 1.Ir a la página web
            driver.get("http://clinica-dev.dennis-laurel.com/login");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.name("email")).sendKeys("caja@gmail.com");
            driver.findElement(By.name("password")).sendKeys("123456");
            driver.findElement(By.xpath("//*[@id='root']/main/div/form/button")).sendKeys(Keys.ENTER);
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id='root']/div[1]/nav/div/div/ul/a[3]/div/div/li/div[2]/span")).click();

            // 2. Localizar los campos de texto del formulario y llenar los datos aleatorios

            // Ingresar nombre
            WebElement firstNameField = driver.findElement(By.id(":r6:"));
            firstNameField.sendKeys(firstName);

            // Apellido Paterno
            WebElement lastNameP = driver.findElement(By.id(":r7:"));
            lastNameP.sendKeys(lastNameP);

            // Apellido Materno
            WebElement lastNameM = driver.findElement(By.id(":r8:"));
            lastNameM.sendKeys(lastNameM);

            // Cédula de Indentidad
            WebElement cedulaId = driver.findElement(By.id(":r8:"));
            cedulaId.sendKeys(cedulaId);

            // Razón social
            WebElement razonSocial = driver.findElement(By.id(":rd:"));
            razonSocial.sendKeys(razonSocial);

            // Nit
            WebElement nit = driver.findElement(By.id(":rc:"));
            nit.sendKeys(nit);

            // Telefono
            WebElement numeroTelefono = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/main/div[1]/div[1]/form/div[3]/div/div/div/div[10]/div/div/input"));
            numeroTelefono.sendKeys(numeroTelefono);



            // Imprimir los datos generados en la consola para verificar
            System.out.println("Datos generados:");
            System.out.println("Nombre: " + firstName);
            System.out.println("ApellidoP: " + lastName);
            System.out.println("ApellidoM: " + lastName);
            System.out.println("Teléfono: " + phoneNumber);
            System.out.println("Número de seguro: " + ssn);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar el navegador
            driver.quit();
        }
    }
}

/*package javafaker.tests;

public class Paciente {
    String firstName;
    String flastName;
    String mlastName;
    String cedulaId;
    String nitNumber;
    String razonSocial;
    String phoneNumber;
}*/

// WebElement submitButton = driver.findElement(By.id(""));
 //           submitButton.click();