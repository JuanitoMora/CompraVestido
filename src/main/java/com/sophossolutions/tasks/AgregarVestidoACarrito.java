package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.CarritoDeCompras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SendKeys;

public class AgregarVestidoACarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(CarritoDeCompras.RESULT_DRESS));
        actor.attemptsTo(Click.on(CarritoDeCompras.SELECT_DRESS));
        actor.attemptsTo(Click.on(CarritoDeCompras.SELECT_SIZE));
        actor.attemptsTo(DoubleClick.on(CarritoDeCompras.DELETE_QUANTITY));
        actor.attemptsTo(SendKeys.of("2").into(CarritoDeCompras.WRITE_QUANTITY));
        actor.attemptsTo(Click.on(CarritoDeCompras.ADD_SHOPPING_CAR));
        actor.attemptsTo(Click.on(CarritoDeCompras.VIEW_SHOPPING_CAR));
        actor.attemptsTo(MoveMouse.to(CarritoDeCompras.VIEW_TOTAL));
        actor.attemptsTo(Click.on(CarritoDeCompras.FINISHED_SHOPPING));
        actor.attemptsTo(MoveMouse.to(CarritoDeCompras.CHECK_SHOPPING));
    }

    public static AgregarVestidoACarrito adding(){

        return Tasks.instrumented(AgregarVestidoACarrito.class);
    }
}
