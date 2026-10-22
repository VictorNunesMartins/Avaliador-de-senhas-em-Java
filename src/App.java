import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        //variaveis
        boolean repetir = true;
        boolean temnumero = false;
        boolean temmaiusculo = false;
        String senhacriada;
        String[] senhasObvias = {"12345678", "senha123", "admin123"};
        

        //programa
        while (repetir) {
            //interação inicial
            System.out.println("Bem vindo ao programa, vamos criar a sua senha! \n Ela deve conter 8 caracteres, pelo menos uma letra maiúscula e um número \n Digite a sua senha: ");
            senhacriada = ler.nextLine();

            //ler tamanho e verificar número
            if(senhacriada.length() >= 8){
                for(int i=0; i<senhacriada.length();i++){
                    if(Character.isDigit(senhacriada.charAt(i))){
                        temnumero = true;
                    }
                    if(Character.isUpperCase(senhacriada.charAt(i))){
                        temmaiusculo = true;
                    }
                }
                if(senhacriada.equals(senhasObvias[0]) || senhacriada.equals(senhasObvias[1]) || senhacriada.equals(senhasObvias[2])){
                    System.out.println("ALERTA: Esta senha é muito comum ou óbvia.");
                }else if(temnumero == false){
                    System.out.println("DICA: Adicione pelo menos um número à sua senha");
                }else if(temmaiusculo == false){
                    System.out.println("Ausência de maiúscula DICA: Adicione pelo menos uma letra maiúscula à sua senha.");
                }else{
                    System.out.println("Aprovação SUCESSO: Sua senha passou nos critérios básicos!");
                    repetir = false;
                }
            }else if (senhacriada.length() < 8 ){
                System.out.print("DICA: A senha deve ter no mínimo 8 caracteres.\n");
            }

        }
        


        ler.close();
    }
}
