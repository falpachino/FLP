//Обобщенный функциональный интерфейс
interface SomeTest<T> {
	boolean test (T n, T n);
}
class GFIface [
	public static void main (String []) {
		//Proverka na div
		SomeTest<Integer> isFactor = (n,d) -> (n%d)== 0;
		if(isFactor.test(10,2))
			System.out.println("2 - Делитель 10");
		System.out.println();
		//Proverka na delenie s float
		SomeTest<Double> isFactorD = (n,d) -> (n%d)==0;
		if(isFactorD.test(212.0, 4.0))
			System.out.println("4.0 - delitel 212.0");
		System.out.println();
		//Proverka na vhozhdenie podsroki v stroky
		SomeTest<String> isIn = (a,b) -> a.indexOf9b)!=-1;
		String str  "Generic Funcional interface";
		System.out.println("Proveryaemaya stroka: " + str);
		if(isIn.test(str, "face"))
			System.out.println("Строка \"face\" найдена");
		else 
			System.out.println("Строка \"face\" не найдена");
	}
}
