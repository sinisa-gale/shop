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
package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Sinisa
 */
public class Food extends Product {
    
    private LocalDate bestBefore;

    /**
     * Get the value of bestBefore
     *
     * @return the value of bestBefore
     */
    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public Food(LocalDate bestBefore, int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

}
