package controller;

public class BinarioController
{
public BinarioController()
{
super();
}
 public String RecBin(int numero, String cta)
 {
//algoritmo vai subtraindo o numero por 2 e adicionando os restos na String cta 	 
//assim que não for mais possível dividir, a string é enviada outra função para que 
//que seja invertida, resultando no número binário	 
	 
 if (numero < 2)
  {
  cta = cta + String.valueOf(numero);
  int tamanho = cta.length();
  String ct2 = "";
  return RecInv(cta, tamanho, ct2);
  }
  else
   {
    cta = cta + String.valueOf(numero % 2);
    return RecBin(numero / 2, cta);
   }
 }

public String RecInv( String cta, int tamanho, String ct2)
{
  if (tamanho == 0)
  {
  return ct2;
  }
   else
   {
   ct2 = ct2 + cta.substring(tamanho - 1, tamanho);
   return RecInv(cta, tamanho - 1, ct2);
   }
 }
}
