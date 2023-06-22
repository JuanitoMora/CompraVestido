package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarCantidadVestidos implements Question<String> {

    private Target target;

    public ValidarCantidadVestidos(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

    public static ValidarCantidadVestidos getText(Target target){
        return new ValidarCantidadVestidos(target);
    }
}
