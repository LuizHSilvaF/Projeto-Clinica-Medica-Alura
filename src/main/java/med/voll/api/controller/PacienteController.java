package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.pacientes.DadosCadastroPaciente;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
		System.out.println(dados);
	}
}
