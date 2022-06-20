package demo;

import entities.Pessoa;
import entities.Produto;
import models.PessoaModel;
import models.ProdutoModel;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class AdministrativoApp {

    public static void main(String[] args) {
        ProdutoModel produtoModel = new ProdutoModel();

        Produto p1 = new Produto();
        p1.setNome("TV");
        p1.setPreco(BigDecimal.valueOf(300.0));
        p1.setQuantidade(100);
        p1.setStatus(true);

        // 1) Criando um produto
        produtoModel.create(p1);

        //2) Buscando todos os produtos na base de dados
        List<Produto> produtos = produtoModel.findAll();
        System.out.println("Qtde de produtos encontrados : " + produtos.size());

        // TODO - Testar os demais metódos das classes: ProdutoModel e PessoaModel

        //3) Buscando um produto pelo id
        Produto p2 = produtoModel.findById(1);
        System.out.println("Produto encontrado : " + p2.getNome());

        //4) Atualizando um produto
        p2.setNome("TV LED");
        produtoModel.update(p2);

        //5) Deletando um produto
        produtoModel.delete(p2.getId());

        //6) Criando uma pessoa
        PessoaModel pessoaModel = new PessoaModel();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Samantha");
        pessoa.setEmail("samantha@samantha.com");
        pessoa.setCpf("12312312300");

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(Calendar.YEAR, 1990);
        dataNascimento.set(Calendar.MONTH, Calendar.JANUARY);
        dataNascimento.set(Calendar.DAY_OF_MONTH, 15);
        pessoa.setIdade(32);
        pessoa.setDataNascimento(dataNascimento);

        pessoaModel.create(pessoa);

        //7) Buscando todos as pessoas na base de dados
        List<Pessoa> pessoas = pessoaModel.findAll();
        System.out.println("Qtde de pessoas encontradas : " + pessoas.size());

        //8) Buscando uma pessoa pelo id
        Pessoa pessoa2 = pessoaModel.findById(1);
        System.out.println("Pessoas encontradas : " + pessoa2.getNome());

        //9) Atualizando uma pessoa
        pessoa2.setNome("Bruna");
        pessoaModel.update(pessoa2);

        //10) Deletando uma pessoa
        pessoaModel.delete(pessoa2.getId());
    }
}
