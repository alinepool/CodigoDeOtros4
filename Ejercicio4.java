package com.generation;

import java.util.Scanner; //Añade import Scanner

public class Codigo4 {

  public static void main(String[] args) { // se añade el metodo main
    Scanner sc = new Scanner(System.in); //inicializa con la variable sc para usar Scanner e inicia
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = sc.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //cambia el nombre a jugador 2
    String j2 = sc.nextLine();// estaba de mas la linea Scanner sc = new Scanner();
    
    if (j1.equals(j2)) { //tenia un parentesis de mas y se agrega equals para comparar 
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals ("tijeras")) {// se compara con equals al ser un dato Strign
            g = 1;
          }
          break; //para avitar ciclo infinito
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          }//faltaba llave de cierre de condicion if
          break; //para avitar ciclo infinito
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    
    }
  }
}