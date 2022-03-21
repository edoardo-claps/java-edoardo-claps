

public class Stampa {
    
public static void stampa(int [] pippo){
    System.out.print("[");

/*   for(int element:pippo){
    System.out.print(element);
    }
 */
    for (int i=0; i<pippo.length;i++){
        System.out.print(pippo[i]);
        if(i!=pippo.length-1){
            System.out.print(", ");
        }
        

    }
    System.out.print("]");

}
/* public static void main(String[] args){
    int[] array1={1,2,4,6,7};
    
    stampa(array1);
}

 */



}
