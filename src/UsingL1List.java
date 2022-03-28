import java.io.FileReader;
import java.util.Scanner;

public class UsingL1List {
    public static void main(String[] args) throws Exception{
        L1List apps = new L1List(32);
        FileReader fileReader = new FileReader("src/forUsingL1List.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            String myCommand = scanner.nextLine();
            if (myCommand.isEmpty()){
                continue;
            }
            if (myCommand.substring(0, myCommand.indexOf(' ')).equals("Run")){
                String application = myCommand.substring(4);
                //apps.insert(application);
            }
        }
    }
}
