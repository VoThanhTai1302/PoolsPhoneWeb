package OOP;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private List<Person> person;

    public PersonManager() {

        this.person = new ArrayList<>();
    }

    //Thêm 1 đối tượng
    public void addPerson(Person person) {
        person.input(person);
    }

    //Xóa 1 đối tượng
    public boolean deletePerson(int id) {
        return person.removeIf(person -> person.getID() == id);
    }

    public boolean updatePerson(int id, String name, int age) {
        for (Person persons : person)
            if (persons.getID() == id) {
                persons.getName();
                persons.getAge();
                return true;
            }
        return false;
    }

    public Person findPersonByID(int id)

    {
        for (Person persons : person)
        {
            if(persons.getID() == id)
            {
                return persons;
            }
        }
        return null;
    }

    public void display(){
        for(Person persons : person)
        {
            System.out.println(persons);
        }
    }
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        System.out.println("Danh sách đổi tượng Person");

        personManager.addPerson(new Person(1,"Võ Thành Tài",20));
        personManager.addPerson(new Person(2,"Tài Võ Thành",25));
        personManager.addPerson(new Person(3,"Thành Võ Tài",30));
        personManager.display();
        //Hiển thị danh sách


//        //Thêm đối tượng
//        personManager.addPerson(new Person(4,"Võ Thành Tấn", 24));
//        personManager.display();
//
//        //Sửa đổi tượng theo ID
//        personManager.updatePerson(2,"Vo Thanh Tai", 19);
//        personManager.display();
//
//        //Delete đối tượng theo ID
//        personManager.deletePerson(1);
//
//        //Tìm kiếm đối tượng theo ID
//        System.out.println("\n Tìm kiếm đối tượng có id=2:");
//        Person person = personManager.findPersonByID(2);
//        if(person != null)
//        {
//            System.out.println(person);
//        }
//        else {
//            System.out.println("Không tìm thấy đối tượng");
//        }


    }
}
