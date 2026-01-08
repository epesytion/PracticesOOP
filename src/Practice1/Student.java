package Practice1;

public class Student {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    private double gpa;

    Student(){ //empty construcotr
        this.id = id_gen++;
    }

    Student(String name, String surname){ //parametrized constructor
        this(); //calling the empty constructor above (8-10 lines)
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ": " + name + " " + surname + " " + gpa;
    }
}
