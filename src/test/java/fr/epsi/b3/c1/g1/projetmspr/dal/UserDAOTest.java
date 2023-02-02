package fr.epsi.b3.c1.g1.projetmspr.dal;

import fr.epsi.b3.c1.g1.projetmspr.entities.Address;
import fr.epsi.b3.c1.g1.projetmspr.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDAOTest {

    @Autowired
    private UserDAO dao;

    @Test
    public void testSaveNotNull() {
        User user = new User("Maria","Arberola","MA@gmail.com","123__sdezegr", new Address(10,"rue de la carotte","Nantes",44300,12.3,1.0));

        User savedUser = dao.save( user );
        assertNotNull( savedUser );
    }

}