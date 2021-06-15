package seleniumcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.*;


public class testBase {

    protected WebDriver driver = Hooks.getDriver();
    protected PaginaInicio paginaInicio = PageFactory.initElements(driver,PaginaInicio.class);
    protected PaginaVuelosDisponibles paginaVuelosDisponibles = PageFactory.initElements(driver,PaginaVuelosDisponibles.class);
    protected PaginaSeleccionDeAsientos paginaSeleccionDeAsientos = PageFactory.initElements(driver,PaginaSeleccionDeAsientos.class);
    protected PaginaSeleccionMaletas paginaSeleccionMaletas = PageFactory.initElements(driver,PaginaSeleccionMaletas.class);
    protected PaginaFormularioVuelo paginaFormularioVuelo = PageFactory.initElements(driver,PaginaFormularioVuelo.class);
}
