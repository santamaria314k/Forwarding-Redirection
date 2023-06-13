package co.edu.sena.java_new_a.model.repository;

import co.edu.sena.java_new_a.model.Beans.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl    {

public  static  void main(String[] args )throws SQLException{
    Repository<User> repository=new UserRepositoryImpl();


    System.out.println("==========saveObj Insert ==========");
 User UserInsert=new User();
UserInsert.setUser_firstname("carlos");
UserInsert.setUser_lastname("rojas");
UserInsert.setUser_email("carlos@loquesea.com");
UserInsert.setUser_password("12345");
repository.saveObj(UserInsert);

    UserInsert.setUser_firstname("PEPE");
    UserInsert.setUser_lastname("perez");
    UserInsert.setUser_email("pepe@correo.com");
    UserInsert.setUser_password("67890qwerty");
    repository.saveObj(UserInsert);

    System.out.println("==========listAllObj==========");

    repository.listAllObj().forEach(System.out::println);
    System.out.println();

    System.out.println("==========  byIdObj  ==========");
    System.out.println(repository.byIdObj(1));
    System.out.println();

    System.out.println("==========  saveObj  ==========");
    User UserUpdate = new User();
    UserUpdate.setUser_id(2);
    UserUpdate.setUser_firstname("jorge");
    UserUpdate.setUser_lastname("palacios");
    UserUpdate.setUser_email("jorge@example.com");
    UserUpdate.setUser_password("12345as");
    repository.saveObj(UserInsert);
    repository.listAllObj().forEach(System.out::println);
    System.out.println();

    System.out.println("==========  deleteObj  ==========");

repository.deleteObj(2);
repository.listAllObj().forEach(System.out::println);

}



}
