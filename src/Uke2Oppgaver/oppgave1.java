package Uke2Oppgaver;

public class oppgave1 {
    public static int min(int[]a, int fra, int til) throws IllegalAccessException {
        if(fra<0 ||til>a.length || fra >=til){
            throw new IllegalAccessException("Illegal intervall");
        }

        int m=fra;              //indeksen til minste verdi i a[fra:til>
        int minVerdi=a[fra];    // minste verdi i a[fra:til>.

        for (int i=fra+1; i<til; i++){
            if(a[i]<minVerdi){
                m=i;
                minVerdi=a[m];
            }
        }
        return m;

    }
    /*
    public static int min(int[]a) throws IllegalAccessException {
        return min(a,0,a.length);
    }

     */
    public static void main(String [] args) throws IllegalAccessException {
        int [] a={3,4,8,9,3,6,88,79,45,67,3,1};
        int min=min(a,0,a.length);
        System.out.println(min);
        
    }
}
