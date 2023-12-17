import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Registration {
    String register() {
        Scanner myObjadd = new Scanner(System.in);  // Create a Scanner object
        Student student = new Student();
        CSVMAnager managespl = new CSVMAnager();
        try {
            FileWriter myWriter = new FileWriter("students.csv", true);
            myWriter.write(managespl.splitter(student.setvards(myObjadd.nextLine())));
            myWriter.write(managespl.splitter(student.setuzvards(myObjadd.nextLine())));
            myWriter.write(managespl.splitter(student.setemail(myObjadd.nextLine())));
            myWriter.write(student.setgrupa(myObjadd.nextLine()));
            myWriter.write("\n");
            myWriter.close();
            return "Successfully wrote to the file.";
        } catch (IOException e) {
            return "An error occurred.";
            //e.printStackTrace();
        }
    }
}
