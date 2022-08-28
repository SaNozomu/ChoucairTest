package co.com.choucair.certification.choucairproject.questions;

import co.com.choucair.certification.choucairproject.userinterface.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question=question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        String msg = "";
        String aux = Text.of(WelcomePage.MSG_WELCOME).viewedBy(actor).asString();
        if (aux.equals("How uTest Works")){
            msg = "welcome message";
        }
        if (question.equals(msg)){
            result = true;
        }
        return result;
    }
}
