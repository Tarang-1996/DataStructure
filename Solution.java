import java.io.*;
import java.math.*;
import java.text.*;
import java.util.PriorityQueue;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the cookies function below.
     */
    static int cookies(int k, int[] A) {
        int count=0;
        PriorityQueue pq=new PriorityQueue();
        for(int i=0;i<A.length;i++){
            pq.add(A[i]);
        }

        for(int j=0;j<pq.size();j++){
            if(pq.peek()<k){
                int m=pq.poll();
                int n=pq.poll();
                pq.add((1*m)+(2*n));
                count++;
            }
        }
        if(pq.peek()<k){
            count=-1;
        }
        return count;
    }
}