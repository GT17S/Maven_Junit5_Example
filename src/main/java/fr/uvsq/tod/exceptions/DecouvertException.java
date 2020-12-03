package fr.uvsq.tod.exceptions;

/**
 * La classe <code>DecouvertException</code> représente une classe d'exception pour les comptes à decouvert.
 *
 * @author uvsq21087955
 * @version 2020
 */
public class DecouvertException extends RuntimeException
{
    public DecouvertException()
    {
       super("L'opération implique que le compte soit à decouvert");
    }
}
