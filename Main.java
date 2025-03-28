public class Main {
    
    public static void main(String [] args){
        Pessoa p1 = new Pessoa();
        p1.nome = "Beatriz";
        p1.idade = 18;
        p1.apresentar();

        ContaBancaria cb = new ContaBancaria();
        cb.setSaldo(10);
        System.out.println(cb.getSaldo());

        Calculadora calc = new Calculadora();
        calc.somar(35, 97);
        int res = calc.multiplicar(5, 6);

    }
}
