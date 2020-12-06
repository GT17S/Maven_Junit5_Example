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
    if(aRomanNumer == "V") return 5;
    if(aRomanNumer == "X") return 10;
    if(aRomanNumer == "L") return 50;
    if(aRomanNumer == "C") return 100;
    if(aRomanNumer == "D") return 500;
    if(aRomanNumer == "M") return 1000;

    if (aRomanNumer == null) throw new IllegalArgumentException("aRomanNumer cannot be a null value");
    if (aRomanNumer == "") throw new IllegalArgumentException("aRomanNumer cannot be blank");
    else throw new IllegalArgumentException("can't handle an ordered string");
  }
}
