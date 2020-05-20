public class Calculator {


    static public int addieren (int summand1, int summand2) throws ArithmeticException{
        long result;
        result = (long)summand1 + (long)summand2;
        checkOverflowInt(result);
        return (int)result;
    }



    static public float addieren (float summand1, float summand2) throws ArithmeticException{
        double result;
        result = (double)summand1+(double)summand2;
 //       checkOverflowFloat(result);
        checkFloatForInfinity(result);
         return (float)result;
    }



    static public int subtrahieren (int minuend, int subtrahend) throws ArithmeticException{
        long result;
        result = (long)minuend - (long)subtrahend;
        checkOverflowInt(result);
        return (int)result;
    }

    static public float subtrahieren (float minuend, float subtrahend) throws ArithmeticException
    {
        double result;
        result = (double)minuend - (double)subtrahend;
//        checkOverflowFloat(result);
        checkFloatForInfinity(result);
        return (float)result;
    }

    static public int dividieren (int dividend, int quotient) throws ArithmeticException{
        long result;
        result = (long)dividend / (long)quotient;
        checkOverflowInt(result);
        return (int)result;
    }

    static public float dividieren (float dividend, float quotient) throws ArithmeticException{
        double result;
        result = (double)dividend / (double) quotient;
 //       checkOverflowFloat(result);
        checkFloatForInfinity(result);
        return (float)result;
    }

    static public int multiplizieren (int faktor1, int faktor2) throws ArithmeticException{
        long result;
        result = (long)faktor1 * (long) faktor2;
        checkOverflowInt(result);
        return (int)result;
    }

    static public float multiplizieren (float faktor1, float faktor2) throws ArithmeticException{
        double result;
        result = (double)faktor1 * (double)faktor2;
 //       checkOverflowFloat(result);
        checkFloatForInfinity(result);
        return (float)result;
    }

    static private void checkOverflowInt(long check) throws  ArithmeticException{
        if (check > Integer.MAX_VALUE || check < Integer.MIN_VALUE){
            throw new ArithmeticException();
        }
    }
    /*
    static private void checkOverflowFloat(double check) throws  ArithmeticException{
        System.out.println(check);
        if (check > (double)Float.MAX_VALUE || check < -(double)Float.MAX_VALUE){
            throw new ArithmeticException();
        }
    }

     */

    static private void checkFloatForInfinity(double test){
        if (test == Float.POSITIVE_INFINITY || test == Float.NEGATIVE_INFINITY){
            throw new ArithmeticException();
        }
    }









}
