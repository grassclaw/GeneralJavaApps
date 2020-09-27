package sandbox;

// import java.util.*;

public class sandbox {
    // public static void main(String[] args) {

    // String name1 = "", name2 = "", name3 = "";
    // ArrayList<String> partners = new ArrayList<String>(Arrays.asList(name1,
    // name2, name3));

    // Scanner stdin = new Scanner(System.in);

    // for (int i = 0; i < partners.size(); i++) {

    // if (partners.get(i).equalsIgnoreCase("")) {
    // partners.set(i, stdin.next());
    // }
    // }

    // for (int i = 0; i < partners.size()*3; i++) {
    // System.out.println(partners.get(i));
    // }

    // stdin.close();

    // }

    public static void main(String args[]) {

        // Scanner keyboard = new Scanner(System.in); // declares a scanner object.

        // double maleStudents, femaleStudents, totalStudents;
        // double maleStudentPercentage, femaleStudentPercentage;

        // System.out.println("Enter the number of males registered: ");
        // maleStudents = keyboard.nextDouble();

        // System.out.println("Enter the number of females registered: ");
        // femaleStudents = keyboard.nextDouble();

        // totalStudents = maleStudents + femaleStudents;
        // maleStudentPercentage = maleStudents / totalStudents*100;
        // femaleStudentPercentage = femaleStudents / totalStudents*100;

        // System.out.println("Percentage of male students: " + maleStudentPercentage +
        // "%");
        // System.out.println("Percentage of female students: " +
        // femaleStudentPercentage + "%");

        // keyboard.close();

        // Scanner stdin = new Scanner(System.in);

        // String name = "", age = "", city = "", college = "", profession = "", animal
        // = "", animalName = "";

        // ArrayList<String> placeHolder = new ArrayList<String>(
        // Arrays.asList(name, age, city, college, profession, animal, animalName));

        // ArrayList<String> questions = new ArrayList<String>(Arrays.asList("Enter your
        // name: ", "Enter your age: ",
        // "Enter the name of a city: ", "Enter the name of a college: ", "Enter
        // profession: ",
        // "Enter a type of animal: ", "Enter a pet name: "));

        // for (int i = 0; i < questions.size(); i++) {

        // System.out.println(questions.get(i));
        // placeHolder.set(i, stdin.nextLine());

        // }

        // System.out.println("There once was a person named " + placeHolder.get(0) + "
        // who lived in " + placeHolder.get(2) + ". At the age of " + placeHolder.get(1)
        // + ", " + placeHolder.get(0) + " went to college at " + placeHolder.get(3) +
        // ". " + placeHolder.get(0) + " graduated and went to work as a "
        // + placeHolder.get(4) + ". Then, " + placeHolder.get(0) + " adopted a(n) " +
        // placeHolder.get(5) + " named " + placeHolder.get(6)
        // + ". They both lived happily ever after!");

        // stdin.close();
        boolean isPremiumCustomer = false;
        int nbooksPurchased = 0;
        int freeBooks = 10;
        freeBooks = 0;

        if (isPremiumCustomer) {
            if (nbooksPurchased > 4) {
                freeBooks = 1;
            } else if (nbooksPurchased > 7) {
                freeBooks = 2;
            }
        } else if (!isPremiumCustomer) {
            if (nbooksPurchased > 6) {
                freeBooks = 1;
            } else if (nbooksPurchased > 11) {
                freeBooks = 2;
            }
        }
        System.out.print(if(!isPremiumCustomer));

    }

}