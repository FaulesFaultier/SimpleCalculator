import org.junit.*;

public class TestExceptions {




//Testfälle der Int-Überläufe

    @Test(expected = ArithmeticException.class)
    public void testAddierenIntMaxValue() throws Exception {
        int result = Calculator.addieren(2147483647,1);
    }


    @Test(expected = ArithmeticException.class)
    public void testAddierenIntMaxNegativeValue() throws Exception {
        int result = Calculator.addieren(-2147483648,-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtrahierenIntMaxValue() throws Exception {
        int result = Calculator.subtrahieren(2147483647,-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtrahierenIntMaxNegativeValue() throws Exception {
        int result = Calculator.subtrahieren(-2147483648,1);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplizierenIntMaxValue() throws Exception {
        int result = Calculator.multiplizieren(2147483647,2);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplizierenIntMaxNegativeValue() throws Exception {
        int result = Calculator.multiplizieren(-2147483647,2);
    }

    //Überlauf beim Dividieren von Int-Werten nicht möglich, da eine Werterhöhung einen Quotienten von [|q<1;q>0|]
    //Funktioniert aufgrund der IEE-754 Speicherart, welche floats nutzen, nicht so einfach
/*
    //Testfälle der Float-Überläufe

    @Test(expected = Exception.class)
    public void testAddierenFloatMaxValue() throws Exception {
        float result = Calculator.addieren(Float.MAX_VALUE,1.5f);
        System.out.println(result);
    }


    @Test(expected = ArithmeticException.class)
    public void testAddierenFloatMaxNegativeValue() throws Exception {
        float result = Calculator.addieren(-Float.MAX_VALUE,-1.5f);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtrahierenFloatMaxValue() throws Exception {
        float result = Calculator.subtrahieren(Float.MAX_VALUE,-2.5f);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtrahierenFloatMaxNegativeValue() throws Exception {
        float result = Calculator.subtrahieren(-Float.MAX_VALUE,2.5f);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplizierenFloatMaxValue() throws Exception {
        float result = Calculator.multiplizieren(Float.MAX_VALUE,1.5f);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplizierenFloatMaxNegativeValue() throws Exception {
        float result = Calculator.multiplizieren(-Float.MAX_VALUE,1.5f);
    }

*/


    @Test(expected = ArithmeticException.class)
    public void testDivideByZeroInt(){
        Calculator.dividieren(5,0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZeroFloat(){
        System.out.println(Calculator.dividieren(5.5f,0.0f));
    }



}
