import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

/**
 * @author Giuliana Ferreira Chantal
*/

public class Prova2 {
    public static void main(String[] args){
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 12, 6, 2023, "João", "Dr. Silva");
        
        System.out.println("Propriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        

        ConsultaAgendada p2 = new ConsultaAgendada();
        
	    StringBuilder resultado = new StringBuilder();
	    
	    resultado.append("Propriedades de p1:\n");
	    resultado.append("Data: ").append(p1.getData()).append("\n");
	    resultado.append("Hora: ").append(p1.getHora()).append("\n");
	    resultado.append("Nome do Paciente: ").append(p1.getNomePaciente()).append("\n");
	    resultado.append("Nome do Médico: ").append(p1.getNomeMedico()).append("\n");
	
	    resultado.append("\nPropriedades de p2:\n");
	    resultado.append("Data: ").append(p2.getData()).append("\n");
	    resultado.append("Hora: ").append(p2.getHora()).append("\n");
	    resultado.append("Nome do Paciente: ").append(p2.getNomePaciente()).append("\n");
	    resultado.append("Nome do Médico: ").append(p2.getNomeMedico()).append("\n");
	
	    p1.setData();
	    p1.setHora();
	    p1.setNomePaciente();
	    p1.setNomeMedico();
	
	    resultado.append("\nPropriedades de p1 (após alterações):\n");
	    resultado.append("Data: ").append(p1.getData()).append("\n");
	    resultado.append("Hora: ").append(p1.getHora()).append("\n");
	    resultado.append("Nome do Paciente: ").append(p1.getNomePaciente()).append("\n");
	    resultado.append("Nome do Médico: ").append(p1.getNomeMedico()).append("\n");
	
	    resultado.append("\nQuantidade de consultas: ").append(p1.getAmostra()).append("\n");
	
	    String nomeArquivo = "resultadoEx03.txt";
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
	        writer.write(resultado.toString());
	        System.out.println("Resultado salvo no arquivo " + nomeArquivo + " com sucesso!");
	    } catch (IOException e) {
	        System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
	    }
    }
}