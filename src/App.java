import java.util.Scanner;

class list01_atv07{
    public static void main (String [] args) {
        System.out.println("Área do quadrado.");
        System.out.print("Informe um lado do quadrado em metros: ");
        int lado;
        Scanner sc = new Scanner (System.in);
        lado = sc.nextInt();
        sc.close();
        var area = Math.pow(lado, 2);
        var quadrado = (area*2);
        System.out.print("O dobro da àrea do quadrado é "+Math.round(quadrado));
    }
}