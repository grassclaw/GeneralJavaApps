public class Student {
    private Name name;
    private int id;
    private int[] cscGrades;
    public static void main(String[] args) {
        int[] grades = {90,30,40,80};
        Name name1 = new Name("Charles", "", "Xavier");
        Student student1 = new Student(name1, 21212, grades);
        System.out.printf("%s\n", student1.toString());
    }

    public Student(Name name, int id, int[] cscGrades) {
        this.name = name;
        this.id = id;
        this.cscGrades = cscGrades; //this is the private array it is copied into
    }

    public double getAverage(){
        double avg = 0;
        int arrL = cscGrades.length;
        for(int i = 0; i<cscGrades.length; i++){
            avg += cscGrades[i];
        }
        return avg/arrL;
    }

    public String toString(){
        return String.format("%s (%d): %.2f", name, id, getAverage());
    }
}
