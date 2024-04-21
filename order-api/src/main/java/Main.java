import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static int[] moveZeros(int[] input,int length){
        if(length==0){
            throw new IllegalArgumentException(" Size should not be zero");
        }
        int temp=0;
        for(int i = 0 ;i < length ; i++){ //O(N)
            // 0 , 4 , 2, 0, 8, 0
            if(input[i] !=0){
                input[temp++] = input[i];
             //  temp = input[i];
            }
        }
        for(int i=temp;i<length;i++){
            input[i]=0;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] arr = {0,4,2,0,8,0};
        System.out.println(Arrays.toString(moveZeros(arr,arr.length)));;
    }

}
