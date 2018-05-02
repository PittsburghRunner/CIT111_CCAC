/*
 * Copyright (C) 2018 christopher.eckles
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package SimpleBattleship;

import java.util.Random;

/**
 *
 * @author christopher.eckles
 */
public class RandomNumber {

    // generate a random big number
    public int generateRandomLocation(int maxInt) {
        // create a random number
        Random r = new Random();
        //create a BigInteger object to do math with huge numbers
        int next = r.nextInt(maxInt+1);
        //print the value
        return next;
    }
}