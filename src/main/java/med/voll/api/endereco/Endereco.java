package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

	private String lougradouro;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	private String cidade;
	private String uf; 
	
	public Endereco(DadosEndereco endereco) {
		this.lougradouro = endereco.logradouro();
		this.bairro = endereco.bairro();
		this.cep = endereco.cep();
		this.numero = endereco.numero();
		this.complemento = endereco.complemento();
		this.cidade = endereco.cidade();
		this.uf = endereco.uf();
	}
}
