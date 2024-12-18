package modelo.umpramuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date date;
	
	//muitos pedidos para uma lista de item
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)//valor padrão para toMany fetch
	private List<ItemPedido> itens;

	public Pedido() {
		this(new Date());
	
	}
		
	public Pedido(Date date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
}
