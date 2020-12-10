package fr.uvsq.tod.compte;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.uvsq.tod.exceptions.DecouvertException;
import fr.uvsq.tod.exceptions.NegatifBalanceException;

/**
 * La classe <code>Compte</code> représente un compte bancaire.
 *
 * @author hal & uvsq21087955
 * @version 2020
 */
public class Compte {
private static final Logger logger = LogManager.getLogger(Compte.class);


  private int balance;

  public Compte(int initialBalance)
  {
    if(initialBalance<0) throw new DecouvertException();
    this.balance=initialBalance;
  }

  public int getBalance()
  {
    return this.balance;
  }

  public void Consulter()
  {
    System.out.println("Votre solde est: " + this.balance+" euros");
  }

  public void crediter(int montant_credit)
  {
    if(montant_credit<0) throw new NegatifBalanceException();
    this.balance+=montant_credit;
  }

  public void debiter(int montant_debiter)
  {
    if(montant_debiter < 0) throw new NegatifBalanceException();
    if(montant_debiter > this.getBalance()) throw new DecouvertException();

    this.balance-=montant_debiter;
  }

  public void virement(Compte compte2, int montant_virement)
  {
    if(montant_virement < 0) throw new NegatifBalanceException();
    if(montant_virement>this.getBalance()) throw new DecouvertException();

    compte2.balance+=montant_virement;
    this.debiter(montant_virement);
  }


    public static void main(String[] args)
    {

    logger.info("Hello, cher utilisateur!");
    //deux comptes A comme adam et K comme kasparov
    Compte compteK, compteA;

    compteK = new Compte(5000);
    compteA = new Compte(6000);

    //Kasparov fait virement a Adam
    compteK.virement(compteA, 5000);
    logger.info("logging user Kasparov sends "+5000 + " euros");

    if (logger.isDebugEnabled())
    {
      //adam reçoit le montant de l'argent versé
      logger.debug("Logging in recever Adam's balance is: " + compteA.getBalance() + " euros");
    }
      logger.info("Thank you dear user for using our machines");



    
    }


}
