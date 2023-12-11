
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Address addressBean() {
        Address address = new Address();
        address.setCity("Sangli");
        address.setState("Maharashtra");
        address.setCountry("India");
        return address;
    }

    @Bean
    public Student studentBean() {
        Student student = new Student();
        student.setFirstName("Apurva");
        student.setLastName("Rawal");
        student.setRollNo(1);
        student.setDepartment("Computer Science");
        student.setAddress(addressBean());
        return student;
    }
}
