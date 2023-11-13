package project2023.Diploma_Projects_Management_App;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

import project2023.Diploma_Projects_Management_App.dao.ThesisDAO;
import project2023.Diploma_Projects_Management_App.model.Thesis;

@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
public class ThesisDAOTest {

    @Autowired
    private ThesisDAO thesisDAO;

    @Test
    void testFindById() {
        Thesis thesis = thesisDAO.findById(1);
        Assertions.assertNotNull(thesis);
        Assertions.assertEquals(1, thesis.getId());
    }

    @Test
    void testFindByStudentid() {
        Thesis thesis = thesisDAO.findByStudentid(2);
        Assertions.assertNotNull(thesis);
        Assertions.assertEquals(2, thesis.getStudentid());
    }
}