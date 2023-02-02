/*package fr.epsi.b3.c1.g1.projetmspr.dal;

import fr.epsi.b3.c1.g1.projetmspr.entities.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceDAOTest {
    @Autowired
    private ServiceDAO dao;

    @Test
    public void testSaveNotNull() {
        Service service = new Service(new User("Theo","Taououla","@gmail.com","123__sdezegr", new Address(10,"rue de la carotte","Nantes",44300,12.3,1.0)), new PlantsList("fleur","une fleur rose","picture1"));

        service.ajouterTracking(new Tracking("picture3", LocalDateTime.now()));

        Service savedService = dao.save( service );
        assertNotNull( savedService );
    }


}*/