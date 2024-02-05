package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       String name, lastName;
       boolean tipoCliente;
       Integer cantidad;
       Double totalCompra, subTotal, descuento=0.0;
       Scanner lea=new Scanner(System.in);

        System.out.println("***** MODA EXPRESS *****");
        System.out.println("Cual es tu nombre: ");
        name = lea.nextLine();
        System.out.println("Cual es tu apellido: ");
        lastName = lea.nextLine();
        System.out.println("Eres cliente VIP: ");
        tipoCliente = lea.nextBoolean();
        System.out.println("Cuantos articulos deseas comprar: ");
        cantidad = lea.nextInt();
        System.out.println("Valor bruto de la compra: ");
        subTotal = lea.nextDouble();
        lea.nextLine();
        
        if (tipoCliente == true){
            if(cantidad <=3){
                descuento=subTotal*0.1;
            } else if (cantidad >=4 && cantidad <=6) {
                descuento=subTotal*0.15;
            } else if (cantidad >6) {
                descuento=subTotal*0.2;
            }
        }else{
            if(cantidad <=3){
                descuento=subTotal*0.5;
            } else if (cantidad >=4 && cantidad <=6) {
                descuento=subTotal*0.1;
            } else if (cantidad >6) {
                descuento=subTotal*0.015;
            }
        }
        totalCompra = subTotal - descuento;

        lea.nextLine();
        System.out.println("***** FACTURA *****");
        System.out.println("Llevaste " + cantidad + " articulos");
        System.out.println("Valor bruto: $" + subTotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Valor neto a pagar: $" + totalCompra);

    }
}