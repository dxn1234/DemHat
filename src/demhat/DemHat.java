/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demhat;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DemHat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n+5];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        int ketQua=0;
        for(int i=1;i<n;i++){
            if(a[i]!=a[i+1]){
                ketQua++;
            }
        }
        System.out.println(ketQua);
    }
    
}
