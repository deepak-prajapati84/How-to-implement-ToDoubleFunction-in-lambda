import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class lsit{
    public static void main(String[] args){
        List<String> str=new ArrayList<String>();
        str.add("78");
        str.add("67");
        str.add("90");
        str.add("34");
        str.add("54");

        ToDoubleFunction<String> prit=(String scope)->Double.valueOf(scope);
        str.stream().mapToDouble(prit).forEach(System.out::print);
    }
}