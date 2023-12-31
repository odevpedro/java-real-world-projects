package com.odevpedro.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;
public class BankTransactionAnalyzerSimple {

    private  static final String RESSOURCES = "src/main/";
    public static void main(String[] args) throws IOException {



        final BankStatmenteCSVParser bankStatmenteParser = new BankStatmenteCSVParser();


        final String fileName = args[0];
        final Path path = Paths.get(RESSOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatmenteParser.parseLinesFromCSV(lines);

        public static double calculateTotalAmount(List<BankTransaction> bankTransactions){
            double total= 0d;
            for (final BankTransaction bankTransaction: bankTransactions){
                total += bankTransaction.getAmount();
            }
            return total;

        }



        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for (final String line : lines){
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        System.out.println("The total for all transactions is " + calculateTotalAmount(bankTransactions));
        System.out.println("Transaction in January " + selectInMount(BankTransaction, Month.JANUARY));

    }











































































































































































































































































































































































































}