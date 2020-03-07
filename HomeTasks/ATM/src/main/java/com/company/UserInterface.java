package com.company;

import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static com.company.Service.*;

public class UserInterface {

    private final Service service = new Service();
    private final Parser parser = new ParserXML ();
    private static int amountOfAttempts = 3;

    public void startProgram() throws IOException, JAXBException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<CashCard> cardList = service.getCardList();
        ClientInformation clientInformation = new ClientInformation ();
        //cardList.add(cashCard)

        boolean exit = false;
        do {
            System.out.println("Input your credentials(id):");
            String id = reader.readLine();
            if (service.isValidId(cardList, id)) {
                CashCard cashCard = service.getCardById(cardList, id);
                while (amountOfAttempts > 0) {
                    System.out.println("Input your credentials(password):");
                    String password = reader.readLine();
                    int index = service.getCardIndex ( cardList,cashCard );
                    if (service.isValidPassword(cashCard, password, amountOfAttempts)) {
                        System.out.println("1.Display the balance;\n" + "2.Take some money;\n" + "3.Add money;");
                        int choice = Integer.parseInt(reader.readLine());
                        switch (choice) {
                            case 1:
//                        System.out.println("Input password");
//                        String password = reader.readLine();
                                service.getBalanceFromCashCard(cashCard);
                                break;
                            case 2:
                                System.out.println("Input the bank note:");
                                int money = Integer.parseInt(reader.readLine());
                                service.takeMoneyFromCashCard (cashCard, money);
                                cardList.set ( index, cashCard );

                                clientInformation.setCashCards (  cardList);
                                parser.saveObject (new File( "src/main/resources/CashCard.xml" ),clientInformation);


                                break;
                            case 3:
                            System.out.println("Add the bank note:");
                            int moneyDenomination = Integer.parseInt(reader.readLine());
                            service.addMoneyToCashCard(cashCard, moneyDenomination);
                            cardList.set ( index, cashCard );

                            clientInformation.setCashCards (  cardList);
                            parser.saveObject (new File( "src/main/resources/CashCard.xml" ),clientInformation);

//
                            break;
                            case 4:
                                exit = true;
                                System.out.println("Exit");
                                break;
                            default:
                                System.out.println("There is no such variant");
                                break;
                        }
                    } else {
                        amountOfAttempts--;
                        System.out.println("You have input incorrect password " + " Amount of attempts:" + amountOfAttempts);
                    }
                }
                if (amountOfAttempts == 0) {
                    System.out.println("Ur card is blocked");
                    return;
                }
            }
        } while (!exit);
    }
}
