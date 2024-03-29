package Arithmetic;

public class Arithmetic <A extends Number, B extends Number> {
    A number1;
    B number2;
    public Arithmetic(A number1, B number2){

        this.number1 = number1;
        this.number2 = number2;

    }

    public Number add(){

        return number1.doubleValue() + number2.doubleValue();

    }

    public Number subtract(){

        return number1.doubleValue() - number2.doubleValue();

    }

    public Number multiply(){

        return number1.doubleValue() * number2.doubleValue();

    }

    public Number divide(){

        if (number2.doubleValue() == 0){

            throw new ArithmeticException("Cannot Divide By Zero.");

        }

        return number1.doubleValue() / number2.doubleValue();
    }

    public Number getMin(){

        if (number1.doubleValue() < number2.doubleValue()){

            return number1;
        }

        return number2;
    }

    public Number getMax(){

        if (number1.doubleValue() > number2.doubleValue()){

            return number1;
        }

        return number2;
    }

}