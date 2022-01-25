# TDD e Java: Testes automatizados com JUnit - Curso Alura

## Como funcionam os testes automatizados,aprender como instalar, configurar o JUnit, como escrever os testes automatizados, entender 
o conceito de TDD, desenvolvimento guiado por testes,

## CONTEÚDO
- Entenda a importância de escrever testes automatizados em uma aplicação
- Conheça o JUnit, principal biblioteca para testes automatizados em Java
- Aprenda a escrever testes automatizados com JUnit
- Aprenda a utilizar o processo de TDD ao escrever testes automatizados
- Conheça as principais anotações e recursos do JUnit

## Observação

- Testes Manuais

    -  Automatização
    -  Sujeitos a falhas(Fator Humano)
    
- Testes Automatizados

    - Automatização
    - Feedback mais rápido
    - Segurança ao mexer no código
    - Favorece a melhoria no código(refactoring) 
     

- Principais vantagens do uso de testes automatizados:
  - Garantir que o código da aplicação atende corretamente aos requisitos de negócio.(Os testes automatizados ajudam a manter a qualidade da aplicação, pois validam se os requisitos de negócio estão sendo atendidos conforme o esperado.)
  - Facilitar a manutenção do software.(Os testes automatizados ajudam a manter a qualidade da aplicação, pois validam se os requisitos de negócio estão sendo atendidos conforme o esperado.)

## JUnit 

- Biblioteca padrão para escrita de testes automatizados**
- Criado em 1995 por kent Beck e Erich Gamma 
- Biblioteca gratuita open Source [Código fonte- JUnit](https://github.com/junit-team/junit-team.github.io/).
- Foco em testes de unidade(Testes unitários) o coração do JUnit

**Obs:No JUnit existe essa convenção de que o nome da classe é o mesmo nome da classe que você está testando, no caso da nossa classe Calculadora, com o sufixo Test, ficaria:CalculadoraTest sendo assim sabemos que é uma classe de teste. No JUnit cada venário vai virar um método de teste. Uma forma de adicionar o JUnit, e informar para ele o método que quero tstar é fazendo uma anotação @Test e ativá-la, como é uma biblioteca padrão adiciona. 

**Explicando:**
Exemplo, se você passar um valor de delta de 0.01, o JUnit vai lançar um erro se abs(expected - actual) > 0.01.
Não é recomendado, veja se o uso de double é necessário. Muita gente usa essas variáveis sem pensar quando os valores na verdade poderiam ser inteiros como int ou long.
Segundo, para cálculos onde a precisão é importante, pense em usar BigDecimal, que embora seja mais lento não sofre dos problemas de representação binária.


Ex: <br/>
double valorEsperado = 2.5;<br/>
double valorRetornado = metodoQualquer();<br/>
Assert.assertEquals(valorEsperado, valorRetornado);<br/>
<br/>
Nesse exemplo anterior se o valor retornado do método fosse 2.499999999999 o teste falharia, mas ao fazer assim:<br/>
<br/>
Assert.assertEquals(valorEsperado, valorRetornado, 0.1);<br/>
O teste passaria, pois a diferença entre os doubles não superou o delta de 0.1<br/>

