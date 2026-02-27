package cap2.ejercicios;

public class DamasConsola {
    public static void main(String[] args) {
        char[][] tablero = new char[8][8];
        // Inicializar tablero con casillas vacías '.', rojas 'r', negras 'n'
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    if (i < 3) tablero[i][j] = 'n'; // Fichas Negras
                    else if (i > 4) tablero[i][j] = 'r'; // Fichas Rojas
                    else tablero[i][j] = '.'; // Vacío
                } else {
                    tablero[i][j] = ' '; // Casilla no jugable
                }
            }
        }
        imprimirTablero(tablero);
    }

    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}