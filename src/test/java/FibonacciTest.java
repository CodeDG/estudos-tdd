import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Nested
    class v0 {
        @Test
        void case1() {
            assertEquals(0, Fibonacci.v0(0));
        }

        @Test
        void case2() {
            assertEquals(1, Fibonacci.v0(1));
        }
    }

    @Nested
    class v1 {
        @Test
        void case1() {
            int[][] cases = {{0, 0}, {1, 1}};
            for (int[] aCase : cases) assertEquals(aCase[1], Fibonacci.v1(aCase[0]));
        }

        @Test
        void case2() {
            int[][] cases = {{0, 0}, {1, 1}, {2, 1}};
            for (int[] aCase : cases) assertEquals(aCase[1], Fibonacci.v1(aCase[0]));
        }

        @Test
        void case3() {
            int[][] cases = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] aCase : cases) assertEquals(aCase[1], Fibonacci.v1(aCase[0]));
        }
    }

    @Nested
    class v2 {
        @Test
        void case1() {
            int[][] cases = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] aCase : cases) assertEquals(aCase[1], Fibonacci.v2(aCase[0]));
        }
    }

    @Nested
    class v3 {
        @Test
        void case1() {
            int[][] cases = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] aCase : cases) assertEquals(aCase[1], Fibonacci.v3(aCase[0]));
        }
    }

    @Nested
    class v4 {
        @Test
        void case1() {
            int[][] cases = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] aCase : cases) assertEquals(aCase[1], Fibonacci.v4(aCase[0]));
        }
    }

    @Nested
    class v5 {
        @Test
        void case1() {
            int[][] cases = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
            for (int[] aCase : cases) assertEquals(aCase[1], Fibonacci.v5(aCase[0]));
        }
    }

    @Nested
    class v6lts {
        @Test
        void case1() {
            int[][] cases = {{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}};
            for (int[] aCase : cases) assertEquals(aCase[1], Fibonacci.v6lts(aCase[0]));
        }
    }


}