package seleniumcode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Test extends testBase {
    @Given("^Como cliente ingreso a la url \"([^\"]*)\"$")
    public void comoClienteIngresoALaUrl(String arg0) throws Throwable {
        paginaInicio.inicio();
    }

    //Esta es 1era prueba

    /*@Given("^: escojo la ruta y la fecha$")
    public void escojo_la_ruta_y_la_fecha() throws Exception {
        paginaInicio.seleccionarOrigen("SCL");
        paginaInicio.seleccionarDestino("ANF");
        paginaInicio.elegirFechaIda(4);
        paginaInicio.elegirFechaVuelta(5);
        paginaInicio.realizarBusqueda();
    }

    @When("^: valido el horario y la tarifa light de ida$")
    public void valido_el_horario_y_la_tarifa_light_de_ida() throws Exception {
        paginaVuelosDisponibles.seleccionarVueloMasEconomico();
        paginaVuelosDisponibles.seleccionarTarifaLight();

    }

    @When("^: valido el horario y la tarifa light de vuelta$")
    public void valido_el_horario_y_la_tarifa_light_de_vuelta() throws Exception {
        paginaVuelosDisponibles.seleccionarVueloMasEconomico();
        paginaVuelosDisponibles.seleccionarTarifaLight();
        paginaVuelosDisponibles.clickEnBtnContinuar();
    }

    @When("^: selecciono un asiento de ida y uno de vuelta$")
    public void selecciono_un_asiento_de_ida_y_uno_de_vuelta() throws Exception {
        paginaSeleccionDeAsientos.elegirAsiento();
        paginaSeleccionDeAsientos.clickAsientoSiguienteVuelo();
        paginaSeleccionDeAsientos.elegirAsiento();
        paginaSeleccionDeAsientos.clickConfirmar();
    }

    @When("^: selecciono un maleta adicional$")
    public void selecciono_un_maleta_adicional() throws Exception {
        paginaSeleccionMaletas.agregarMaleta15kg(1);
        paginaSeleccionMaletas.clickContinuar();
    }

    @Then("^: Se muestra el formulario para completar\\.$")
    public void se_muestra_el_formulario_para_completar() throws Exception {
        //Assert.assertEquals(true,paginaFormularioVuelo.formularioIsPresent());
        paginaFormularioVuelo.escribirNombre("Fulanito");
        paginaFormularioVuelo.escribirApellido("Skywalker");
        paginaFormularioVuelo.escribirFechaDeNacimiento(15,5,1995);
        paginaFormularioVuelo.seleccionarGenero("masculino");
        paginaFormularioVuelo.seleccionarNacionalidad("Argentina");
        paginaFormularioVuelo.selecionarTipoDeDocumento("pasaporte");
        paginaFormularioVuelo.escribirNumeroDocumento(92455513);
        paginaFormularioVuelo.escribirEmail("fulanoM@gmail.com");
        paginaFormularioVuelo.seleccionarCodigoArea(54);
        paginaFormularioVuelo.escribirNumeroTelefono(1127481985);
        paginaFormularioVuelo.clickGuardar();
        paginaFormularioVuelo.clickContinuar();
    }

    @Given("^Elijo la ruta y la fecha de vuelo de ida$")
    public void elijoLaRutaYLaFechaDeVueloDeIda() {
    }

    @When("^Valido el horario y la tarifa del vuelo$")
    public void validoElHorarioYLaTarifaDelVuelo() {
    }


    @And("^Selecciono un asiento en la salida de emergencia$")
    public void seleccionoUnAsientoEnLaSalidaDeEmergencia() {
    }

    @And("^Selecciono una (\\d+) maletas adicionales$")
    public void seleccionoUnaMaletasAdicionales(int arg0) {
    }

    @Then("^Se muestra el formulario para completar\\.$")
    public void seMuestraElFormularioParaCompletar() {
    }*/

    //----------------------------------------------------------------------------------
    @Given("^Como cliente ingreso a la url \"([^\"]*)\"$")
    public void como_cliente_ingreso_a_la_url(String arg1) throws Exception {
        paginaInicio.seleccionarOrigen("SCL");
        paginaInicio.seleccionarDestino("ANF");
        paginaInicio.elegirFechaIda(4);
        paginaInicio.elegirFechaVuelta(5);
        paginaInicio.realizarBusqueda();
    }

    @Given("^: escojo la ruta y la fecha$")

    public void escojo_la_ruta_y_la_fecha() throws Exception {
        paginaVuelosDisponibles.seleccionarVueloMasEconomico();
        paginaVuelosDisponibles.seleccionarTarifaLight();
    }

    @When("^: valido el horario y la tarifa light de ida$")
    public void valido_el_horario_y_la_tarifa_light_de_ida() throws Exception {
        paginaVuelosDisponibles.seleccionarVueloMasEconomico();
        paginaVuelosDisponibles.seleccionarTarifaLight();
        paginaVuelosDisponibles.clickEnBtnContinuar();
    }

    @When("^: valido el horario y la tarifa light de vuelta$")
    public void valido_el_horario_y_la_tarifa_light_de_vuelta() throws Exception {
        paginaVuelosDisponibles.seleccionarVueloMasEconomico();
        paginaVuelosDisponibles.seleccionarTarifaLight();
        paginaVuelosDisponibles.clickEnBtnContinuar();
    }

    @When("^: selecciono un asiento de ida y uno de vuelta$")
    public void selecciono_un_asiento_de_ida_y_uno_de_vuelta() throws Exception {
        paginaSeleccionDeAsientos.elegirAsiento();
        paginaSeleccionDeAsientos.clickAsientoSiguienteVuelo();
        paginaSeleccionDeAsientos.elegirAsiento();
        paginaSeleccionDeAsientos.clickConfirmar();
    }

    @When("^: selecciono un maleta adicional$")
    public void selecciono_un_maleta_adicional() throws Exception {
        paginaSeleccionMaletas.agregarMaleta15kg(1);
        paginaSeleccionMaletas.clickContinuar();
    }

    @Then("^: Se muestra el formulario para completar\\.$")
    public void se_muestra_el_formulario_para_completar() throws Exception {
        paginaFormularioVuelo.escribirNombre("Fulanito");
        paginaFormularioVuelo.escribirApellido("Skywalker");
        paginaFormularioVuelo.escribirFechaDeNacimiento(15,5,1995);
        paginaFormularioVuelo.seleccionarGenero("masculino");
        paginaFormularioVuelo.seleccionarNacionalidad("Argentina");
        paginaFormularioVuelo.selecionarTipoDeDocumento("pasaporte");
        paginaFormularioVuelo.escribirNumeroDocumento(92455513);
        paginaFormularioVuelo.escribirEmail("fulanoM@gmail.com");
        paginaFormularioVuelo.seleccionarCodigoArea(54);
        paginaFormularioVuelo.escribirNumeroTelefono(1127481985);
        paginaFormularioVuelo.clickGuardar();
        paginaFormularioVuelo.clickContinuar();
    }





    @Given("^Elijo la ruta y la fecha de vuelo de ida$")
    public void elijo_la_ruta_y_la_fecha_de_vuelo_de_ida() throws Exception {

    }

    @When("^Valido el horario y la tarifa del vuelo$")
    public void valido_el_horario_y_la_tarifa_del_vuelo() throws Exception {

    }

    @When("^Selecciono un asiento en la salida de emergencia$")
    public void selecciono_un_asiento_en_la_salida_de_emergencia() throws Exception {

    }

    @When("^Selecciono una (\\d+) maletas adicionales$")
    public void selecciono_una_maletas_adicionales(int arg1) throws Exception {

    }

    @Then("^Se muestra el formulario para rellenar\\.$")
    public void se_muestra_el_formulario_para_rellenar() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}