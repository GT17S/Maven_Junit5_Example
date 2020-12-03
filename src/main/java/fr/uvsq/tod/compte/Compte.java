package fr.uvsq.tod.compte;

import fr.uvsq.tod.exceptions.DecouvertException;
import fr.uvsq.tod.exceptions.NegatifBalanceException;

/**
 * La classe <code>Compte</code> représente un compte bancaire.
 *
 * @author hal & uvsq21087955
 * @version 2020
 */
public class Compte {

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
        Compte compteKARIM,compteABDENOUR;

        compteKARIM= new Compte(5000);
        compteABDENOUR= new Compte(6000);

        compteKARIM.virement(compteABDENOUR,5600);
        System.out.println("ABdenour balance is"+compteABDENOUR.getBalance());


    
    }


}
