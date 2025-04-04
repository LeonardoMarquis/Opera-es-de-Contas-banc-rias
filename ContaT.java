
public class ContaT {
    int numero;
    String nome;            // nome do dono da conta
    double saldo;
    double limite;
    double divida;


    public ContaT(int i, String str, double s, double l, double div) {
       this.numero = i;
       this.nome = str;
       this.saldo = s;
       this.limite = l;
       this.divida = div;

    }





    
    // criar os metodos/funcoes.       um de saque e um de deposito.
    // o this é simplesmente para efeito de sintaxe, é um pegador
    public boolean sacar(double valor){

        if (this.saldo + this.limite >= valor) {        // se o valor a sacar for maior que o saldo e o limite juntos, é possivel sacar
            this.saldo -= valor;


            if (this.saldo < 0){

                if (this.divida> 0){

                    this.limite += this.saldo;
                    this.divida = this.divida - this.saldo;
                    this.saldo = 0;

                }





                else{
                    this.divida = this.saldo * -1;
                    this.limite -= valor;
                    this.saldo = 0;
                    System.out.println("endividou!");
                }








            }


        

            return true;
        }   
        
        else
        System.out.println("SALDO E LIMITE NÃO DEIXAM SACAR ISSO TUDO");
            return false;

    }



    public void deposito(double valor){
        double limite_teto = this.limite + this.divida;

        if (this.divida == 0) {
            this.saldo += valor;
        }

        else if (valor > this.divida){

            this.limite = this.limite + valor;
            this.saldo = this.limite - limite_teto;

            this.limite = this.limite - this.saldo;
            this.divida = 0;
        }

        else{
            this.limite = this.limite  + valor;
            this.divida = this.divida - valor;
        }

    }





    public String getNome(){                    // saber o nome da conta, do dono no caso
        return this.nome;
    }



    public boolean tansfere(double valor, ContaT ContaDestino){

        if (this.saldo + this.limite >= valor){
            this.sacar(valor);
            ContaDestino.deposito(valor);
            return true;
        }
        else{
            System.out.println("====================================="); 
            System.out.println("====================================="); 
            System.out.println("LIMITE INSUFICIENTE");   
            System.out.println("====================================="); 
            System.out.println("====================================="); 
            return false;
        }


        //this.sacar(valor);                                          // uma operação enre dois objetos da mesma classe,
        //ContaDestino.deposito(valor);                           // saca de uma o valor e deposita na outra.
                                           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // mas o valro que se perde em um nao é trasnportado de fato para o
                                                                // outro, do jeito que está feito nao é modo real de banco de fato
                                                                // so fez coordenado, faz sumir o valor em uma conta e faz aparecer do nada
                                                                // o mesmo valor na outra conta


    }






    public void mostra(){
        System.out.println("Nome :" + this.nome);
        System.out.println("Númro da Conta :" + this.numero);
        System.out.println("Limite :" + this.limite);
        System.out.println("Saldo :" + this.saldo); /// this.autor, na hora de mostrar, iria mostrar o endereço de memoria do 
                                                    // do objeto autor
        System.out.println("Dívida :" + this.divida);
                                                    // colocou essa funcao para conseguir ver o nome do objeto autor recebido na
                                                    // criação do objeto
  
      }












}

