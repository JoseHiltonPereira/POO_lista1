package exercicio_315;

public class Date {
	private int mes;
	private int dia;
	private int ano;
	
	public Date(int mes, int dia, int ano){
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public void displayDate(int mes, int dia, int ano){
		System.out.println("Date: "+mes+"/"+dia+"/"+ano );
	}
}
