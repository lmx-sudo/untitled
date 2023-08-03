public class Exe1_5 {
    public static void main(String[] args) {
        int[][] a=new int[9][];
        for(int i=0;i<a.length;i++) {
            a[i] = new int[i + 1];
        }
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                if(j==0 || i==j) {
                    a[i][j]=1;
                }else {
                    a[i][j]=a[i-1][j]+a[i-1][j-1];
                }
            }
        }

        for(int i=0;i<a.length;i++) {
            for(int k=7-i;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


