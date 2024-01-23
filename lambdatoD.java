import java.util.function.ToDoubleFunction;

public class lambdatoD{
    public static void main(String[] args){
        ToDoubleFunction<String> pt=s->s.length();

        //String input="Hello Deepak";
        // double length=pt.applyAsDouble(input);
        //System.out.println(lenght);
        //System.out.println(pt.applyAsDouble(input));
        System.out.println(pt.applyAsDouble("hello Deepak"));

    }
}