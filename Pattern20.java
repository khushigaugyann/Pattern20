public class Pattern20 {
    public static void main(String[] args) {
        int m=65;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)m);
                m++;
            }
            
            System.out.println();
        }
    }
}
