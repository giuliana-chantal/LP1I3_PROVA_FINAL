import java.util.Scanner;

/**
 * @author Giuliana Ferreira Chantal
*/

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;

    public ConsultaAgendada() {
    	 this.hora = new Hora();
         this.data = new Data();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

    public void setData(int dia, int mes, int ano) {
        this.data.setDia(dia);
        this.data.setMes(mes);
        this.data.setAno(ano);
    }

    public void setData() {
        this.data.setDia();
        this.data.setMes();
        this.data.setAno();
    }

    public void setHora(int hora, int minuto, int segundo) {
        this.hora.setHor(hora);
        this.hora.setMin(minuto);
        this.hora.setSeg(segundo);
    }

    public void setHora() {
        this.hora.setHor();
        this.hora.setMin();
        this.hora.setSeg();
    }

    public void setNomePaciente(String nome) {
        this.nomePaciente = nome;
    }

    public void setNomePaciente() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        String nome = scan.nextLine();
        this.nomePaciente = nome;
    }

    public void setNomeMedico(String nome) {
        this.nomeMedico = nome;
    }

    public void setNomeMedico() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do médico: ");
        String nome = scan.nextLine();
        this.nomeMedico = nome;
    }

    public int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return this.data.mostra1();
    }

    public String getHora() {
        return this.hora.getHora1();
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }
}
