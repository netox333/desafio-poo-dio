package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo(" Curso Java");
		curso1.setDescricao(" Descrição: Curso Java");
		curso1.setCargaHoraria(8);
		System.out.println(curso1);

		Curso curso2 = new Curso();
		curso2.setTitulo(" Curso Java Script");
		curso2.setDescricao(" Descrição: Curso Java Script");
		curso2.setCargaHoraria(4);

		System.out.println(curso2);
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java ");
		mentoria.setDescricao("Descrição  mentoria java");
		mentoria.setData(LocalDate.now());
		System.out.println(mentoria);
	}

}
