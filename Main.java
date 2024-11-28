
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tenis tenis = new Tenis("Nike", "Air Max", "Preto", 42, "Corrida", "Futebol");
        Sandalia sandalia = new Sandalia("Havaianas", "Top", "Azul", 40, "Chinelo", "Borracha");
        Calcado calcado1 = new Calcado("Adidas", "Superstar", "Branco", 41);

        ArrayList<Calcado> calcados = new ArrayList<Calcado>();
        calcados.add(tenis); // inserindo um tenis na lista de calcados como calcado
        calcados.add(sandalia); // inserindo uma sandalia na lista de calcados como calcado
        calcados.add(calcado1);

        // Salvar os calcados em um arquivo
        escritaDeArquivo("calcados.txt", calcados);

        // Ler os calcados de um arquivo
        ArrayList<Calcado> calcadosLidos = leituraDeArquivo("calcados.txt");

        for (Calcado calcado: calcadosLidos) {

            System.out.println("Marca: " + calcado.getMarca());
            System.out.println("Modelo: " + calcado.getModelo());
            System.out.println("Cor: " + calcado.getCor());
            System.out.println("Tamanho: " + calcado.getTamanho());
            if (calcado instanceof Tenis) {
                Tenis t = (Tenis) calcado; // casting de calcado para tenis do polimorfismo
                System.out.println("Tipo: " + t.getTipo());
                System.out.println("Esporte: " + t.getEsporte());
                System.out.println("Tênis") ;
            } else if (calcado instanceof Sandalia) {
                Sandalia s = (Sandalia) calcado; // casting de calcado para sandalia do polimorfismo
                System.out.println("Tipo: " + s.getTipo());
                System.out.println("Material: " + s.getMaterial());
                System.out.println("Sandália") ;
            } else if (calcado instanceof Calcado) {
                System.out.println("Calçado");
            }
            System.out.println();
        }
    }

    public static void escritaDeArquivo(String nomeArquivo, ArrayList<Calcado> calcados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Calcado calcado: calcados) {
                writer.write(calcado.toString());
                writer.newLine();
            }
            System.out.println("Calçados salvos com sucesso no arquivo " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static ArrayList<Calcado> leituraDeArquivo(String nomeArquivo) {
        ArrayList<Calcado> calcados = new ArrayList<Calcado>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String tipo = linha;
                String marca = reader.readLine();
                String modelo = reader.readLine();
                String cor = reader.readLine();
                int tamanho = Integer.parseInt(reader.readLine());
                if (tipo.equals("tenis")) {
                    String tipoTenis = reader.readLine();
                    String esporte = reader.readLine();
                    calcados.add(new Tenis(marca, modelo, cor, tamanho, tipoTenis, esporte));
                } else if (tipo.equals("sandalia")) {
                    String tipoSandalia = reader.readLine();
                    String material = reader.readLine();
                    calcados.add(new Sandalia(marca, modelo, cor, tamanho, tipoSandalia, material));
                } else if (tipo.equals("calcado")) {
                    calcados.add(new Calcado(marca, modelo, cor, tamanho));
                }
                
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return calcados;
    }
}