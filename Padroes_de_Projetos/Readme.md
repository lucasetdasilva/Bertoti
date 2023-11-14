<h1 align = "center"> Padrões de Projetos</h1>
<br>

| Nome do Padrão  | Anti Padrão | Definição | Problema que resolve | Exemplo de Aplicação no Java |
| ------------- | ------------- | ------------- | ------------- | ------------- |
| Strategy  | Herança  | Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis, permitindo que o cliente escolha dinamicamente o algoritmo desejado em tempo de execução | Duplicação de código | Comparator |
| Observer  | Polling | Estabelece uma dependência um-para-muitos entre objetos, permitindo que um objeto, chamado sujeito, notifique automaticamente todos os seus observadores sobre mudanças de estado | Alto acoplamento | Observable |
| Composite  |  God Object | Permite tratar objetos individuais e composições de objetos de maneira uniforme, formando uma hierarquia de objetos em que ambos são manipulados de maneira consistente | Objetos individuais e composições de objetos desordenados | Swing |
| Facade  | Gordian Knot | Fornece uma interface unificada simplificada para um conjunto de interfaces em um subsistema | Complexidade de um subsistema| JOptionPane |
| Singleton  | Monostate | Garante a existência de apenas uma instância de uma determinada classe, fornecendo um ponto global de acesso a essa instância | Múltiplas instâncias | System |

