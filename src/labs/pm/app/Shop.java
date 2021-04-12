/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import labs.pm.data.Product;
import labs.pm.data.Rating;
import labs.pm.data.ProductManager;

/**
 *
 * @author Rodrigo Rodrigues
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductManager pm = new ProductManager("pt-BR");
        
//        pm.printProductReport(101);
//
//        pm.createProduct(104, "Juice", BigDecimal.valueOf(4.99), Rating.NOT_RATED);
//        pm.reviewProduct(104,Rating.TWO_STAR,"Nice cup of Juice");
//        pm.reviewProduct(104,Rating.TWO_STAR,"Rather weak Juice");
//        pm.reviewProduct(104,Rating.FOUR_STAR,"Fine Juice");
//        pm.reviewProduct(104,Rating.FOUR_STAR,"Good Juice");
//        pm.reviewProduct(104,Rating.FIVE_STAR,"Perfect Juice");
//        pm.reviewProduct(104,Rating.THREE_STAR,"Just add some lemon");
//        
//        
//        pm.printProductReport(101);
//        pm.printProductReport(102);
//        pm.dumpData();
//        pm.restoreData();
//        pm.printProductReport(103);
//        pm.printProductReport(104);
//        
//        pm.printProducts(p -> p.getPrice().floatValue() < 2, (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
//        pm.getDiscounts().forEach((rating, discount) -> System.out.println(rating + '\t' + discount));

    }

}
