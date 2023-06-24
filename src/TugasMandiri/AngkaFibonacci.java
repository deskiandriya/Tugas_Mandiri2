package TugasMandiri;

public class AngkaFibonacci {
    public static void main(String[] args) {
        int limit = 4500;
        int angka1 = 0;
        int angka2 = 1;
        int totalGenap = 0;
        int jumlahGenap = 0;

        System.out.println("Deret Fibonacci dari 10 hingga 4500:");

        while (angka2 <= limit) {
            if (angka2 >= 10) {
                System.out.println(angka2);
                totalGenap++;
                if (angka2 % 2 == 0) {
                    jumlahGenap += angka2;
                }
            }

            int nextNum = angka1 + angka2;
            angka1 = angka2;
            angka2 = nextNum;
        }

        System.out.println("Total bilangan Fibonacci Genap: " + totalGenap);
        System.out.println("Jumlah bilangan Fibonacci Genap: " + jumlahGenap);
    }
}