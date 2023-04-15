package Project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        applicationContext.start();
        ContextChoice contextChoice = applicationContext.getBean(ContextChoice.class);
        contextChoice.Choice();
    }
}
