package fr.uvsq.tod.kata;

/**
 * La classe <code>RomanNumeralsConverter</code> regroupe des fonctions pour la manipulation de nombres en numération romaine.
 *
 * @author hal & uvsq21807955
 * @version 2020
 */
public class RomanNumeralsConverter {
  /**
   * Convertit un nombre en chiffres romains en décimal
   * @param aRomanNumer la chaîne de caractères contenant le nombre en chiffres romains
   * @return la valeur décimal de ce nombre
   */
  public static int toDecimal(String aRomanNumer)
  {
    if(aRomanNumer == "I") return 1;
    else return 0;
  }
}
