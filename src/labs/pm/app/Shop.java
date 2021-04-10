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

        pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);

        pm.reviewProduct(101, Rating.FOUR_STAR, "Nice cup of Tea");
        pm.reviewProduct(101, Rating.TWO_STAR, "Rather weak tea");
        pm.reviewProduct(101, Rating.FOUR_STAR, "Fine tea");
        pm.reviewProduct(101, Rating.TWO_STAR, "Good tea");
        pm.reviewProduct(101, Rating.FIVE_STAR, "Perfect tea");
        pm.reviewProduct(101, Rating.THREE_STAR, "Just add some lemon");

        pm.createProduct(102, "Coffee", BigDecimal.valueOf(3.99), Rating.NOT_RATED);
        pm.reviewProduct(102, Rating.TWO_STAR, "Nice cup of Coffee");
        pm.reviewProduct(102, Rating.TWO_STAR, "Rather weak Coffee");
        pm.reviewProduct(102, Rating.TWO_STAR, "Fine Coffee");
        pm.reviewProduct(102, Rating.THREE_STAR, "Good Coffee");
        pm.reviewProduct(102, Rating.FIVE_STAR, "Perfect Coffee");
        pm.reviewProduct(102, Rating.TWO_STAR, "Just add some lemon");

        pm.createProduct(103, "Cake", BigDecimal.valueOf(7.99), Rating.NOT_RATED, LocalDate.now().plusDays(5));
        pm.reviewProduct(103, Rating.TWO_STAR, "Nice cup of Cake");
        pm.reviewProduct(103, Rating.FIVE_STAR, "Rather weak Cookie");
        pm.reviewProduct(103, Rating.FIVE_STAR, "Fine Cake");
        pm.reviewProduct(103, Rating.FIVE_STAR, "Good Cake");
        pm.reviewProduct(103, Rating.FIVE_STAR, "Perfect Cake");
        pm.reviewProduct(103, Rating.TWO_STAR, "Just add some extra sugar");

        Comparator<Product> ratingSorter = (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
        Comparator<Product> priceSorter = (p1, p2) -> p2.getPrice().compareTo(p1.getPrice());
        System.out.println('\n');
        System.out.println("Produtos ordernados pelas avaliações, da maior para a menor");
        pm.printProducts(ratingSorter);

        System.out.println('\n');
        System.out.println("Produtos ordernados pelo preço, do maior para o menor");
        pm.printProducts(priceSorter);
        
        System.out.println('\n');
        System.out.println("Produtos ordernados pelas avaliações e preço, dos maiores para os menores");
        pm.printProducts(ratingSorter.thenComparing(priceSorter));
        
        System.out.println('\n');
        System.out.println("Produtos ordernados pelas avaliações e preço, dos menores para os maiores");
        pm.printProducts(ratingSorter.thenComparing(priceSorter).reversed());
    }

}
