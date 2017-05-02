import java.text.ParseException; 
import java.util.Scanner; 
public class BullyAlgorithm { 
    public static void main(String[] args) throws ParseException { 
        int ch; 
        Scanner sc = new Scanner(System.in); 
        do { 
            System.out.println("\n\t1.Bully \n\t3.Exit\n\tEnter choice : "); 
            ch = sc.nextInt(); 
            switch (ch) { 
            case 1: 
                bully(); 
                break; 
            } 
        } while (ch != 3); 
        sc.close(); 
    }  
    static void bully() { 
        int i; 
        int p[] = new int[10]; 
        int pno; 
        int ch; 
        int co; 
        int new_co; 
        System.out.println("\n\tHow many processes are in system : "); 
        Scanner sc = new Scanner(System.in); 
        pno = sc.nextInt(); 
        for (i = 0; i < pno; i++) { 
            p[i] = 1; 
        } 
        do { 
            System.out 
                    .println("\n\t***** BULLY ALGO *****\n\t1.Crash Process\n\t2.Recover process\n\t3.Go in back menu\n\tEnter choice : "); 
            ch = sc.nextInt(); 
            switch (ch) { 
            case 1: 
                System.out.println("\n\tProcess " + pno + " is crash*****\n\tEnter co-ordinate to start election : "); 
                p[pno - 1] = 0; 
                new_co = 0; 
                co = sc.nextInt(); 
                new_co = process(i, pno, new_co, co, p); 
                System.out.println("\n\t****New coordinator is  *****" + (new_co + 1)); 
                break; 
            case 2: 
                p[pno - 1] = 1; 
                co = pno - 2; 
                new_co = 0; 
                process(i, pno, new_co, co, p); 
                break; 
            } 
        } while (ch != 3); 
        sc.close(); 
    }  
    private static int process(int i, int pno, int new_co, int co, int p[]) { 
        for (i = co; i < pno; i++) 
            System.out.println("\n\t Election message to process " + (i + 1)); 
        for (i = co; i < pno; i++) 
            if (p[i] == 1) { 
                if (i > new_co) 
                    new_co = i; 
                System.out.println("\n\t Ok message from process  " + (i + 1)); 
            } 
        return new_co; 
    } 
}
