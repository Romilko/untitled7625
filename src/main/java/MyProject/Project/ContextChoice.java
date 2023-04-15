package Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ContextChoice {
    @Autowired
    ContextProcess contextProcess;
    public static String context = "";
    public void Choice() throws InterruptedException{
        System.out.println("Введите действие: \n1. Создать новый проект \n2. Подготовить письмо \n3. Зарегистрировать" +
                "письмо \n4. Подготовить материалы к техсовету \n0. Назад \nStop. Выйти ");
        Scanner scanner = new Scanner(System.in);

        while (!context.equalsIgnoreCase("stop")){
            context=scanner.nextLine();
            contextProcess.ContextProcess(context);
        }
    }
}
