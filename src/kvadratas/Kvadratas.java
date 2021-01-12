/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kvadratas;

/**
 *
 * @author User
 */
public class Kvadratas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] m = {1, 2, 3, 4, 5};

        int[][] mr = new int[m.length][m.length];
        int c = 0;
        for (int a = 0; a < m.length; a++) {
            mr[a] = new int[m.length];
            for (int b = 0; b < m.length - c; b++) {
                mr[a][b] = m[b + c];
            }

            for (int d = m.length - c, e = 0; d < m.length; d++, e++) {
                mr[a][d] = m[e];
            }
            c++;
        }

        for (int i = 0; i < mr.length; i++) {
            int[] eilute = mr[i];
            for (int j = 0; j < eilute.length; j++) {
                int elementas = eilute[j];
                System.out.print(elementas + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] rez = new int[m.length][m.length];
        
        int f = m.length;
        for (int a = 0; a < m.length; a++) {
            rez[a] = new int[m.length];
            for (int b = 0; b < m.length - f; b++) {
                rez[a][b] = m[b + f];
            }

            for (int d = m.length - f, e = 0; d < m.length; d++, e++) {
                rez[a][d] = m[e];
            }
            f--;
        }
        
        for (int i = 0; i < rez.length; i++) {
            int[] eilute = rez[i];
            for (int j = 0; j < eilute.length; j++) {
                int elementas = eilute[j];
                System.out.print(elementas + " ");
            }
            System.out.println();
        }

    }

}
