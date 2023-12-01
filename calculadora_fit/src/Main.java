import br.com.calculadorafit.funcionalidades.CalculoTMB;
import br.com.calculadorafit.funcionalidades.Hidratacao;
import br.com.calculadorafit.modelos.Alimento;
import br.com.calculadorafit.modelos.DadoUsuario;
import br.com.calculadorafit.modelos.Username;


public class Main {
    public static void main(String[] args) {
        Alimento arroz = new Alimento();
        arroz.setNome("Arroz");
        arroz.setCalorias(1.28);
        arroz.setProteina(0.03);
        arroz.setCarboidrato(0.28);
        arroz.setGordura(0.002);

        arroz.quantidadeCaloria(100);
        arroz.quantidadeProteina(100);
        arroz.quantidadeCarboidrato(100);
        arroz.quantidadeGordura(100);

        Username usuario1 = new Username();
        usuario1.setUsername("muraoka2016");
        usuario1.setEmail("felipemuraoka2016@outlook.com");
        usuario1.setPassword("123456");

        DadoUsuario usuario01 = new DadoUsuario();
        usuario01.setPeso(70);
        usuario01.setIdade(29);
        usuario01.setAltura(158);
        usuario01.setGenero("Masculino");

        // EXEMPLO FUNÇÃO HIDRATAÇÃO

        Hidratacao hidratacao = new Hidratacao();
        hidratacao.calculoHidratacao();

        hidratacao.setPeso(usuario01.getPeso());

        hidratacao.calculoHidratacao();

        // EXEMPLO FUNÇÃO CÁLCULO TMB

        CalculoTMB calcularTMBUser = new CalculoTMB();
        calcularTMBUser.calcularTMB();

        calcularTMBUser.setPeso(usuario01.getPeso());
        calcularTMBUser.setIdade(usuario01.getIdade());
        calcularTMBUser.setAltura(usuario01.getAltura());
        calcularTMBUser.setGenero(usuario01.getGenero());

        calcularTMBUser.calcularTMB();


    }
}
