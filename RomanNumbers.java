import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumbers {
    @Test
    void numberOne(){
        assertEquals(romanNumber(1), "I");
    }

    private String romanNumber(int number){
        if (number == 1){
            return "I";
        }
        return "";
    }
}
