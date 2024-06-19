package com.devs4j.lombokspring;

import com.devs4j.lombokspring.files.FileManager2;
import com.devs4j.lombokspring.model.*;
import com.devs4j.lombokspring.service.ConfigService;
import com.devs4j.lombokspring.service.FileManager;
import com.devs4j.lombokspring.spring.HelloService;
import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
//import lombok.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class LombokSpringApplication {

    //private static final Logger log = LoggerFactory.getLogger(LombokSpringApplication.class);

    public static void valAndVar(){
        //final String username = "username"; //Se Reemplaza esta declaración por la siguiente de Loombok
        val username = "richard"; // val se usa para las constantes
        log.info("Username {} of type {}", username, username.getClass().getName());
        var profileDescription = "Developer"; // var se usa para las variables
        profileDescription = "Java Developer";
        log.info("Profile description {} of type {}", profileDescription, profileDescription.getClass().getName());
    }

    public static void nonNullExample(){
        //TwitterAccount twitterAccount = new TwitterAccount(null); //Se Reemplaza esta declaración por la siguiente de Loombok
        TwitterAccount twitterAccount = new TwitterAccount("raidentrance");
        log.info("Account {}", twitterAccount.getUsername());
    }

    public static void cleanupExample(){
        /*try (FileManager fileManager = new FileManager()){
            fileManager.write("Hello World", "file.txt");
        } catch (Exception e){
            e.printStackTrace();
        }*/
        try{
            @Cleanup("close")
            FileManager fileManager = new FileManager();
            fileManager.write("Hello World", "file.txt");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void getterAndSetterExample(){
        Person person = new Person();
        person.setName("Juan");
        person.setLastName("Perez");
        person.setAlive(true);
        log.info("Person {} {} is alive? {}", person.getName(), person.getLastName(), person.isAlive());

        person.foo();
    }

    public static void toStringExample(){
        User user = new User();
        user.setId(1);
        user.setUsername("richard");
        user.setPassword("123");
        user.setRole("admin");
        log.info("User {}", user.toString());
    }

    public static void equalsAndHashCodeExample(){
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("richard");
        user1.setPassword("123");
        user1.setRole("admin");

        User user2 = new User();
        user2.setId(1);
        user2.setUsername("richard");
        user2.setPassword("12345");
        user2.setRole("user");

        log.info("User1 equals User2? {}", user1.equals(user2));
        //log.info("User1 hashcode {} User2 hashcode {}", user1.hashCode(), user2.hashCode());
    }

    public static void equalsAndHashcodeWithSuperExample(){
        UserEmployee userEmployee1 = new UserEmployee();
        userEmployee1.setId(1);
        userEmployee1.setUsername("richard");
        userEmployee1.setPassword("123");
        userEmployee1.setRole("admin");
        userEmployee1.setEmployeeId(1);
        userEmployee1.setType(EmployeeType.EMPLOYEE);

        UserEmployee userEmployee2 = new UserEmployee();
        userEmployee2.setId(1);
        userEmployee2.setUsername("richard");
        userEmployee2.setPassword("12345");
        userEmployee2.setRole("user");
        userEmployee2.setEmployeeId(1);
        userEmployee2.setType(EmployeeType.VENDOR);

        log.info("UserEmployee1 equals UserEmployee2? {}", userEmployee1.equals(userEmployee2));
    }

    public static void constructorExample(){
        User user = new User(1, "richard", "123", "admin");
        User user2 = new User("rm","123");
        log.info("User {}", user.toString());
    }

    public static void dataExample(){
        Role role = new Role("ADMIN");
        role.setId(1);
        role.setCreateTs(LocalDateTime.now());

        log.info("Role {}", role.getName());
        log.info("Role hashcode {}", role.hashCode());
        log.info("Role full info {}", role.toString());
    }

    public static void valueExample(){
        Permission permission = new Permission(1, "READ", LocalDateTime.now());
        log.info("Permission name {}", permission.getName());
        log.info("Permission hashcode {}", permission.hashCode());
        log.info("Permission full info {}", permission.toString());
    }

    public static void basicBuilderExample(){
        Employee employee = Employee.builder()
                .id(10)
                .firstName("Richard")
                .lastName("Hendricks")
                .middleName("Javier")
                .salary(100.0f)
                .type(EmployeeType.EMPLOYEE)
                .address("Polanco")
                .address("Santa Fe")
                .address("Reforma")
                .address("Condesa")
                .createTs(LocalDateTime.now())
                .build();
        log.info("Employee {}", employee.toString());
    }

    public static void sneakyThrowsExample(){
        FileManager2.createFiles("src/main/resources/test1.properties","src/main/resources/test2.properties");
    }

    public static void withExample(){
        Point point = new Point(1.0f, 2.0f);
        Point point2 = point.withX(2.0f).withY(3.0f);
        log.info("Point {}", point.toString());
        log.info("Point 2 Cloning Point 1 {}", point2.toString());
    }

    public static void getLazyExample(){
        ConfigService configService = new ConfigService();
        String configuration = configService.getConfiguration();
        log.info("Configuration {}", configuration);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LombokSpringApplication.class, args);
        HelloService bean = context.getBean(HelloService.class);
        bean.sayHello();
        //valAndVar();
        //nonNullExample();
        //cleanupExample();
        //getterAndSetterExample();
        //toStringExample();
        //equalsAndHashCodeExample();
        //equalsAndHashcodeWithSuperExample();
        //dataExample();
        //dataExample();
        //valueExample();
        //basicBuilderExample();
        //sneakyThrowsExample();
        //withExample();
        //getLazyExample();
    }





}
