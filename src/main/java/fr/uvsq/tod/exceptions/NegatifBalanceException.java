package fr.uvsq.tod.exceptions;

/**
 * La classe <code>NegatifBalanceException</code> représente une classe d'exception pour les comptes exerceant des actions avec des montants negatifs.
 *
 * @author uvsq21087955
 * @version 2020
 */

public class NegatifBalanceException extends RuntimeException
{
    public NegatifBalanceException()
    {
        super("Le montant donnée est négatif");
    }
}
