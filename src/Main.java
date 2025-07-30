//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n");

        // test admin

        Admin john = new Admin("John",2000,7,30);

        john.displayInfo(true);
        System.out.println(john.isBirthday());
        john.displayHappyBirthday();
        System.out.println("\n");

        // test normal user

        User nicolas = new User("Nicolas",1990,7,30);

        nicolas.displayInfo();
        System.out.println(nicolas.isBirthday());
        nicolas.displayHappyBirthday();
        System.out.println("\n");

    }
}