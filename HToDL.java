import java.util.function.ToDoubleFunction;

public class HToDL{
    public static void main(String[] args){
        ToDoubleFunction<Integer> ob=a->a/2;
        System.out.println(ob.applyAsDouble(5));
    }
}