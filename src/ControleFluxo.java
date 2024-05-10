import java.util.Locale;
import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) throws Exception {
        
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o primeiro parametro");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Informe o segundo parametro");
        int parametroDois =  terminal.nextInt();

        try {

            contar( parametroUm, parametroDois );

        } catch( ParametrosInvalidosException exception ){

            System.err.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    public static void contar( int parametroUm, int parametroDois ) throws ParametrosInvalidosException
    {
        if( parametroUm > parametroDois )
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        System.out.println("A diferença desses dois numeros e de " + ( parametroDois - parametroUm ) );

        for( int i = 1; i <= contagem ; i++ ){

            System.out.println("Imprime " + i );
        }
        
    }


    public static void contarNumerosEntre( int parametroUm, int parametroDois ) throws ParametrosInvalidosException
    {
        if( parametroUm > parametroDois )
            throw new ParametrosInvalidosException();

        System.out.println("A diferença desses dois numeros e de " + ( parametroDois - parametroUm ) );

        for( int i = ( parametroUm + 1 ) ; i < ( parametroDois + 1 ); i++ ){

            System.out.println("Imprime " + i );
        }
        
    }
}

