public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "123.456.789-00");
        pf.exibirInformacoes();

        System.out.println();

        PessoaJuridica pj = new PessoaJuridica("Empresa ABC", "Av. Central, 456", "12.345.678/0001-99", "ABC Ltda.");
        pj.exibirInformacoes();
    }
}
