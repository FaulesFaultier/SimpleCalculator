import org.junit.Test;

import java.security.spec.ECField;

public class TestNormal {


    //Testfälle der Int-Methoden

    @Test
    public void testAddierenInt() throws Exception {
        int result = Calculator.addieren(5,3);
        assert result == 8;
    }


    @Test
    public void testSubtrahierenInt() throws Exception{
        int i1 = 5;
        int i2 = 3;
        int result = Calculator.subtrahieren(i1,i2);
        assert  result == 2;
    }

    @Test
    public void testMultiplizierenInt() throws Exception{
        int i1 = 5;
        int i2 = 3;
        int result = Calculator.multiplizieren(i1,i2);
        assert result == 15;
    }

    @Test
    public void testDividierenInt() throws  Exception{
        int i1 = 15;
        int i2 = 3;
        int result = Calculator.dividieren(i1,i2);
        assert result == 5;
    }

//Testfälle der Float-Methoden

    @Test
    public void testAddierenFloat() throws Exception{
        float f1 = 5.0f;
        float f2 = 5.5f;
        float result = Calculator.addieren(f1,f2);
        assert result == 10.5f;
    }

    @Test
    public void testSubtrahierenFloat() throws Exception{
        float f1 = 5.5f;
        float f2 = 2.3f;
        float result = Calculator.subtrahieren(f1,f2);
        assert result == 3.2f;
    }

    @Test
    public void testMultiplizierenFloat() throws Exception{
        float f1 = 2.5f;
        float f2 = 0.25f;
        float result = Calculator.multiplizieren(f1,f2);
        assert  result == 0.625f;
    }

    @Test
    public  void testDividierenFloat() throws Exception{
        float f1 = 0.625f;
        float f2 = 2.5f;
        float result = Calculator.dividieren(f1,f2);
        assert result == 0.25f;
    }


}
