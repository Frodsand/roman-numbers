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
    @Test
    void numberSix(){
        assertEquals(romanNumber(6), "VI");
    }
    @Test
    void numberSeven(){
        assertEquals(romanNumber(7), "VII");
    }
    @Test
    void numberEight(){
        assertEquals(romanNumber(8), "VIII");
    }
    @Test
    void numberNine(){
        assertEquals(romanNumber(9), "IX");
    }
    @Test
    void numberTen(){
        assertEquals(romanNumber(10), "X");
    }
    @Test
    void numberEleven(){
        assertEquals(romanNumber(11), "XI");
    }
    @Test
    void numberFourteen(){
        assertEquals(romanNumber(14), "XIV");
    }
    private String romanNumberFour(int number){
        String total = "";
        if (number <= 4){
            if (number == 4){
                total = "IV";
            }
            else{
                for (int i = 0; i < number; i++){
                    total += "I";
                }
            }
        }
        return total;
    }

    private String romanNumberFive(int number){
       String total = "V";
        if (number == 5){
            return total;
        }else if (number == 9){
            return "IX";
        }
        else{
            for (int i = 0; i < number - 5; i++) {
                total = total + "I";
            }
        }
        return total;
    }

    private String romanNumberTen(int number){
        String total = "X";
        if(number == 10){
            return total;
        }
        else{
            for (int i = 0; i < number - 10; i++) {
                total = total + "I";
            }
        }
        return total;
    }
    private String romanNumber(int number){
        String total = "";
        if (number <= 4){
            return romanNumberFour(number);
        }
        if (number >= 5 && number <= 9){
            return romanNumberFive(number);
        }
        if(number >= 10){
           return romanNumberTen(number);
        }
        return total;

    }
}
