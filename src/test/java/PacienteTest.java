import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {
    @Test
    void testeClone() throws CloneNotSupportedException{
        Paciente paciente = new Paciente("1234565", "Paciente 1", "exame geral", 20);

        Paciente pacienteClone = paciente.clone();
        pacienteClone.setCpf("098765");
        pacienteClone.setNome("Paciente Clonado");
        pacienteClone.setExame("Exame clinico");
        pacienteClone.setIdade(23);


        assertEquals("Paciente{cpf='1234565', nome='Paciente 1', exame='exame geral', idade=20}", paciente.toString());
        assertEquals("Paciente{cpf='098765', nome='Paciente Clonado', exame='Exame clinico', idade=23}", pacienteClone.toString());

    }
}
