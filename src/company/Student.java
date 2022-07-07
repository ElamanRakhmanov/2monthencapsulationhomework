package company;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String email;

    String getName(){

        return name;
    }
    String getSurname(){

        return surname;
    }
    int getAge(){

        return age;
    }
    String getEmail(){

        return email;
    }

    void setName(String studentName){
        if (studentName.length() > 15){
            System.out.println("Name shouldn't be longer than 10! Try again please: ");
        }else {
            this.name = studentName;
        }
    }
    void setSurname(String studentSurname) {
        if (studentSurname.length() > 15) {
            System.out.println("Surname shouldn't be longer than 10! Try again please: ");
        } else {
            this.surname = studentSurname;
        }
    }
    void setAge(int studentAge){
        if (studentAge <= 0){
            System.out.println("Human's age shouldn't be negative. Try again please: ");
        }else {
            this.age = studentAge;
        }
    }
    void setEmail(String studentEmail) {
        if (studentEmail.length() > 40) {
            System.out.println("Email shouldn't be longer than 30! Try again please: ");
        } else {
            this.email = studentEmail;
        }
    }
}
