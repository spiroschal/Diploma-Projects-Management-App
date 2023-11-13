package project2023.Diploma_Projects_Management_App;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

import project2023.Diploma_Projects_Management_App.dao.UserDAO;
import project2023.Diploma_Projects_Management_App.model.User;

@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
public class UserDAOTest {

    @Autowired
    private UserDAO userDAO;

    @Test
    void testFindById() {
        User user = userDAO.findById(1);
        Assertions.assertNotNull(user);
        Assertions.assertEquals(1, user.getId());
    }

    @Test
    void testFindByUsername() {
        String username = "p";
        User user = userDAO.findByUsername(username).orElse(null);
        Assertions.assertNotNull(user);
        Assertions.assertEquals(username, user.getUsername());
    }


}
