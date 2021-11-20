import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora_Methods {
	public double num2 = 0, res = 0;
	//Inicializar la etiqueta de resultado como 0
	public String num = "";
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Calculadora_Methods c = new Calculadora_Methods();
		//String ans = sc.next();
		
	}
	
	public Calculadora_Methods() {
		num = "2.";
		System.out.println(num);
		a�adirDigito("5");
		System.out.println(num);
		a�adirDigito(".");
		System.out.println(num);
		a�adirDigito("5");
		System.out.println(num);
	}
	
	public void a�adirDigito(String n) {
		System.out.println(num.contains(".") && n == ".");
		if (num.contains(".") && n == ".") return;
		else num += "" + n;
		//ResultadoLabel.text() = num;
	}
	
	public void Operar(String operaci�n) {
		num2 = Double.parseDouble(num);
		
		switch(operaci�n) {
			case "borrar":
				num = num.substring(0,num.length()-1);
			break;
			case "exp2":
				num = "" + Redondear(num2 * num2);
				break;
			case "exp3":
				num = "" + Redondear(num2 * num2 * num2);
				break;
			case "raiz":
				num = "" + Redondear(Math.sqrt(num2));
				break;
			case "sin":
				num = "" + Redondear(Math.sin(num2));
			break;
			case "cos":
				num = "" + Redondear(Math.cos(num2));
				break;
			case "tan":
				num = "" + Redondear(Math.tan(num2));
				break;
			case "1/x":
				if (num2 == 0) num2 = 1;
				num = "" + Redondear(1/num2);
				break;
		}
	}
	
	public double Redondear(double n) {
		n *= 100000;
		n = Math.round(n);
		return (n / 100000);
	}
	
	public void Calcular(String operaci�n) {
		num2 = Double.parseDouble(num);
		
		switch(operaci�n) {
			case "+":
				res += num2;
				break;
			case "-":
				res -= num2;
				break;
			case "*":
				res *= num2;
				break;
			case "/":
				res /= num2;
				break;
			case "^":
				for (int i = 0; i < num2; i++)
					res *= res;
				if (num2 == 0) res = 1;
				break;
		}
		
		//Operaci�nLabel.text() = res + operaci�n;
		//ResultadoLabel.text() = res;
		
		num = "" + res;
		if (operaci�n.equals("=")) res = 0;
	}
}
