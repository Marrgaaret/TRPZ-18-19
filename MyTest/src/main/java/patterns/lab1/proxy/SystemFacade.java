package patterns.lab1.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SystemFacade {

    public String getFirstLineOfFile(String fileName) throws FileNotFoundException {
        Scanner scanner = getScanner(fileName);
        return scanner.nextLine();
    }

    private Scanner getScanner(String fileName) throws FileNotFoundException {
        return new Scanner(
                new File(
                        "MyTest/src/main/java/patterns/lab1/proxy/resources/" + fileName
                )
        );
    }

    public String getColor(int x, int y, String fileName)
            throws FileNotFoundException {
        char result = 0;
        Scanner scanner = getScanner(fileName);
        String line = "";
        for (int i = 0; i <= y; i++) {
            line = scanner.nextLine();
        }
        result = line.charAt(x);
        return result == '0' ? "Black" : "White";
    }
}
