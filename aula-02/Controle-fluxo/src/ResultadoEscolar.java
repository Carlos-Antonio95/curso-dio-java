public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 0;
        
        //condiocional composta
        //Conddi��o
        /* 
        if (nota >= 7) {
            System.out.println("Aprovado");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Prova de recupera��o");
        }else{
            System.out.println("Reprovado");
        }
        

        //Condional ternario
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        */
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recupera��o" : "Reprovado";

        System.out.println(resultado);
        }
}
