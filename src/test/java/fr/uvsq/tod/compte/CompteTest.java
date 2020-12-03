package fr.uvsq.tod.compte;

import org.junit.Test;

import fr.uvsq.tod.exceptions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * La classe <code>CompteTest</code> représente la classe des test sur la classe compte.
 *
 * @author hal & uvsq21087955
 * @version 2020
 */

public class CompteTest {
  @Test
  public void shouldCreateAnAccountWithTheSpecifiedBalance() {
    Compte c = new Compte(100);
    assertEquals(100, c.getBalance());
  }

  @Test
  public void compteNonNull()
  {
    Compte c = new Compte(100);
    assertNotNull(c);
  }

  @Test
  public void testCrediter()
  {
    Compte c = new Compte(100);
    c.crediter(50);
    assertEquals(150, c.getBalance());
  }

  @Test
  public void testDebiter()
  {
    Compte c = new Compte(100);
    c.debiter(50);
    assertEquals(50, c.getBalance());
  }

  @Test(expected = NegatifBalanceException.class)
  public void testCreditNegatif()
  {
    Compte c = new Compte(3);
    c.crediter(-1);
  }

  @Test(expected = DecouvertException.class)
  public void initialBalanceTest()
  {
    Compte c = new Compte(-3);
  }

  @Test(expected = NegatifBalanceException.class)
  public void testDebitNegatif()
  {
    Compte c = new Compte(3);
    c.debiter(-2);
  }

  @Test(expected = DecouvertException.class)
  public void testDebitSuperiorThanBalance()
  {
    Compte c = new Compte(3);
    c.debiter(5);
  }

  @Test
  public void testVirement()
  {
    Compte c = new Compte(100);
    Compte c1 = new Compte(200);

    c.virement(c1,50);

    assertEquals(50, c.getBalance());
    assertEquals(250, c1.getBalance());
  }

  @Test(expected = NegatifBalanceException.class)
  public void testVirementNegatif()
  {
    Compte c = new Compte(30);
    Compte c1 = new Compte(10);

    c.virement(c1,-8);
  }

  @Test(expected = DecouvertException.class)
  public void testVirementSuperiorThanBalance()
  {
    Compte c = new Compte(100);
    Compte c1 = new Compte(500);

    c.virement(c1,120);
  }

}
