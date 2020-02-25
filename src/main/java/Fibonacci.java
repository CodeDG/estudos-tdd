class Fibonacci {

    static int v0(int n) {
        return 0;
    }

    static int v1(int n) {
        if (n == 0) return 0;
        return 1;
    }

    static int v2(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        return 1;
    }

    static int v3(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        return 1 + 1;
    }

    static int v4(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        return v4(n - 1) + 1;
    }

    static int v5(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        return v5(n - 1) + v5(n - 2);
    }

    static int v6lts(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return v6lts(n - 1) + v6lts(n - 2);
    }
}
