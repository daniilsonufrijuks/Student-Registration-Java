// Daniils Onufrijuks DP 2-1



import java.util.Scanner; // to scan user input

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        // Your code start here
        boolean exit = true;
        do {
            Scanner myObjcom = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter command(register | show | remove | update | exit): "); // lai noteikt kadu komandu izdarīts
            String userinput = String.valueOf(myObjcom.nextLine()); // lasam ievaditu komandu

            String test = userinput;

            if (test.matches("@#<>?")) { // parbaudam vai ir pareizi ievadīts
                System.out.println("Nepareizi! Ievadiet velreiz!"); // ja nepareizi ievadits (piemeram - #)
            } else {
                switch(userinput){ // ja pareizi ievadīts (piemeram: show)
                    case "exit": // exit 
                        System.out.println("Izejam no programmas");
                        exit = false;
                        break;
                    case "register": // registrejam studentu
                        System.out.println("Enter first_name, last_name, email, group to register student: ");
                        System.out.println("Enter each line, press enter");
                        // something adding in file(csv)
                        Registration register = new Registration();
                        System.out.println(register.register());
                        break;
                    case "update": // ja gribam updatetot failu
                        CSVMAnager managerupd = new CSVMAnager();
                        managerupd.update();
                        break;
                    case "remove": // ja gribam dzest kadu studentu
                        CSVMAnager managerrem = new CSVMAnager();
                        managerrem.delete();
                        // file reading and removing
                        break;
                    case "show": // ja gribam redzet kuri studenti ir registreti musu "db"
                        System.out.println("Reģistretejie studenti\n");
                        CSVMAnager managershow = new CSVMAnager();
                        managershow.show();
                        // file reading and showing
                        break;
                }
            }
        }
        while (exit); // lidz bridim ja exit ir false, exit bus false tikai ja bus komanda 'exit'
    }
}
