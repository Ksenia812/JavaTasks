package com.company;

import javax.xml.bind.JAXBException;
import java.util.List;

public class Service implements ServiceInterface {
    private Storage storage = new Storage ();
  @Override
    public List<CashCard> getCardList () {
        return storage.getClientInfo ().getCashCards ();
    }
    @Override
    public CashCard getCardById ( List<CashCard> cardList, String id )  {
        return storage.getCashCardById ( cardList, id );
    }
    @Override
    public boolean isValidId ( List<CashCard> cardList, String id )  {
        for ( CashCard cashCard : cardList ) {
            if ( cashCard.getId ().equals ( id ) ) {
                return true;
            }
        }
        System.out.println ( "Incorrect id" );
        return false;
    }
    @Override
    public boolean isValidPassword ( CashCard cashCard, String password, int amountOfAttempts ) {
        return password.equals ( cashCard.getPassword () );
    }
    @Override
    public void getBalanceFromCashCard ( CashCard cashCard )  {
        System.out.println ( "Your balance is: " + cashCard.getBalance () );
    }
    @Override
    public boolean addMoneyToCashCard ( CashCard cashCard, int moneyDenomination )  {
        if ( moneyDenomination % 10 == 0 && moneyDenomination % 100 != 10 && moneyDenomination % 100 != 30
                && moneyDenomination % 100 != 80 ) {
            cashCard.setBalance ( cashCard.getBalance () + moneyDenomination );
            System.out.println ( "Your money is added" );
            return true;
        } else {
            System.out.println ( "Denomination is only 20, 50, 100" );
            return false;
        }
    }
    @Override
    public int getCardIndex ( List<CashCard> cardList, CashCard cashCard ) {
        for ( int i = 0 ; i < cardList.size () ; i++ ) {
            if ( cardList.get ( i ) == cashCard ) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public boolean takeMoneyFromCashCard ( CashCard cashCard, int money ) {
        if ( money % 10 == 0 && money % 100 != 10 && money % 100 != 30
                && money % 100 != 80 && cashCard.getBalance () - money > 0 ) {
            cashCard.setBalance ( cashCard.getBalance () - money );
            System.out.println ( "Your money is taken" );
            return true;
        } else if ( cashCard.getBalance () - money < 0 ) {
            System.out.println ( "U have not enough money" );
        } else System.out.println ( "Denomination is only 20, 50, 100" );

        return false;
    }


}
