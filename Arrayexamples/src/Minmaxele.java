
import javax.print.attribute.IntegerSyntax;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Minmaxele {
    public static void main(String args[]){
        int[] numbers=new int[]{58,54,4,2,7};
        int minimum=numbers[0];
        int maximum=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>maximum)
                maximum=numbers[i];
            else if(numbers[i]<minimum){
                minimum=numbers[i];
            }
                System.out.println("maximum numbers "+maximum);
                System.out.println("minimum numbers "+minimum);
        }
        
    }
    
}
