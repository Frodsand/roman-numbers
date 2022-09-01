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
    @Test
    void numberfive(){
        assertEquals(romanNumber(5), "V");
    }


    private String romanNumber(int number){
        if (number <= 3){

            String total = "";
            for (int i = 0; i < number; i++){
                total += "I";
            }
            return total;

        }
        if (number == 4){
            return "IV";
        }
        if (number == 5){
            return "V";
        }

        return "";

    }
}
