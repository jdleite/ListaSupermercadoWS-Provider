package br.com.fiap.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqItem",sequenceName="SEQ_ITEM",
allocationSize=1)
public class ItemTO {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="seqItem")
	private int codigo;
	
	private String nome;
	
	private int quantidade;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
