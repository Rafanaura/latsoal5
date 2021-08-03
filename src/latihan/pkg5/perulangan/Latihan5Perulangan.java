/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5.perulangan;

/**
 *
 * @author MOKLET-2
 */
public class Latihan5Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Menghitung Selisih Matriks A dan B");
        int baris = 2;
        int kolom= 2;
        
        int [][] matriks1 = {{ -5 , 3}, {7 , 2}}; 
        int [][] matriks2 = {{3 , 1 }, {5 , -2}};
        int [][] hasil= new int[2][2];
        
        System.out.println("Matriks A");
        for (int a=0; a<baris; a++){
            for (int i=0; i<kolom; i++){
                System.out.print(matriks1[a][i]+" ");
        }
            System.out.print("");
        
            System.out.println("Matriks B");
             for(int b=0; b<2; b++){
            for(int c=0; c<2; c++){
                System.out.println(matriks2[b][c]+ " ");
        }
                 System.out.println(" ");
    }
             for (int m=0; m<baris; m++){
                 for (int n=0; n<kolom; n++){
                     hasil[m][n]= matriks1[m][n] - matriks2[m][n];
                 }
             }
             System.out.println("Hasil pengurangan matriks A dan matriks B adalah : ");
             for (int i = 0; i < 2 ; i++){
            for(int j = 0; j< 2 ; j++){
                System.out.println(hasil [i][j] + " ");
            }
            System.out.println();
        }
    }
    }
}
    

