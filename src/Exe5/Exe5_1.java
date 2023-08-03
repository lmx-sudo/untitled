package Exe5;
public class Exe5_1 {
    public static void main(String[] args) {
        int n=5;
        int[][] a=new int[n][n];
        a[0][0]=1;
        for (int i = 2; i < n+1; i++) {
            if(i%2==0){
                for (int j = 0; j < i; j++) {
                    a[j][i-1]=(i-1)*(i-1)+j+1;
                }
                for (int j = 0; j < i-1; j++) {
                    a[i-1][j]=i*i-j;
                }
            }else{
                for (int j = 0; j < i; j++) {
                    a[i-1][j]=(i-1)*(i-1)+j+1;
                }
                for (int j = 0; j < i-1; j++) {
                    a[j][i-1]=i*i-j;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

