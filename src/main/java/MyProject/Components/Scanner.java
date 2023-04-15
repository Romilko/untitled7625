package MyProject.Components;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MyScanner {
    public Scanner Scanner () {
       Scanner scanner = new Scanner(System.in);
       return scanner;
    }
}
