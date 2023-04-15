package Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContextProcess {
    @Autowired
    ContextCase1 contextCase1;
    @Autowired
    ContextCase2 contextCase2;
    @Autowired
    ContextCase3 contextCase3;
    @Autowired
    ContextCase4 contextCase4;

    public void ContextProcess(String context) throws InterruptedException{
        switch (context){
            case ("1"): {

                contextCase1.Case();
                break;
            }
            case ("2"): {
                contextCase2.Case();
                break;
            }
            case ("3"): {
                contextCase3.Case();
                break;
            }
            case ("4"): {
                contextCase4.Case();
                break;
            }
        }
    }
}
