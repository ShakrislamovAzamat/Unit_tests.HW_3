package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HW_Tests {

    MainHW mainHW = new MainHW();

    //3.1

    @Test
    void testEvenNumber () {
        assertTrue(mainHW.evenOddNumber(2));
    }
    @Test
    void testOddNumber (){
        assertFalse(mainHW.evenOddNumber(5));
    }

    //3.2

    @Test
    void testNumberInInterval(){
        assertTrue(mainHW.numberInInterval(26));
        assertTrue(mainHW.numberInInterval(56));
        assertTrue(mainHW.numberInInterval(99));
    }

    @Test
    void testNumberInBoundaryOfInterval(){
        assertFalse(mainHW.numberInInterval(25));
        assertFalse(mainHW.numberInInterval(100));
    }

    @Test
    void testNumberOutOfInterval(){
        assertFalse(mainHW.numberInInterval(0));
        assertFalse(mainHW.numberInInterval(101));
    }


}
