import br.com.alura.modelo.Cliente
import br.com.alura.modelo.Diretor
import br.com.alura.modelo.Gerente
import br.com.alura.modelo.SistemaInterno

fun testaAutenticacao() {
    val diretor = Diretor("Alex", "111-111-111-11", 2000.0, 1234, 100.0)
    val gerente = Gerente("Fran", "222-222-222-22", 1500.0, 1234)
    val cliente = Cliente("Gui","555.555.555-55",1234)
    val sistema = SistemaInterno()

    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 1234)
    sistema.entra(cliente,1234)
}