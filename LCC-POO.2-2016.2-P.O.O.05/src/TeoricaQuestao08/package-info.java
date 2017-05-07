
package TeoricaQuestao08;
/*
 * Estruturas que usam hash criam endereços para categorizar espaços de memoria,
 * se deve usar critérios mais individualistas para que assim seja feita uma
 * seleção mais rigorosa, logo haverá menos elementos em cada seção tornando o
 * processo de busca mais rapido, e como nos conjuntos não é permitido elementos
 * repetidos. Como por exemplo uma caixa de correspondências de um prédio, o
 * código hash (número de cada apartamento) ajuda o porteiro a achar mais rápido
 * em qual gaveta cada correspondecia deve ser colocada, e aqui tambem não se
 * admite elementos repetidos.
 * 
 * 
 * HashSet é o mais rápido de todos, mas não garante a ordenação dos seus elementos,complexidade desta estrutura 
 *é O(1),em outras palavras, não importa o quanto você adicione, remova, retire, o tempo de execução sempre será
 *o mesmo. 
 *LinkedHashSet faz uso também do HashTable com linked list, ou seja, temos aqui a seguinte situação: Os elementos
 *continuam na ordem que são inseridos, diferente do HashSet que “embaralha” tudo. E a complexidade do 
 *LinkedHashSet é O(1) para operações básicas.
 *TreeSet implementa SortedSet, logo possui elementos ordenados automaticamente, ou seja, independente da ordem
 *que você inserir os elementos, eles serão ordenados. Mas isso tem um custo, a complexidade para os métodos add,
 *remove e contains são bem maiores que do HashSet, são elas O(log (n)), não é bem uma complexidade exponencial
 *mas é bem maior que O(1) que tem seu tempo inalterado.
*/