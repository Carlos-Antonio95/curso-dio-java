public class CaixaEletronico {
    public static void main(String[] agrs){
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        //Condiocional simples
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }
        System.out.println(saldo);
    }
}
