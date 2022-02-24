public class Oggetti{
public static void main(String[] args) {
    Persona p1= new Persona();
    p1.nome="Edoardo";
    p1.saluta();

     Bottiglia b1 =new Bottiglia(1,1);

     b1.setcapacita(5);
     System.out.println(b1.getcapacita());


     /* è privato !!
    b1.capacita =2762594; */
}
    
    
}