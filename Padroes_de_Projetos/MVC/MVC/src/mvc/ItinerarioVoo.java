package mvc;

import java.util.ArrayList;
import java.util.List;

public class ItinerarioVoo implements ComponenteComposto{
	
	private List<ComponenteComposto> componentes = new ArrayList<>();

	public void exibir() {
		for(ComponenteComposto componente: componentes) {
			componente.exibir();
		}
	}
	
	public void adicionarComponente(ComponenteComposto componente) {
        componentes.add(componente);
    }

    public void removerComponente(ComponenteComposto componente) {
        componentes.remove(componente);
    }
	
}
