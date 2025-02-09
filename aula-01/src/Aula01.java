public class Aula01 {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Carlos";
        String segundoNome = "Antonio";
        String nome;
        nome = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nome);


    }

    public static String nomeCompleto(String primieroNome, String segundoNome){
        return primieroNome.concat(" ").concat(segundoNome);
    }
}
