package DomainLayer;

import java.io.Serializable;

public class Tuple<T,U> implements Serializable {
    private static final long serialVersionUID = -2344986941139471507L;

    private  T val1;
    private  U val2;

    public Tuple( T val1,  U val2) {
        this.val1 = val1;
        this.val2 = val2;
    }


    public static <T,U> Tuple of( T val1,  U val2){
        return new Tuple(val1,val2);
    }

    public T getVal1() {
        return val1;
    }

    public U getVal2() {
        return val2;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public void setVal2(U val2) {
        this.val2 = val2;
    }
//    @Override
//    public String toString() {
//        return "Pair{" +
//                "val1=" + val1 +
//                ", val2=" + val2 +
//                '}';
//    }
//}
}