package abstrata;

public class App {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Heloisa");
        pf.setSobrenome("Silva");
        pf.setCpf("222-2222");
        pf.setEmail("h.123@gmail.com");

        System.out.println(pf.getNome() + " possui o e-mail: " + pf.getEmail());


        PessoaJuridica pj = new PessoaJuridica();


        pj.setNome("Ricardo");


        pj.setEmpresa("Click Memory");
        pj.setCnpj("111.111/000-23");

        System.out.println("A empresa " + pj.getEmpresa() + " pertence ao " + pj.getNome());
    }
}
