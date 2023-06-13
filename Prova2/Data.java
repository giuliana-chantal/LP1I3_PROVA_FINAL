import java.util.Scanner;
import java.text.*;
import java.util.*;

/**
 * @author Giuliana Ferreira Chantal
*/

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private Scanner scan = new Scanner(System.in);


    public Data() {
        this.setAno();
        this.setMes();
        this.setDia();
    }

    public Data(int d, int m, int a) {
        this.setAno(a);
        this.setMes(m);
        this.setDia(d);
    }


    public void setDia(int d){
        int qtdDiasMes = getQuantidadeDiasNoMes(this.mes);

        if(d < 1 || d > qtdDiasMes){
            System.out.println("O dia deve ser um valor entre 1 e " + qtdDiasMes);
            return;
        }

        this.dia = d;
    }

    public void setMes(int m){
        if(m < 1 || m > 12){
            System.out.println("O mês deve ser um valor entre 1 e 12");
            return;
        }

        this.mes = m;
    }
    
    public void setAno(int a){
        if(a <= 0){
            System.out.println("O valor do ano deve ser positivo");
            return;
        }

        this.ano = a;
    }


    public void setDia(){
        int d;

        do{
            System.out.print("Entre com o valor do dia: ");
            d = scan.nextInt();

            if(d < 1 || d > getQuantidadeDiasNoMes(this.mes)){
                System.out.println("O dia deve ser um valor entre 1 e " + getQuantidadeDiasNoMes(this.mes));
            }
            
        }while(d < 1 || d > getQuantidadeDiasNoMes(this.mes));

        this.dia = d;
    }

    public void setMes(){
        int m;

        do{
            System.out.print("Entre com o valor do mês: ");
            m = scan.nextInt();

            if(m < 1 || m > 12){
                System.out.println("O mês deve ser um valor entre 1 e 12");
            }
            
        }while(m < 1 || m > 12);

        this.mes = m;
    }

    public void setAno(){
        int a;

        do{
            System.out.print("Entre com o valor do ano: ");
            a = scan.nextInt();

            if(a <= 0){
                System.out.println("O valor do ano deve ser positivo");
            }
            
        }while(a <= 0);

        this.ano = a;
    }


    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }


    public String mostra1(){

        return String.format("%02d", this.dia) + "/" +
            String.format("%02d", this.mes) + "/" +
            String.format("%04d", this.ano);
    }

    public String mostra2(){

        String nomeMes = "";

        if (this.mes == 1) {
            nomeMes = "Janeiro";
        } else if (this.mes == 2) {
            nomeMes = "Fevereiro";
        } else if (this.mes == 3) {
            nomeMes = "Março";
        } else if (this.mes == 4) {
            nomeMes = "Abril";
        } else if (this.mes == 5) {
            nomeMes = "Maio";
        } else if (this.mes == 6) {
            nomeMes = "Junho";
        } else if (this.mes == 7) {
            nomeMes = "Julho";
        } else if (this.mes == 8) {
            nomeMes = "Agosto";
        } else if (this.mes == 9) {
            nomeMes = "Setembro";
        } else if (this.mes == 10) {
            nomeMes = "Outubro";
        } else if (this.mes == 11) {
            nomeMes = "Novembro";
        } else {
            nomeMes = "Dezembro";
        }

        return String.format("%02d", this.dia) + "/" +
            nomeMes + "/" +
            String.format("%04d", this.ano);
    }

    public boolean bissexto(){
        return (this.ano % 400 == 0)
            || ((this.ano % 4 == 0) && (this.ano % 100 != 0));
    }
    
    public int diasTranscorridos(){
        int qtdDias = 0;

        for (int auxMes = 1; auxMes < this.mes; auxMes++) {
            qtdDias += getQuantidadeDiasNoMes(auxMes);
        }

        qtdDias += (this.dia - 1);
        
        return qtdDias;
    }

    public void apresentaDataAtual (){
        DateFormat DFormat = DateFormat.getDateInstance();

        System.out.println("Data atual: " + DFormat.format(new Date()));
    }


    private int getQuantidadeDiasNoMes(int numMes){
        int[] qtdDiasMes = new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(this.bissexto()){
            qtdDiasMes[1] = 29;
        }

        return qtdDiasMes[numMes - 1];
    }
}