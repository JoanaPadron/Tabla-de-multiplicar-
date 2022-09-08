import java.util.Scanner;
class tablas{
    public static void main(String []args){
        int opc=0;
        do{
            Scanner numero = new Scanner(System.in);
            System.out.println("Por favor teclee el numero que desee entre el 1 y 10: ");
            int num = numero.nextInt();
            if(num>=1 && num<=10){       
                for(int i=1;i<=10;i++){
                    int res = i*num;
                    System.out.println(num + "X" + i + "=" + res);
                }
                System.out.println("¿Desea volver y teclear un nuevo digito? (1. SI / 2. NO");
                opc = numero.nextInt();
            }
            else{
                System.out.println("NUMERO INTRODUCIDO INVALIDO, POR FAVOR TECLEE UN DIGITO QUE SE ENCUENTRE ENTRE EL 1 Y 10");
            }
        }while(opc==1);
    }
}
