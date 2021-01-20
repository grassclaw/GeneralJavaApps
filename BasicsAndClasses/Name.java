public class Name {

    public static void main(String[] args) {
        Name name1 = new Name("Charles", "", "Xavier");
        System.out.printf("%s\n", name1.toString());
    }

    private String first, middle, last; // only middle can be null

    public Name(String first, String middle, String last) {
        this.first = nameFormatter(first);
        this.last = nameFormatter(last);
        if(middle.length() == 0 || middle == null){
            this.middle = "";
        }else{
            this.middle = nameFormatter(middle);
        }
    }

    private String nameFormatter(String name) {
        String fLet = name.substring(0, 1).toUpperCase();
        String lLet = name.substring(1).toLowerCase();
        return fLet + lLet;
    }

    public String toString() {
        return last + ", " + first + " " + middle;
    }
}
