package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListPalabras 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> aLPalabras = new ArrayList<String>();
		System.out.println("Introduce palabras separadas por un espacio: ");
		String[] palabras = sc.nextLine().split(" ");
		for (String palabra: palabras) 
		{
			aLPalabras.add(palabra);
		}
		Collections.sort(aLPalabras);
		Iterator<String> iterator = aLPalabras.iterator();
		System.out.println("Las palabras introducidas y ordenadas alfabéticamente han sido: ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		Collections.shuffle(aLPalabras);
		iterator = aLPalabras.iterator();
		System.out.println("\nLas palabras introducidas y revueltas han sido: ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		System.out.println("\nIntroduce una palabra a introducir en la posición 0: ");
		String palabra = sc.nextLine();
		aLPalabras.add(0, palabra);
		iterator = aLPalabras.iterator();
		System.out.println("Las palabras introducidas después de la inserción: ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		System.out.println("\nIntroduce una palabra a eliminar: ");
		palabra = sc.nextLine();
		sc.close();
		if(aLPalabras.remove(palabra))
			System.out.println("Palabra eliminada.");
		iterator = aLPalabras.iterator();
		System.out.println("Las palabras introducidas después de la eliminación: ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		aLPalabras.remove(aLPalabras.size() - 1);
		iterator = aLPalabras.iterator();
		System.out.println("\nLas palabras introducidas después de eliminar la última palabra: ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		Collections.sort(aLPalabras);
		System.out.println("\nLa primera palabra por orden alfabético es " + aLPalabras.get(0));
		System.out.println("La última palabra por orden alfabético es " + aLPalabras.get(aLPalabras.size() - 1));
	}

}
