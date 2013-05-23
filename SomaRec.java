import java.util.ArrayList;
import java.util.List;


public class SomaRec {
	public static int somaRec(int[] numeros, int pos){
		if (pos > 0) return numeros[pos-1]+ somaRec(numeros, pos-1);
		return 0;
		}
	
	
	public static void main(String[] args) {
		int[] numeros = new int[args.length];
		for(int i =0;i<args.length;i++)	numeros[i] = Integer.parseInt(args[i]);
		System.out.println("A soma de todos os argumentos é: "+ somaRec(numeros, numeros.length));
	}
}
