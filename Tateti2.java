
package tateti;

import java.util.Scanner;
import java.util.Random;

public class Tateti {

    
    public static void main(String[] args) {
     //Inicia un nuevo scanner y un nuevo random
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        //Arreglo que representa los casilleros
        int casilleros [] = new int [9];

        //Variables que guardan quien gano, la iteracion del while y la seleccion de posicion de el usuario
        int gano;
        int iteracion=0;
        int seleccion;
        int suitch = 0;
        //Loop prncipal
        while(true){
                //Si el urno es par significa que es el turno de x
                if ((iteracion % 2)==0){
                        System.out.print("Jugador x seleccione la casilla a colocar su ficha: ");
                        //Pide seleccion de casilla a el usuairo
                        seleccion = sc.nextInt();

                        //Chequea si la casilla no esta ya utilizada
                        if (casilleros[seleccion-1] == 1 || casilleros[seleccion-1] == 2){
                                System.out.println("Posicion ya usada, x hace trampa, o gana");
                                System.exit(0);
                        }
                        //Se asigna el casillero a x
                        casilleros[seleccion-1] = 1;
                //Esta parte es identica a la anerior, pero ls x son o y viceversa			
                } else if ((iteracion % 2)!=0){
                        System.out.print("Jugador o seleccione la casilla a colocar su ficha: ");
                        seleccion = sc.nextInt();
                        if (casilleros[seleccion-1] == 1 || casilleros[seleccion-1] == 2){
                                System.out.println("Posicion ya usada, o hace trampa, x gana");
                                System.exit(0);
                        }
                        casilleros[seleccion-1] = 2;
                }
                //Vagancia de codigo por favor ignorar (Chequea quien gana)
                switch(casilleros[suitch]){
                    case 0: case 1: case 2:
                        if (casilleros[0]==1 && casilleros[1]==1 && casilleros[2]==1){
                            System.out.println("Gana x");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        } else if (casilleros[0]==2 && casilleros[1]==2 && casilleros[2]==2){
                            System.out.println("Gana o");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        }
                    case 3: case 4: case 5:
                        if (casilleros[3]==1 && casilleros[4]==1 && casilleros[5]==1){
                            System.out.println("Gana x");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        } else if (casilleros[3]==2 && casilleros[4]==2 && casilleros[5]==2){
                            System.out.println("Gana o");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        }
                    case 6: case 7: case 8:
                        if (casilleros[6]==1 && casilleros[7]==1 && casilleros[8]==1){
                            System.out.println("Gana x");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        } else if (casilleros[6]==2 && casilleros[7]==2 && casilleros[8]==2){
                            System.out.println("Gana o");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        }
                }
                switch(casilleros[suitch]){
                    case 1: case 4: case 7:
                        if (casilleros[0]==1 && casilleros[3]==1 && casilleros[6]==1){
                            System.out.println("Gana x");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        } else if (casilleros[0]==2 && casilleros[3]==2 && casilleros[6]==2){
                            System.out.println("Gana o");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        }
                    case 2: case 5: case 8:
                        if (casilleros[1]==1 && casilleros[4]==1 && casilleros[7]==1){
                            System.out.println("Gana x");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        } else if (casilleros[2]==2 && casilleros[5]==2 && casilleros[8]==2){
                            System.out.println("Gana o");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        }
                    case 3: case 6: case 9:
                        if (casilleros[2]==1 && casilleros[5]==1 && casilleros[8]==1){
                            System.out.println("Gana x");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        } else if (casilleros[2]==2 && casilleros[5]==2 && casilleros[8]==2){
                            System.out.println("Gana o");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        }
                }
                switch(casilleros[suitch]){
                    case 1: case 5: case 9:
                        if (casilleros[0]==1 && casilleros[4]==1 && casilleros[8]==1){
                            System.out.println("Gana x");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        } else if (casilleros[0]==2 && casilleros[4]==2 && casilleros[8]==2){
                            System.out.println("Gana o");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        }
                }
                switch(casilleros[suitch]){
                    case 3: case 5: case 7:
                        if (casilleros[2]==1 && casilleros[4]==1 && casilleros[6]==1){
                            System.out.println("Gana x");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        } else if (casilleros[2]==2 && casilleros[4]==2 && casilleros[6]==2){
                            System.out.println("Gana o");
                            System.out.println("");
                            System.out.println("╔=╦=╦=╗");
                            System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                            System.out.println("╠=╬=╬=╣" );
                            System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                            System.out.println("╠=╬=╬=╣");
                            System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                            System.out.println("╚=╩=╩=╝");
                            System.exit(0);
                        }
                }
                
                //Muestra la tabla
                System.out.println("");
                System.out.println("╔=╦=╦=╗");
                System.out.println("║"+casilleros[0]+"║"+casilleros[1]+"║"+casilleros[2]+"║");
                System.out.println("╠=╬=╬=╣" );
                System.out.println("║"+casilleros[3]+"║"+casilleros[4]+"║"+casilleros[5]+"║");
                System.out.println("╠=╬=╬=╣");
                System.out.println("║"+casilleros[6]+"║"+casilleros[7]+"║"+casilleros[8]+"║");
                System.out.println("╚=╩=╩=╝");

                if (iteracion==9){
                        System.exit(0);
                }
                iteracion++;
        }
    
    }
    
}

