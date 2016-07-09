package mypackage;

/**
 * Created by jeremymarshall on 3/07/2016.
 */

@MyAnnotation
public class JavaUseMyAnnotation extends MyBase{

    private int val;

    public JavaUseMyAnnotation(){
        val = 23;
    }

    @MyAnnotation
    public static class Inner extends MyBase{
        private int val = 1;

        public Inner(){
        }
    }

    public JavaUseMyAnnotation(int v){
        val = v;
    }

}
