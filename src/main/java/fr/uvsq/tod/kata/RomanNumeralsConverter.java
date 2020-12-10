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

      if (aRomanNumer == null) throw new IllegalArgumentException("aRomanNumer cannot be a null value");

      switch (aRomanNumer) {
          case "I":  return 1;

          case "V":  return 5;

          case "X":  return 10;

          case "L":  return 50;

          case "C":  return 100;

          case "D":  return 500;

          case "M":  return 1000;

          case "":  throw new IllegalArgumentException("aRomanNumer cannot be blank");


          default: throw new IllegalArgumentException("Can't handle an unordered string");

      }

  }
}
