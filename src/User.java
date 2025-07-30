import java.time.LocalDate;

public class User {

    //init

    protected String name;
    protected LocalDate dob;

    //construct

    public User(){
        this.name = null;
        this.dob = LocalDate.now(); // current date
    }
    public User(String name, int year, int month, int date){
        this.name = name;
        this.dob = LocalDate.of(year,month,date); // current date
    }

    //getter

    public String getName() {
        return name;
    }
    public LocalDate getDob() {
        return dob;
    }

    public boolean isBirthday() {
        if (LocalDate.now().getDayOfMonth() == dob.getDayOfMonth() //date is equal
                && LocalDate.now().getMonth() == dob.getMonth() // month is equal
        ) {
            return true;
        }
        return false;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    //display
    public void displayInfo() {
        System.out.println(name + ": " + dob);
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }

}
