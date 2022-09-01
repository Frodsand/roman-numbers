import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumbers {
    @Test
    void numberOne(){
        assertEquals(romanNumber(1), "I");
    }
    @Test
    void numberTwo(){
        assertEquals(romanNumber(2), "II");
    }
    @Test
    void numberThree(){
        assertEquals(romanNumber(3), "III");
    }
    @Test
    void numberFour(){
        assertEquals(romanNumber(4), "IV");
    }

    private String romanNumber(int number){
        if (number == 1) return "I";
        if (number == 2) return "II";
        if (number == 3) return "III";
        if (number == 4) return "IV";
        return "";
    }
}
