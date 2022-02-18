

public class Anno {
    public static void main(String[] args) {

int anno=Integer.parseInt( args[0]);

        if( anno %400==0 || anno %4==0 && anno%100!=0 ){
            System.out.println("Anno bisestile");
        }
        else{
            System.out.println("Anno non bisestile");

        }
    }
}
/* 
gli anni non secolari il cui numero è divisibile per 4;
gli anni secolari il cui numero è divisibile per 400.
è bisestile se: è divisibile per 400 oppure se è divisibile per 4 ma non per 100 */