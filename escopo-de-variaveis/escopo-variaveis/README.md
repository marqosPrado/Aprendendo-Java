<h1>Escopo de Variáveis</h1>

<h2>O que é:</h2>

<p>O escopo de uma variável se refere à parte do programa onde a variável é visível e acessível. É o contexto em que uma variável pode ser usada e referenciada dentro do código. O escopo determina a disponibilidade e a vida útil de uma variável, ou seja, por quanto tempo ela existe e em que partes do programa ela pode ser utilizada.</p>

<h3>Exemplo:</h3>

```java
void exemplo() {
    int x = 10; // Escopo começa aqui
    System.out.println(x); // Acesso permitido
    if (x > 5) {
        int y = 20; // Escopo começa aqui
        System.out.println(y); // Acesso permitido
    } // Escopo de y termina aqui
    System.out.println(y); // Erro de compilação - variável y não é visível aqui
} // Escopo de x termina aqui

```