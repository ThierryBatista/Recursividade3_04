package view;

import controller.BinarioController;

public class Binario
{
 public static void main(String Args[])
 {
 BinarioController Bin = new BinarioController();
 int numero = 25;
 String cta = "";
 cta = Bin.RecBin(numero, cta);
 System.out.println(cta);
 }
}
