// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int zero = 0;
        int ponteiro = 0;
        int gapAtual = 0;
        int maiorGap = 0;
        int next = N+1;
        if ((next & N) == 0) return 0;
        if ((N & N-1) == 0) return 0; 
        
        for (ponteiro = 1; ponteiro > 0; ponteiro <<= 1) {
            if ((ponteiro&N) != 0)  break; //vem aqui até achar o primeiro 1
        }   
                
        for (; ponteiro >= 0; ponteiro <<=1) {
            if ((ponteiro&N) != 0) { //se ponteiro for 1
                maiorGap = gapAtual < maiorGap ? maiorGap : gapAtual;
                gapAtual=-1;    
            }            
            gapAtual++;           
        }    
        return maiorGap;
    }
}