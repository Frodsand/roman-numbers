import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumbers {
    @Test
    void numberOne(){
        assertTrue(romanNumber(1));
    }

    private boolean romanNumber(int number){
        if (number == 1){
            return true;
        } return false;

    }
}
