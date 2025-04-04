
public class Principia{
    public static void main(String[] args){

        ContaT conta1;
        conta1 = new ContaT(123, "Jamaico de nego" , 50000, 100, 0);

        ContaT conta2;
        conta2 = new ContaT(444, "Gustavo kichupe", 0, 5000, 1000);

        ContaT conta3;
        conta3 = new ContaT(222, "João Preto", 1000, 1000, 0);

        ContaT conta4;
        conta4 = new ContaT(444, "Enzo Despacho", 10, 1000, 0);

        ContaT conta5;
        conta5 = new ContaT(222, "Sarafadão", 80, 30000, 0);

        ContaT conta6;
        conta6 = new ContaT(222, "Leonardo", 700, 1000, 0);






        System.out.println("#########################");
        conta5.mostra();
        System.out.println("#########################");

        conta5.sacar(500);
        System.out.println("_______________");
        conta5.mostra();

        conta5.sacar(500);
        System.out.println("_______________");
        conta5.mostra();

        conta5.sacar(500);
        System.out.println("_______________");
        conta5.mostra();

        conta5.sacar(200);
        System.out.println("_______________");
        conta5.mostra();


        conta5.deposito(100);
        System.out.println("_______________");
        conta5.mostra();


        conta5.deposito(700);
        System.out.println("_______________");
        conta5.mostra();


        conta5.sacar(500);
        System.out.println("_______________");
        conta5.mostra();

        //conta1.mostra();
        System.out.println("_______________");



        //conta2.mostra();

        System.out.println("_______________");

        

  



        //conta2.sacar(1000);
        //conta2.deposito(3000);
        //conta2.tansfere(4000, conta1);

        System.out.println("                                                              ");
        System.out.println("                                                              ");
        System.out.println("                                                              ");
        System.out.println("==============================================================");
        //conta1.mostra();







        System.out.println("_______________");


        //conta2.mostra();
    }

}





