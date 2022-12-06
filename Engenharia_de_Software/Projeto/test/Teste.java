

import DTO.Cliente;
import DTO.Pizzaria;
import DTO.Funcionario;
import DTO.Pedido;
import DTO.Pizza;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lucas Emanoel
 */
public class Teste {
    
    public void Teste() {
        
        Pizzaria pizzaria = new Pizzaria();
        
        assertEquals(pizzaria.getPizzas().size(), 0);
        
        pizzaria.setPizzas(new Pizza("Calabresa", "Molho de tomate ,calabresa e queijo"));
        pizzaria.setPizzas(new Pizza("Gorgonzola", "Molho de tomate ,queijo gorgonzola e tomate"));
        
        assertEquals(pizzaria.getPizzas().size(), 2);
        
        assertEquals(pizzaria.getClientes().size(), 0);
        
        pizzaria.setClientes(new Cliente("Lucas","528.798.578-99","Rua XZ","03-02-2004"));
        pizzaria.setClientes(new Cliente("Emanoel","171.181.048-76","Rua Y","05-02-1978"));
        
        assertEquals(pizzaria.getClientes().size(), 2);
        
        assertEquals(pizzaria.getFuncionarios().size(), 0);
        
        pizzaria.setFuncionarios(new Funcionario(13,"Evair","Balconista"));
        
        assertEquals(pizzaria.getFuncionarios().size(), 1);
        
        assertEquals(pizzaria.getPedidos().size(), 0);
        
        pizzaria.setPedidos(new Pedido("20-09-2022", "Lucas", 3));
        
        assertEquals(pizzaria.getPedidos().size(), 1);
        
        Cliente cli = new Cliente("Daiana","154.099.765-32","Rua V","18-07-1983");
        
        cli.Cadastro(cli); 
        
        List<Cliente> cliente = (List<Cliente>) pizzaria.BuscarCliente("Daiana");
        
        assertEquals(cliente.get(0), "Daiana");
        
        Pizza p = new Pizza("Mussarela","molho de tomate e queijo");
        
        p.ExcluirPizza("Mussarela");
        p.MostrarPizzas();
        
        pizzaria.getPedidos();
        
        
        
        
        
    }
    
   
}
