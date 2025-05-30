import java.util.Scanner;

 class TemperaturaConversao {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Realiza as conversões
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\nPráticas");
        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        // Fecha o scanner
        scanner.close();
    }
}
