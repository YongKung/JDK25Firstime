void main() {
    IO.println("Findmax3");

    int a = 1005;
    int b = 555;
    int c = 1200;

    int max;

    if (a > b) {
        max = a;
    } else {
        max = b;
    }

    if (max < c) {
        max = c;
    }

    System.out.println("Max : " + max);
}
