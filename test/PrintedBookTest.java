import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintedBookTest {
    PrintedBook pb;

    @BeforeEach
    void setUp() {
        pb= new PrintedBook("TestBook", Literaturtype.SKON, 20, 10);
    }

    @Test
    void convertLiteratureType() {

        double actual=pb.convertLiteratureType();

        assertEquals(1.7, actual);
    }

    @Test
    void calculatePoints() {
        double actual= pb.calculatePoints();
        assertEquals(340, actual);
    }
}


//sider'1.7*copies
//10*1.7*20=340