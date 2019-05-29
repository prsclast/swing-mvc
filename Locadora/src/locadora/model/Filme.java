
package locadora.model;

import java.util.ArrayList;

/**
 *
 * @author ap420es
 */
public class Filme {
    private Integer codFilme;
    private String titulo;
    private String genero;
    private String sinopse;
    private Integer duracao;
    private ArrayList<Item> itens = new ArrayList<Item>();
    private ArrayList<Ator> atores = new ArrayList<Ator>();
}
