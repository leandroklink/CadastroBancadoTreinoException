# Sistema de Conta Bancária com Tratamento de Exceções

## Descrição

Projeto simples em Java desenvolvido para praticar tratamento de
exceções, incluindo:

-   throw
-   throws
-   try
-   catch
-   finally
-   Exceções checked e unchecked
-   Criação de exceção personalizada

## Regras Implementadas

No método sacar(double valor):

-   Se o valor for menor ou igual a zero, é lançada uma
    RuntimeException.
-   Se o valor for maior que o saldo disponível, é lançada uma
    SaldoInsuficienteException.
-   Caso o valor seja válido, o saldo é atualizado.

## Exceção Personalizada

A classe SaldoInsuficienteException estende Exception, sendo uma exceção
checked. Isso obriga o tratamento com try/catch ou a declaração com
throws.

## Fluxo no Main

No método main:

-   São realizadas chamadas ao método sacar.
-   As exceções são tratadas com blocos catch.
-   O bloco finally é utilizado para executar código independentemente
    de erro.

## Objetivo

Consolidar os conceitos básicos de tratamento de exceções em Java.
