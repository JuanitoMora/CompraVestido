package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class BuscarVestido implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(HomePage.WOMEN), Click.on(HomePage.DRESS));
    }

    public static BuscarVestido buscarVestido() {
        return Tasks.instrumented(BuscarVestido.class);
    }
}
