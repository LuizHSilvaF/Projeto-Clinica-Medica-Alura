package med.voll.api.pacientes;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, DadosEndereco endereco) {

}
