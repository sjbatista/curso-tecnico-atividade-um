package com.atividade.sesisenai.coletarexibir;


import java.util.Scanner;

public class ClasseInicial {
public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int idade;
	String cpf,rg,nome,telefone,endereco;
	char sexo;
	
	System.out.println("Digite seu nome completo:\n");
	nome = ler.nextLine();
	System.out.println("Digite seu cpf:\n");
	cpf = ler.next();
	System.out.println("Digite seu RG:\n");
	rg = ler.next();
	System.out.println("Digite seu sexo:(m/f)\n");
	sexo = ler.next().toCharArray()[0];
	System.out.println("Digite sua idade:\n");
	idade = ler.nextInt();
	System.out.println("Digite seu Telefone:\n");
	telefone = ler.next();
	System.out.println("Digite seu Endereço:\n");
	endereco = ler.next();
	ler.close();
	System.out.println("------------");
	
	System.out.println("Suas informações:\n");
	System.out.println(nome);
	System.out.println("\nRG: "+rg+" Telefone: "+telefone+"\nSexo: "+sexo+" Idade: "+idade+"\n");
	System.out.println("CPF:"+cpf+" Endereço: "+endereco);
}

}
