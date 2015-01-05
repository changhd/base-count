/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.lang.*;


/**
 *
 * @author changhd
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        for(int i=0;i<5;i++){
           for(int j=0;j<7;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       */
        //orthogon(3,6);
        //orthogon(9,4);
       // orthogon(-3,4);
        //System.out.println("2*8=" + getAgrea(2,8));
        int countA=0;
        int countT=0;
        int countC=0;
        int countG=0;
        int countN=0;
       String x="ATCTTGATCGATCNGTA";
       String[] y = x.split("");
      // System.out.println(y[1]);
       /* int y;
        y=x>0?x:-x;
        System.out.println(y);*/
    for(int i=1;i<=x.length();i++){
        switch(y[i]){
            case "A":
                countA ++;
                break;
            case "T":
                countT ++;
                break;
            case "C":
                countC ++;
                break;
            case "G":
                countG ++;
                break;
            default:
                countN ++;
        }
            
    }
    System.out.println("Total bases = "+x.length()+";");
    System.out.println("A = "+countA+";\tT = "+countT+";\tC = "+countC+";\tG = "+countG+";\tN = "+countN+";");
    String chrom1 = "chr2";
    String chrom2 = "CHr2";
    if(!chrom1.equalsIgnoreCase(chrom2))
       {    System.out.println("different");
        }else{
            System.out.println("same");
        }
    }
    static int getAgrea(int x,int y){
        return x*y;
    }
    static void orthogon(int x ,int y){
        if(x<=0 || y<=0){
            return;
        }
        for(int i=0;i<x;i++){
           for(int j=0;j<y;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
