
package locadora.model;

import java.util.Date;

/**
 *
 * @author ap420es
 */
public class Item {
    private Integer codItem;
    private double preco;
    private String tipo;
    private Date dataLocacao;
    private Date dataDevolucao;
    private Filme filme;
    private Cliente cliente;
}
