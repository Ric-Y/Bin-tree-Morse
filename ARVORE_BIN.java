import java.util.Scanner;

class Nodo {
    char caractere;
    Nodo filho_esquerdo;
    Nodo filho_direito;

    Nodo() {
        caractere = '\0';
        filho_esquerdo = null;
        filho_direito = null;
    }
}

class arvoreBinariaMorse {
    Nodo raiz;
    void inicializar() {
        raiz = new Nodo();
    }

    void inserir(String codigo_morse, char caractere) {
        Nodo no_atual = raiz;

        for (int i = 0; i < codigo_morse.length(); i++) {
            char simbolo = codigo_morse.charAt(i);
            if (simbolo == '.') {
                if (no_atual.filho_esquerdo == null) {
                    no_atual.filho_esquerdo = new Nodo();
                }
                no_atual = no_atual.filho_esquerdo;

            } else if (simbolo == '-') {
                if (no_atual.filho_direito == null) {
                    no_atual.filho_direito = new Nodo();
                }
                no_atual = no_atual.filho_direito;
            }
        }

        no_atual.caractere = caractere;
    }

    char buscar(String codigo_morse) {
        Nodo no_atual = raiz;

        for (int i = 0; i < codigo_morse.length(); i++) {
            char simbolo = codigo_morse.charAt(i);

            if (simbolo == '.') {
                no_atual = no_atual.filho_esquerdo;
            } else if (simbolo == '-') {
                no_atual = no_atual.filho_direito;
            } else if (simbolo == ' ') {
                System.out.print(no_atual.caractere);
                no_atual = raiz;
            }

            if (no_atual == null) {
                return '\0';
            }
        }

        return no_atual.caractere;
    }
}

// --------------------------------------------------------------------------------

public class ARVORE_BIN {
    public static void main(String[] args) {
        arvoreBinariaMorse arvore = new arvoreBinariaMorse();
        arvore.inicializar();
        inserirTudo.adicionarTudo(arvore);

        System.out.println(arvore.buscar(".... ...-- .-.. .-.. -----"));

        Scanner teclado = new Scanner(System.in);
        while (true){
            System.out.println("Digite algo:");
            String codigoMorse = teclado.nextLine();
            if (codigoMorse.equalsIgnoreCase("SAIR")){
                break;
            }
            else {
                System.out.print(arvore.buscar(codigoMorse));
                System.out.println("\0");
            }
        }
        teclado.close();
    }
}

// --------------------------------------------------------------------------------

class inserirTudo {
    static void adicionarTudo(arvoreBinariaMorse arvore) {
        arvore.inserir(".-", 'A');
        arvore.inserir("-...", 'B');
        arvore.inserir("-.-.", 'C');
        arvore.inserir("-..", 'D');
        arvore.inserir(".", 'E');
        arvore.inserir("..-.", 'F');
        arvore.inserir("--.", 'G');
        arvore.inserir("....", 'H');
        arvore.inserir("..", 'I');
        arvore.inserir(".---", 'J');
        arvore.inserir("-.-", 'K');
        arvore.inserir(".-..", 'L');
        arvore.inserir("--", 'M');
        arvore.inserir("-.", 'N');
        arvore.inserir("---", 'O');
        arvore.inserir(".--.", 'P');
        arvore.inserir("--.-", 'Q');
        arvore.inserir(".-.", 'R');
        arvore.inserir("...", 'S');
        arvore.inserir("-", 'T');
        arvore.inserir("..-", 'U');
        arvore.inserir("...-", 'V');
        arvore.inserir(".--", 'W');
        arvore.inserir("-..-", 'X');
        arvore.inserir("-.--", 'Y');
        arvore.inserir("--..", 'Z');

        arvore.inserir("-----", '0');
        arvore.inserir(".----", '1');
        arvore.inserir("..---", '2');
        arvore.inserir("...--", '3');
        arvore.inserir("....-", '4');
        arvore.inserir(".....", '5');
        arvore.inserir("-....", '6');
        arvore.inserir("--...", '7');
        arvore.inserir("---..", '8');
        arvore.inserir("----.", '9');
    }
}