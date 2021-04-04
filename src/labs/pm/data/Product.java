/*
 * Copyright (C) 2021 Rodrigo Rodrigues
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import labs.pm.data.Rating;

/**
 *
 * @author Rodrigo Rodrigues
 */
public class Product {

    public static final BigDecimal DISCOUNT_RATE=BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    
   public Product(){
       this(0, "no name", BigDecimal.ZERO, Rating.NOT_RATED);
   }
           
   public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
   
   public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    } 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public Rating getRating() {
        return rating;
    }

    public Product applyRating(Rating newRating){
        return new Product(this.id, this.name, this.price, newRating);
    }

}
