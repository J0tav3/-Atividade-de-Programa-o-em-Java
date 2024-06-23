import java.util.Scanner;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o valor da resistência %d: ", i + 1);
            resistencias[i] = scanner.nextDouble();
        }

        double resistenciaEquivalente = 0;
        double maiorResistencia = resistencias[0];
        double menorResistencia = resistencias[0];

        for (double resistencia : resistencias) {
            resistenciaEquivalente += resistencia;
            if (resistencia > maiorResistencia) {
                maiorResistencia = resistencia;
            }
            if (resistencia < menorResistencia) {
                menorResistencia = resistencia;
            }
        }

        System.out.printf("Resistência equivalente: %.2f ohms\n", resistenciaEquivalente);
        System.out.printf("Maior resistência: %.2f ohms\n", maiorResistencia);
        System.out.printf("Menor resistência: %.2f ohms\n", menorResistencia);

        scanner.close();
    }
}
