import java.lang.Math;

public class TestLogicQA {
    public static void main(String[] args){
        int rows = 10;
        for(int i = rows; i >= 1; --i){
            int a = (2*i-1) /2;
            int b = (2*i) /2;
            for(int j = 1; j <= (2*i-1); ++j){
                if(j <= b){
                    System.out.print(j);
                } else {
                    System.out.print(a);
                    a = a-1;
                }
            }
            System.out.println();
        }
    }
    
} 
