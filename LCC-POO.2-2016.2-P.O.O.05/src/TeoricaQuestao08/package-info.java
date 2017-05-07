
package TeoricaQuestao08;
/*
 * Estruturas que usam hash criam endere�os para categorizar espa�os de memoria,
 * se deve usar crit�rios mais individualistas para que assim seja feita uma
 * sele��o mais rigorosa, logo haver� menos elementos em cada se��o tornando o
 * processo de busca mais rapido, e como nos conjuntos n�o � permitido elementos
 * repetidos. Como por exemplo uma caixa de correspond�ncias de um pr�dio, o
 * c�digo hash (n�mero de cada apartamento) ajuda o porteiro a achar mais r�pido
 * em qual gaveta cada correspondecia deve ser colocada, e aqui tambem n�o se
 * admite elementos repetidos.
 * 
 * 
 * HashSet � o mais r�pido de todos, mas n�o garante a ordena��o dos seus elementos,complexidade desta estrutura 
 *� O(1),em outras palavras, n�o importa o quanto voc� adicione, remova, retire, o tempo de execu��o sempre ser�
 *o mesmo. 
 *LinkedHashSet faz uso tamb�m do HashTable com linked list, ou seja, temos aqui a seguinte situa��o: Os elementos
 *continuam na ordem que s�o inseridos, diferente do HashSet que �embaralha� tudo. E a complexidade do 
 *LinkedHashSet � O(1) para opera��es b�sicas.
 *TreeSet implementa SortedSet, logo possui elementos ordenados automaticamente, ou seja, independente da ordem
 *que voc� inserir os elementos, eles ser�o ordenados. Mas isso tem um custo, a complexidade para os m�todos add,
 *remove e contains s�o bem maiores que do HashSet, s�o elas O(log (n)), n�o � bem uma complexidade exponencial
 *mas � bem maior que O(1) que tem seu tempo inalterado.
*/