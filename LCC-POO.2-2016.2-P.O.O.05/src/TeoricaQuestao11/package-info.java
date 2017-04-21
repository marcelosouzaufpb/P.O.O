package TeoricaQuestao11;
/*
 * HashTable
 * 
 * Esta classe implementa uma tabela de hash, que mapeia chaves para valores.
 * Qualquer não- nullobjeto pode ser usado como uma chave ou como um valor. Para
 * armazenar e recuperar com êxito objetos de um hashtable, os objetos usados
 * ​​como chaves devem implementar o hashCode método e o equalsmétodo.
 * 
 * Uma Hashtableinstância de tem dois parâmetros que afetam seu desempenho:
 * capacidade inicial e fator de carga . A capacidade é o número de baldes na
 * tabela hash, ea capacidade inicial é simplesmente a capacidade no momento em
 * que a tabela hash é criada. Observe que a tabela de hash está aberta : no
 * caso de uma "colisão de hash", um único balde armazena várias entradas, que
 * devem ser pesquisadas seqüencialmente. O fator de carga é uma medida de quão
 * cheia a tabela de hash é permitida para obter antes que sua capacidade seja
 * aumentada automaticamente. Os parâmetros de capacidade inicial e de fator de
 * carga são apenas sugestões para a implementação.
 * 
 * Geralmente, o fator de carga padrão (.75) oferece uma boa compensação entre
 * custos de tempo e espaço. Valores mais altos diminuem a sobrecarga de espaço,
 * mas aumentam o custo de tempo para procurar uma entrada (o que se reflete na
 * maioria das operações Hashtable, incluindo obter e colocar ).
 * 
 * A rehashcapacidade inicial controla uma troca entre espaço desperdiçado ea
 * necessidade de operações, que consomem tempo. Não há rehashoperações vão
 * sempre ocorrer se a capacidade inicial é maior que o número máximo de
 * entradas a Hashtable conterá dividido pelo seu fator de carga. No entanto,
 * definir a capacidade inicial muito alta pode desperdiçar espaço.
 * 
 * Se muitas entradas forem feitas em um Hashtable, criá-lo com uma capacidade
 * suficientemente grande pode permitir que as entradas sejam inseridas de forma
 * mais eficiente do que permitir que ele execute reajustes automáticos conforme
 * necessário para aumentar a tabela.
 * 
 * Este exemplo cria um hashtable de números. Ele usa os nomes dos números como
 * chaves:
 * 
 */

/*
 * Hashtable<String, Integer> numbers
 * 
 * Tabela de Hash e implementação de lista vinculada da interface de Mapa , com
 * ordem de iteração previsível. Esta implementação difere do HashMap , uma vez
 * que mantém uma lista duplamente vinculada executando todas as suas entradas.
 * Esta lista vinculada define a ordem de iteração, que é normalmente a ordem em
 * que as chaves foram inseridas no mapa ( ordem de inserção ). Note-se que a
 * fim de inserção não é afectada, se uma tecla é re-inserida no mapa. (A chave
 * k é reinserido um mapa m se m.put (k, v) é invocado quando m.containsKey (k)
 * voltariam verdadeiro imediatamente antes da invocação.)
 * 
 * Esta implementação poupa seus clientes da ordem não especificada, geralmente
 * caótica fornecida por HashMap(e Hashtable), sem incorrer no aumento do custo
 * associado TreeMap. Ele pode ser usado para produzir uma cópia de um mapa que
 * tem a mesma ordem que o original, independentemente da implementação do mapa
 * original:
 */

/*
 * HashMap O HashMap implementa a interface Map<K,V>, Cloneable e Serializable,
 * mas o que importa para nós aqui é apenas que ele implementa Map. Perceba que
 * a própria implementação do Map<K,V> usa Generics para atribuir um key-value
 * para a lista, em outras palavras, com o HashMap e Generics podemos
 * especificamente dizer qual o tipo da nossa chave (string, int, double e etc)
 * e o tipo do nosso valor, que obviamente podem diferir sem problema algum.
 */

/*
 * TreeMap
 * 
 * Uma NavigableMapimplementação Red-Black árvore baseada . O mapa é
 * classificado de acordo com a ordem natural de suas chaves, ou por um
 * Comparatorfornecido no momento da criação do mapa, dependendo de qual
 * construtor é usado. Esta implementação fornece custo log (n) o tempo
 * garantido para o containsKey, get, pute remove operações. Algoritmos são
 * adaptações daqueles em Cormen, Leiserson, e Rivest's Introduction to
 * Algorithms .
 * 
 * Observe que a ordenação mantida por um mapa de árvore, como qualquer mapa
 * classificado e se um comparador explícito é ou não fornecido, deve ser
 * consistente comequals se este mapa classificado é para implementar
 * corretamente a Mapinterface. (Veja Comparableou Comparatorpara uma definição
 * precisa de consistente com iguais .) Isto é assim porque a Mapinterface é
 * definida em termos da equals operação, mas um mapa ordenado executa todas as
 * comparações chave usando sua compareTo(ou comparemétodo), assim duas chaves
 * que são considerados iguais por Este método é, do ponto de vista do mapa
 * ordenado, igual. O comportamento de um mapa ordenado é bem definido, mesmo
 * que sua ordenação seja inconsistente com equals; Ele Mapsimplesmente não
 * consegue obedecer ao contrato geral da interface.
 */

/*
 * Todos os 3 tipos iniciais utilizão da tabela hash para se organizar ou para
 * emplementar uma ordem de organizaçãp cada uma com sua caracteristica ja o
 * treeSet utiliza da arvore para se organizar usando do compareTo os outros
 * usam do equals e do hashCode
 */
