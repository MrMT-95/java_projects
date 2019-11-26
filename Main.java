import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean valid;


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please provide your password:");
            String password = input.nextLine();
            passwordValidation checkPass = new passwordValidation();

            checkPass.check4Length(password);


            checkPass.check4Number(password);

            checkPass.check4Uppercase(password);

            checkPass.check4Specialchar(password);

            valid = checkPass.valid1 & checkPass.valid2 & checkPass.valid3 & checkPass.valid4;

            if (valid == false) {
                System.out.println("Wrong password!");
            }


        } while (!valid);

    }
}
