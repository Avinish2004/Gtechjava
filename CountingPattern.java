public class CountingPattern {
    public static void main(String[] args) {
        int n = 'A'; 
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('A' + " ");
            }
            System.out.println();
        }
    }
}
