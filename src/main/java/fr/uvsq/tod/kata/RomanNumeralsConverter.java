package fr.uvsq.tod.kata;

import java.util.HashMap;
import java.util.Map;

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
  public static int toDecimal(String aRomanNumer) {

      Map<String, Integer> RomanMap = new HashMap<>();
      RomanMap.put("I", 1);
      RomanMap.put("V", 5);
      RomanMap.put("X", 10);
      RomanMap.put("L", 50);
      RomanMap.put("C", 100);
      RomanMap.put("D", 500);
      RomanMap.put("M", 1000);

      if (RomanMap.containsKey(aRomanNumer)) return RomanMap.get(aRomanNumer);
      else if(aRomanNumer == "") throw new IllegalArgumentException("aRomanNumer cannot be blank");
      else if(aRomanNumer == null) throw new IllegalArgumentException("aRomanNumer cannot be a null value");
      else throw new IllegalArgumentException("Can't handle an unordered string");

  }
}
