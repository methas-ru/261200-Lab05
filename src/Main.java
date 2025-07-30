//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Admin john = new Admin("John",2000,7,31);

        //test display info

        System.out.println("\n");

        john.displayInfo(true);
        System.out.println("\n");

        System.out.println(john.isBirthday());
        john.displayHappyBirthday();

    }
}