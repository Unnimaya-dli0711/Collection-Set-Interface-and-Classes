package collections;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Person{

    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Name : "+name+" Age : "+age+"\n";
    }

}
public class CheckPresence {
    static HashSet<Person> persons=new HashSet<>();
    static void addPerson(Person person){
        persons.add(person);
        System.out.println(persons);
    }
    static boolean findPerson(Person person){
        for(Person i:persons){
            if(i.hashCode()==person.hashCode())
                return true;
        }
        return false;
    }
    public static void main(String[] args){

        int choice;
        Scanner scannerobject=new Scanner(System.in);
        do{
            System.out.println("Enter the choice");
            System.out.println("1.Add Person");
            System.out.println("2.Find Person");
            choice=scannerobject.nextInt();
            switch (choice){
                case 1:
                    String name;
                    int age;
                    System.out.println("Enter the name");
                    name=scannerobject.next();
                    System.out.println("enter the age");
                    age=scannerobject.nextInt();
                    Person person=new Person(name,age);
                    addPerson(person);
                    break;
                case 2:
                    String nameSearch;
                    int ageSearch;
                    System.out.println("Enter the name");
                    nameSearch=scannerobject.next();
                    System.out.println("enter the age");
                    ageSearch=scannerobject.nextInt();
                    Person person1=new Person(nameSearch,ageSearch);
                    boolean find=findPerson(person1);
                    System.out.println("Person Found : "+find);
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }while (choice<3);

    }
}