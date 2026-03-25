import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintedBookTest {


    @BeforeEach
    public void setUp() {
        static PrintedBook p= new PrintedBook("testbook", "BI", 10, 100);

    }

    public void calculateRoyaltiestest(){
       static int i= p.calculateRoyalties pages*convertLiteratureType()*copies;
    }

    @Test
    void calculateRoyalties() {
         int actual=p.calculateRoyaltiestest();
    }

    @Test
    void convertLiteratureType() {

    }

    @Test
    void testCalculatePoints() {
    }
}