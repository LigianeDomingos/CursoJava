public class Programa{
public static void main(String args[]){

Conta minhaConta;
minhaConta = new Conta();


minhaConta.titular = "Duke";
minhaConta.saldo = 1000.0;
minhaConta.saca (400);

System.out.println(minhaConta.saldo);

minhaConta.deposita (100);

System.out.println(minhaConta.saldo);

//System.out.println("Saldo atual; " +minhaConta.saldo);
//}


}

}  
