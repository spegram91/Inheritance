package pegram.stephen.Inheritance;

/**
 * Created by stephenpegram on 5/4/17.
 */

import java.util.ArrayList;
public class Main {

    public static void main(String [] args){


        int[] someArray = new int[10];
        for(int i = 0; i < someArray.length; i++){
            someArray[i] = (int) (Math.random()*someArray.length);
        }
        ArrayRotator ar = new ArrayRotator(someArray);

        System.out.println(ar.toString());

        ar.rotateArrayList(2);

        System.out.println(ar.toString());


    }
}
