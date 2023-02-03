import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("deserializable.txt");
        Employee employee = new Employee("Peter", 1,200);

        Methods methods = new Methods();
        methods.serialize(file,employee);
        System.out.println(methods.deserialize(file));

        System.out.println("----------");

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Peter", 1,200));
        list.add(new Employee("Ivan", 2,300));
        list.add(new Employee("Oleg", 3,100));
        list.add(new Employee("Danylo", 4,230));
        list.add(new Employee("Vlad", 5,21001));
        list.add(new Employee("Olga", 6,420));
        list.add(new Employee("Anya", 7,1012));
        methods.serialize(file, (Serializable) list);
        System.out.println(methods.deserialize(file));





    }
}