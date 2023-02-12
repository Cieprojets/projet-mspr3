/*package fr.epsi.b3.c1.g1.projetmspr.dal;

import fr.epsi.b3.c1.g1.projetmspr.entities.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceDAOTest {

    @Autowired
    private AdviceDAO dao;

    @Test
    public void testSaveNotNull() {
        Advice advice = new Advice(" En plein soleil, cultivez le caryoptéris et le céanothe, deux arbustes à la tendre floraison bleue.", new Tracking("picture1", LocalDateTime.now()),new Botanist(1224154014,"lola","margarita"));

         Advice savedAdvice = dao.save( advice );
        assertNotNull( savedAdvice );
    }

}
*/
