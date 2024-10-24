# Projeto de Cadastro de Produtos

Criar um sistema para gerenciar produtos, incluindo produtos alimentícios e de vestuário.

## 📋 Pré-requisitos


- JDK: Versão 11 ou superior do Java Development Kit.
- IDE Eclipse (ou qualquer outra IDE de sua preferência para compilar e executar código Java).

## 🔧 Como instalar o software

1. Baixe e instale o JDK ou OpenJDK.
2. Baixe e instale a IDE Eclipse.
3. Crie um novo projeto Java no Eclipse e copie o código para dentro do projeto.
4. Compile e execute diretamente pela IDE.

## 📌 Versão

Versão 1.0: Implementação inicial com classes para produtos, produtos alimentícios e produtos de vestuário, incluindo métodos para salvar, deletar e atualizar registros em um banco de dados relacional.

## 📝 Descrição do Projeto

Este projeto contém classes para modelar produtos, produtos alimentícios e produtos de vestuário com os seguintes atributos e métodos:

- **Classe Produto:**
  - Atributos: nome, preço de custo, preço de venda.
  - Método: calcularLucro.

- **Classe ProdutoAlimenticio** (derivada de Produto):
  - Atributos: data de validade, informações nutricionais.

- **Classe ProdutoVestuario** (derivada de Produto):
  - Atributos: tamanho, cor, material.

Todas as classes incluem métodos para salvar, deletar e atualizar registros em um banco de dados relacional.
