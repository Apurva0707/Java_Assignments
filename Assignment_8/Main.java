import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Department: " + student.getDepartment());

        Address address = student.getAddress();
        System.out.println("Address:");
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("Country: " + address.getCountry());
    }
}
