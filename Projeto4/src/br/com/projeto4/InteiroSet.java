/*****************************************************************************************************************
* Prova Técnica Java --> Projeto 4 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.projeto4;

import java.util.Arrays;

/*Crie uma classe em Java chamada InteiroSet. Cada objeto InteiroSet pode armazenar inteiros no intervalo de 0 a 100. 
 * O conjunto é representado por um array de booleans. O elemento do array a[i] é true se o inteiro i estiver no conjunto. 
 * O elemento do array a[j] é false se o inteiro não estiver no conjunto. O construtor sem argumento inicializa o
array Java como ‘conjunto vazio’ (todos os valores false).*/

public class InteiroSet {

    private static final int MIN = 0;

    private static final int MAX = 100;

    private boolean[] a; // [0...100]

    /*
     O construtor sem argumento inicializa o array java como conjunto vazio (isto é, um conjunto cuja representação de array 
     contém todos os valores false).
     */
    public InteiroSet() {
        a = new boolean[MAX + 1];
    }

    /**
     O método union, que cria um terceiro conjunto com a união teórica de dois conjuntos existentes
     * @param c1
     * @param c2
     * @return
     */
    public static InteiroSet union(InteiroSet c1, InteiroSet c2) {
    	InteiroSet r = new InteiroSet();
        for (int i = 0; i <= MAX; ++i) {
            r.a[i] = c1.a[i] | c2.a[i];
        }
        return r;
    }

    /**
     o método intersection, que cria um terceiro conjunto com a intersecção teórica de dois conjuntos existentes;   
     * @param c1
     * @param c2
     * @return
     */
    public static InteiroSet interseccao(InteiroSet c1, InteiroSet c2) {
    	InteiroSet r = new InteiroSet();
        for (int i = 0; i <= MAX; ++i) {
            r.a[i] = c1.a[i] & c2.a[i];
        }
        return r;
    }

    /**
     o método insereElemento que insere um novo elemento num conjunto;
     * @param i
     */
    public void insereElemento(int k) {
        a[k] = true;
    }

    /**
     o método deleteElemento que exclui um elemento de um conjunto;
     * @param i
     */
    public void deleteElemento(int m) {
        a[m] = false;
    }

    /**
     e o método toSetString que retorna uma string contendo os elementos do conjunto, 
     ou um - caso a posição daquele elemento seja false.
     * @return
     */
    public String toSetString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= MAX; ++i) {
            if (a[i])
                sb.append(i).append(",");
            else
                sb.append("-").append(",");
        }
        return sb.toString();
    }

    /**
     o 
     método ehIgualTo que determina se dois conjuntos são iguais,   
     * @param c1
     * @param c2
     * @return
     */
    public static boolean ehIgualTo(InteiroSet c1, InteiroSet c2) {
        return Arrays.equals(c1.a, c2.a);
    }
}