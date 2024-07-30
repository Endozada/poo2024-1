package br.ufpb.dcx.pedro.artesanato;


/**
 * Sistema para gerenciar itens de artesanato
 *
 *
 */
public interface SistemaFeiraArtesanato {

    /**
     * Cadastra um novo item no sitema.
     * @param item O item a ser adicionado
     * @return true se o item foi cadastrado, ou false caso ele já exista no sistema.
     */
    public boolean cadastraItem(ItemDeArtesanato item);

    /**
     * Pesquisa toodos os itens cuja o nome começa com o nome passado como parêmetro.
     * @param nome O nome a pesquisar
     * @return uma lista contendo os itens cujo nome começa com o parâmetro passado.
     */
    public List<ItemDeArtesanato> pesquisaItensPeloNome(String nome);

    /**
     * Pesquisa os itens cujo o preço é menor ou igual ao valor passado no parâmetro.
     * @param preco valor a pesquisar
     * @return Uma lista contendo itens cujo preço é menor ou igual ao valor do parâmetro.
     */
    public List<ItemDeArtesanato> pesquisarItensAbaixoDoPreco(double preco);

    /**
     * Pesquisa o item cujo código é passado por parâmetro.
     * @param codigo O código do item a pesquisar
     * @return O item encontrado
     * @throws ItemInexistenteException Se não for encontrado nenhum item com o código passado.
     */
    public ItemDeArtesanato pesquisaItemPeloCodigo(String codigo) throws ItemInexistenteException;
}
