package Uke2Oppgaver;

public class oppgaver {
    static int minTall(int[] a){
        int min_value=a[0];
        int min_index=0;

        for (int i=1; i<a.length; i++){
            int value=a[i];
            int index=i;

            if (value<min_value){
                min_index=value;
                min_index=index;
            }
        }

        return min_index;
    }
    public static void main(String [] args){
        int [] a={3,4,8,9,3,6,88,79,45,67,1,0};
        int min_index=minTall(a);

        System.out.println(min_index);
    }
}
