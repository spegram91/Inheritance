package pegram.stephen.Inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stephenpegram on 5/4/17.
 */

    public class ArrayRotator extends ArrayList<Integer> {

        public ArrayRotator(int[] givenArray){

            for (int element : givenArray){
                super.add(element);
                }
            }


        public void rotateArrayList (int k){
                for (int i = 0; i < k; i++){
                    this.add(this.size(),this.get(0));
                    this.remove(0);
                }
        }

    }


