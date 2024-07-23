package br.ufpb.dcx.pedro.artesanato;

import java.util.*;

public class SistemaFeiraArtesanatoRioTinto implements SistemaFeiraArtesanato{
    private Map<String, ItemDeArtesanato> ItensDeArtesanato;

    public SitemaFeiraDeArtesanato(){
        this.ItensDeArtesanato = new HashMap<>();
    }

    @Override
    public boolean cadastraItem(ItemDeArtesanato item){
        if(this.ItensDeArtesanato.containsKey(item.getCodigo())){
            return false;
        } else {
            this.ItensDeArtesanato.put(item.getCodigo(), item);
            return true;
        }
    }

    @Override
    public List<ItemDeArtesanato> pesquisaItensPeloNome(String nome){
        List<ItemDeArtesanato> itensPesquisados = new LinkedList<>();
        for (ItemDeArtesanato item: this.ItensDeArtesanato.values()){
            if(item.getNome().startsWith(nome)){
                itensPesquisados.add(item);
            }
        }
        Collections.sort(itensPesquisados);
        return itensPesquisados;
    }

    @Override
    public List<ItemDeArtesanato> pesquisarItensAbaixoDoPreco(double preco){
        List<ItemDeArtesanato> itensAbaixoDoPreco = new LinkedList<>();
        for (ItemDeArtesanato item: this.ItensDeArtesanato.values()){
            if(item.getPreco() <= preco){
                itensAbaixoDoPreco.add(item);
            }
        }
        Collections.sort(itensAbaixoDoPreco);
        return itensAbaixoDoPreco;

    }

    @Override
    public ItemDeArtesanato pesquisaItemPeloCodigo(String codigo) throws ItemInexistenteException{
        ItemDeArtesanato item = this.ItensDeArtesanato.get(codigo);
        if(item == null){
            throw new ItemInexistenteException("Não existe item com o código: "+ codigo);
        } else{
            return item;
        }
    }
}
