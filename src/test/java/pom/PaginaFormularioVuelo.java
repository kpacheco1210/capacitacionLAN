package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.Normalizer;
import java.util.List;

public class PaginaFormularioVuelo extends BasePage {

    public PaginaFormularioVuelo(WebDriver driver) {
        super(driver);
    }

    // Objetos.
    @FindBy(css = "section[data-testid*='body']")
    WebElement formulario;

    @FindBy(css = "input[id*='firstName']")
    WebElement inputName;

    @FindBy(css = "input[id*='lastName']")
    WebElement inputLastName;

    @FindBy(css = "input[id*='dateOfBirth']")
    WebElement inputFechaDeNacimiento;

    @FindBy(css = "div[id*='gender']")
    WebElement inputGender;

    @FindBy(css = "div[id*='nationality']")
    WebElement inputNacionalidad;

    @FindBy(css = "ul[aria-labelledby*='nationality'] li")
    List<WebElement> listNaciones;

    @FindBy(css = "div[id*='documentType']")
    WebElement inputTipoDeDocumento;

    @FindBy(css = "input[id*='documentNumber']")
    WebElement inputNumeroDocumento;

    @FindBy(css = "input[id*='emails']")
    WebElement inputEmail;

    @FindBy(css = "div[id*='countryCode']")
    WebElement inputCodigoArea;

    @FindBy(css = "ul[aria-labelledby*='countryCode'] li")
    List<WebElement> listCodArea;

    @FindBy(css = "input[id*='phones0-number']")
    WebElement inputNumeroTelefono;

    @FindBy(css = "button[data-testid*='FormSubmitButton']")
    WebElement btnGuardar;

    @FindBy(css = "button[aria-label*='pago']")
    WebElement btnContinuar;


    // Metodos

    public void escribirNombre(String nombre) {
        waitFor(4);
        inputName.sendKeys(nombre);
    }

    public void escribirApellido(String apellido) {
        inputLastName.sendKeys(apellido);
    }

    public void escribirFechaDeNacimiento(int dia, int mes, int anio) {
        String diaS = String.valueOf(dia);
        if(dia<10)
            diaS = "0"+diaS;
        String mesS = String.valueOf(mes);
        if(mes<10)
            mesS = "0"+ mesS;

        String fecha = diaS + mesS + String.valueOf(anio);
        inputFechaDeNacimiento.sendKeys(fecha);
    }

    public void seleccionarGenero(String genero) {
        inputGender.click();
        waitFor(1);
        genero.toLowerCase();
        waitFor(2);
        if (genero.equals("masculino"))
            driver.findElement(By.cssSelector("li[data-value='MALE']")).click();
        if (genero.equals("femenino"))
            driver.findElement(By.cssSelector("li[data-value='FEMALE']")).click();
    }

    public void seleccionarNacionalidad(String nacion){
        inputNacionalidad.click();
        waitFor(1);
        for (WebElement nation: listNaciones) {
            String s = Normalizer.normalize(nation.getText(), Normalizer.Form.NFD);//nation.getText();
            String nombreNacion = s.replaceAll("\\p{M}", "");

            if(nombreNacion.contains(nacion)) {
                nation.click();
                break;
            }
        }
    }


    public void selecionarTipoDeDocumento(String tipoDeDoc){
        tipoDeDoc.toLowerCase();
        inputTipoDeDocumento.click();
        waitFor(1);
        if(tipoDeDoc.contains("cedula") && tipoDeDoc.contains("dni"))
            driver.findElement(By.cssSelector("li[data-value='DNI']")).click();
        if (tipoDeDoc.contains("pasaporte"))
            driver.findElement(By.cssSelector("li[data-value='PASAPORTE']")).click();
    }

    public void escribirNumeroDocumento(int nroDocumento){
        String num = String.valueOf(nroDocumento);
        inputNumeroDocumento.sendKeys(num);
    }

    public void escribirEmail(String email){
        inputEmail.sendKeys(email);
    }

    public void seleccionarCodigoArea(int codigoDeArea){
        String codigo = String.valueOf(codigoDeArea);
        inputCodigoArea.click();
        waitFor(1);
        for (WebElement code: listCodArea) {
            String s = code.getText();
            if(s.equals(codigo)) {
                code.click();
                break;
            }
        }
    }

    public void escribirNumeroTelefono(int numeroDeTelefono){
        String numTelefono = String.valueOf(numeroDeTelefono);
        inputNumeroTelefono.sendKeys(numTelefono);
    }

    public void clickGuardar(){
        waitFor(1);
        btnGuardar.click();
    }

    public void clickContinuar(){
        waitFor(5);
        btnContinuar.click();
    }
}