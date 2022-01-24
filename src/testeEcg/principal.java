package testeEcg;

public class principal {
    public static void main(String[] args) {
        Servidor servidor = new Servidor(2020100512, "Leonardo Messsias de Lucena Barboza", "TI",
                1296.48, 3400.0);
        servidor.Status();
        servidor.aumentosal();
    }
}





/* CTRL+D=DUPLICAR LINHA
SHIFT+F6 = REFATORAR NOME DA CLASSE
CTRL+SHIFT+/ = COMENTAR BLOCO
CTRL+SHIFT+O = REMOVER IMPORTS NAO ULTILIZADOS
CTRL+ALT+L= INDENTAR O CODIGO
CTRL+Y=REMOVER LINHA
    CTRL+SHIFT+SETA = MOVER A LINHA DE LUGAR

 */
