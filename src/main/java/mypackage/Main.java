package mypackage;

import java.io.IOException;
import java.lang.annotation.Annotation;

import net.java.sezpoz.Index;
import net.java.sezpoz.IndexItem;
/**
 * Created by jeremymarshall on 3/07/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException, InstantiationException {


        for (final IndexItem<MyAnnotation, MyBase> item : Index.load(MyAnnotation.class, MyBase.class)) {
            System.out.println(item.toString());
            System.out.println(item.instance().toString());
            System.out.println(item.instance().getClass());
        }
    }
}
