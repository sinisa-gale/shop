/*
 * Copyright (C) 2021 Sinisa
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
package labs.pm.app;

import java.math.BigDecimal;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 *
 * @author Sinisa
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductManager pm = new ProductManager("en-GB");
//        pm.parseProduct("D,101,Tea,1.99,0,2019-09-19");
//        pm.parseReview("101,4,Nice hot cup of tea");
//        pm.parseReview("101,2,Rather weak tea");
//        pm.parseReview("101,4,Good tea");
//        pm.parseReview("101,5,Perfect tea");
//        pm.parseReview("101,3,Just add some lemon");
//        
//        pm.parseProduct("F,103,Cake,3.99,0,2019-09-19");
        pm.printProductReport(101);
        pm.printProductReport(103);
        //   pm.changeLocale("ru-RU");
        //Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        //  p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
        //  p1 = pm.reviewProduct(p1, Rating.TWO_STAR, "Rather weak tea");
        //  p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Fine tea");
        //  p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Good tea");
        //   p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Perfect tea");
        //  p1 = pm.reviewProduct(p1, Rating.THREE_STAR, "Just add some lemon");

        //   Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        // pm.printProductReport(101);
      //  pm.printProducts((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
      //  pm.printProducts((p3, p2) -> p2.getRating().ordinal());
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        p3 = p3.applyRating(Rating.THREE_STAR);
//        System.out.println(p6.equals(p7));
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
    }
    
}
