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

        //pm.printProductReport(42);
        //pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.parseProduct("D,101,Tea,1.99,0,2019-09-19");
        pm.printProductReport(101);
        pm.parseReview("101,4,Nice cup of Tea");
        pm.parseReview("101,2,Rather weak tea");
        pm.parseReview("101,4,Fine tea");
        pm.parseReview("101,2,Good tea");
        pm.parseReview("101,5,Perfect tea");
        pm.parseReview("101,3,Just add some lemon");

        //pm.createProduct(102, "Coffee", BigDecimal.valueOf(3.99), Rating.NOT_RATED);
        pm.parseProduct("D,102,Coffee,3.99,0,2019-09-19");
        pm.parseReview("102,4,Nice cup of coffee");
        pm.parseReview("102,2,Rather weak coffee");
        pm.parseReview("102,4,Fine coffee");
        pm.parseReview("102,2,Good coffee");
        pm.parseReview("102,5,Perfect coffee");
        pm.parseReview("102,3,Just add some sugar");

        //pm.createProduct(103, "Cake", BigDecimal.valueOf(7.99), Rating.NOT_RATED, LocalDate.now().plusDays(5));
        pm.parseProduct("F,103,Cake,7.99,0,2021-04-15");
        pm.parseReview("103,2,Nice cup of Cake");
        pm.parseReview("103,5,Rather weak Cookie");
        pm.parseReview("103,5,Fine Cake");
        pm.parseReview("103,5,Good Cake");
        pm.parseReview("103,5,Perfect Cake");
        pm.parseReview("103,2,Just add some extra sugar");

        Comparator<Product> ratingSorter = (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
        Comparator<Product> priceSorter = (p1, p2) -> p2.getPrice().compareTo(p1.getPrice());
        System.out.println('\n');
        System.out.println("Produtos ordernados pelas avaliações, da maior para a menor");
        pm.printProductReport(101);
        pm.printProductReport(102);
        pm.printProductReport(103);
        pm.printProducts(p -> p.getPrice().floatValue() < 2, ratingSorter);

        pm.getDiscounts().forEach((rating, discount) -> System.out.println(rating + '\t' + discount));

    }

}
