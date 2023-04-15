package Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContextCase1 {
    @Autowired
    ContextChoice contextChoice;
    public void Case () throws InterruptedException{
        System.out.println("Новый проект создан.");
        Thread.sleep(2000);
        contextChoice.Choice();
    }
}
