package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Java para iniciantes");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso python");
		curso2.setDescricao("Python para dados");
		curso2.setCargaHoraria(6);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Spring Boot");
		mentoria1.setDescricao("Introdução ao Spring Framework");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("Mentoria Dashboards com Python");
		mentoria2.setDescricao("Análise de dados com Python");
		mentoria2.setData(LocalDate.now());
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Java Developement");
		bootcamp1.setDescricao("Desenvolvimento de aplicações Java");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(mentoria1);
		

		Bootcamp bootcamp2 = new Bootcamp();
		bootcamp2.setNome("Python Full-Stack");
		bootcamp2.setDescricao("Desenvolvimento Python avaçando");
		bootcamp2.getConteudos().add(curso2);
		bootcamp2.getConteudos().add(mentoria2);
		
		Dev dev1 = new Dev();
		dev1.setNome("Victor");
		dev1.inscreverBootcamp(bootcamp1);
		System.out.println("Conteúdos Inscritos Victor:" + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("...Consumindo conteúdo...");
		System.out.println("Conteúdos Inscritos Victor:" + dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Victor:" + dev1.getConteudosConcluidos());
		System.out.println("XP:" + dev1.calcularTotalXp() );
		
		System.out.println("-----------------------------------------------------");
		
		
		Dev dev2 = new Dev();
		dev2.setNome("Ronaldo");
		dev2.inscreverBootcamp(bootcamp2);
		System.out.println("Conteúdos Inscritos Ronaldo:" + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteúdos Inscritos Ronaldo:" + dev2.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Ronaldo:" + dev2.getConteudosConcluidos());
		System.out.println("XP:" + dev2.calcularTotalXp() );
		
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
	}

}
