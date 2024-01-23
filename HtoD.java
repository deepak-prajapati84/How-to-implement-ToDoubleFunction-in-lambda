import java.util.function.ToDoubleFunction;

public class HtoD{
    public static void main(String[] args){
        ToDoubleFunction<String> str=s->s.length();
        System.out.println("the Lenght is : "+ str.applyAsDouble("DeepakPrajapati"));
    
        ToDoubleFunction<String> str2=new ToDoubleFunction<String>() {
            @Override
            public double applyAsDouble(String value){
                return value.length();
            }
        };
        System.out.println("The Length of a given string using anonymous inner class " + str2.applyAsDouble("Lenghtofthiscurrentvalue"));
    
    }

}