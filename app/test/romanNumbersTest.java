import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class romanNumbersTest {
    @Test
    void numberFour(){
        Assertions.assertEquals(RomanNumbers.romanNumber(4), "IV");
    }
    @Test
    void numberfive(){
        Assertions.assertEquals(RomanNumbers.romanNumber(5), "V");
    }
    @Test
    void numberNine(){
        Assertions.assertEquals(RomanNumbers.romanNumber(9), "IX");
    }

    @Test
    void numberTen(){
        Assertions.assertEquals(RomanNumbers.romanNumber(10), "X");
    }
    @Test
    void numberFourty(){
        Assertions.assertEquals(RomanNumbers.romanNumber(40), "XL");
    }

    @Test
    void numberNineteenine(){
        Assertions.assertEquals(RomanNumbers.romanNumber(99), "XCIX");
    }

    @Test
    void number253(){
        Assertions.assertEquals(RomanNumbers.romanNumber(253), "CCLIII");
    }

    @Test
    void number2531(){
        Assertions.assertEquals(RomanNumbers.romanNumber(2531), "MMCCCLI");
    }
}
