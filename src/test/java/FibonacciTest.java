import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    private final String SUCESSO = "<<Sucesso>> - ";
    private final String FALHA = "<<Falha>> - ";

    @Nested
    @DisplayName("Passo 1 - Função retornando a constante '0'")
    class v0 {
        @Test
        @DisplayName(SUCESSO + "Neste primeiro caso passamos '0' como parametro.")
        void caso1() {
            assertEquals(0, Fibonacci.v0(0));
        }

        @Test
        @DisplayName(FALHA + "Neste segundo caso passamos '1' como parametro.")
        void caso2() {
            assertEquals(1, Fibonacci.v0(1));
        }
    }

    @Nested
    @DisplayName("Passo 2 - Função retorna '0' se a entrada for '0', caso contrario retorna '1'")
    class v1 {
        @Test
        @DisplayName(SUCESSO + "Percorremos os casos '{{0, 0}, {1, 1}}' e para cada um fazemos a asserção")
        void caso1() {
            int[][] casos = {{0, 0}, {1, 1}};
            for (int[] umCaso : casos) assertEquals(umCaso[1], Fibonacci.v1(umCaso[0]));
        }

        @Test
        @DisplayName(SUCESSO + "Percorremos os casos '{{0, 0}, {1, 1}, {2, 1}}' e para cada um fazemos a asserção")
        void caso2() {
            int[][] casos = {{0, 0}, {1, 1}, {2, 1}};
            for (int[] umCaso : casos) assertEquals(umCaso[1], Fibonacci.v1(umCaso[0]));
        }

        @Test
        @DisplayName(FALHA + "Percorremos os casos '{{0, 0}, {1, 1}, {2, 1}, {3, 2}}' e para cada um fazemos a asserção")
        void caso3() {
            int[][] casos = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] umCaso : casos) assertEquals(umCaso[1], Fibonacci.v1(umCaso[0]));
        }
    }

    @Nested
    @DisplayName("Passo 3 - Função retorna '0' se a entrada for '0', '1' se a entrada for igual ou menor a '2' e '2' se entrada maior que '2'")
    class v2 {
        @Test
        @DisplayName(SUCESSO + "Percorremos os casos '{{0, 0}, {1, 1}, {2, 1}, {3, 2}}' e para cada um fazemos a asserção")
        void caso1() {
            int[][] casos = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] umCaso : casos) assertEquals(umCaso[1], Fibonacci.v2(umCaso[0]));
        }
    }


    @Nested
    @DisplayName("Passo 4 - Função retorna '0' se a entrada for '0', '1' se a entrada for igual ou menor a '2' e '1 + 1' se entrada maior que '2'")
    class v3 {
        @Test
        @DisplayName(SUCESSO + "Percorremos os casos '{{0, 0}, {1, 1}, {2, 1}, {3, 2}}' e para cada um fazemos a asserção")
        void caso1() {
            int[][] casos = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] umCaso : casos) assertEquals(umCaso[1], Fibonacci.v3(umCaso[0]));
        }
    }

    @Nested
    @DisplayName("Passo 5 - Função retorna '0' se a entrada for '0', '1' se a entrada for '1' ou '2', ou fib(n - 1) + 1 se maior que '2'")
    class v4 {
        @Test
        @DisplayName(SUCESSO + "Percorremos os casos '{{0, 0}, {1, 1}, {2, 1}, {3, 2}}' e para cada um fazemos a asserção")
        void caso1() {
            int[][] casos = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] umCaso : casos) assertEquals(umCaso[1], Fibonacci.v4(umCaso[0]));
        }
    }

    @Nested
    @DisplayName("Passo 6 - Função retorna '0' se a entrada for '0', '1' se a entrada for '1' ou '2', ou fib(n - 1) + fib(n - 2) se maior que '2'")
    class v5 {
        @Test
        @DisplayName(SUCESSO + "Percorremos os casos '{{0, 0}, {1, 1}, {2, 1}, {3, 2}}' e para cada um fazemos a asserção")
        void caso1() {
            int[][] casos = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] umCaso : casos) assertEquals(umCaso[1], Fibonacci.v5(umCaso[0]));
        }
    }

    @Nested
    @DisplayName("Passo 6 - Função retorna '0' se a entrada for '0', '1' se a entrada for '1', ou fib(n - 1) + fib(n - 2) se maior que '1'")
    class v6lts {
        @Test
        @DisplayName(SUCESSO + "Percorremos os casos '{{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}}' e para cada um fazemos a asserção")
        void caso1() {
            int[][] casos = {{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}};
            for (int[] umCaso : casos) assertEquals(umCaso[1], Fibonacci.v6lts(umCaso[0]));
        }
    }


}