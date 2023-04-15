package Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContextCase3 {
    @Autowired
    ContextChoice contextChoice;
    public void Case () throws InterruptedException{
        System.out.print("\033[H\033[2J");
        System.out.println("Письмо зарегистрировано.");
        Thread.sleep(2000);
        contextChoice.Choice();
    }
}
