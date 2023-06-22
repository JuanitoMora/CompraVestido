package com.sophossolutions.steps;

import com.sophossolutions.exceptions.GeneralDemoException;
import com.sophossolutions.questions.ValidarCantidadVestidos;
import com.sophossolutions.tasks.AgregarVestidoACarrito;
import com.sophossolutions.tasks.BuscarVestido;
import com.sophossolutions.userinterfaces.CarritoDeCompras;
import com.sophossolutions.userinterfaces.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class DemosScreenplayStepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("^Necesito buscar un vestido$")
    public void necesitoBuscarUnVestido() {
        theActorCalled("practicante").wasAbleTo(Open.browserOn(new HomePage()));
        theActorInTheSpotlight().attemptsTo(BuscarVestido.buscarVestido());
    }

    @When("^El tipo de vestido es nocturno$")
    public void elTipoDeVestidoEsNocturno() {
        theActorInTheSpotlight().attemptsTo(AgregarVestidoACarrito.adding());
    }

    @Then("^Valido que el vestido sea agregado al carrito de compras$")
    public void validoQueElVestidoSeaAgregadoAlCarritoDeCompras() {
        theActorInTheSpotlight().should(seeThat(ValidarCantidadVestidos.getText(CarritoDeCompras.VIEW_QUANTITY_SHOPPING_CAR),
                equalTo("2")).orComplainWith(GeneralDemoException.class,
                "El valor obtenido es diferente al esperado"));
    }
}
