package company;

public class Programmer {
    private String name;
    private int age;


    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }

    void setName(String programmerName){
        if (programmerName.length() > 10){
            System.out.println("Name shouldn't be longer than 10! Try again please: ");
        }else {
            this.name = programmerName;
        }
    }
    void setAge(int programmerAge){
        if (programmerAge > 90 || programmerAge < 10){
            System.out.println("Programmer can't be that much older or younger. Try again please: ");
        }else {
            this.age = programmerAge;
        }
    }

    private void coding(){
        System.out.println("He can code.");
    }


}
