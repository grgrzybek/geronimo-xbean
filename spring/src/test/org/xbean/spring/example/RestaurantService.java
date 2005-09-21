/**
 * 
 * Copyright 2005 LogicBlaze, Inc. http://www.logicblaze.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 * 
 **/
package org.xbean.spring.example;

import java.util.List;

/**
 * An owner POJO used for testing out nested properties
 * 
 * @version $Revision: 1.1 $
 */
public class RestaurantService {

    private PizzaService favourite;
    private List dinnerMenu;
    private PizzaService[] lunchMenu;

    public List getDinnerMenu() {
        return dinnerMenu;
    }

    public void setDinnerMenu(List dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
    }

    public PizzaService[] getLunchMenu() {
        return lunchMenu;
    }

    public void setLunchMenu(PizzaService[] lunchMenu) {
        this.lunchMenu = lunchMenu;
    }

    public PizzaService getFavourite() {
        return favourite;
    }

    public void setFavourite(PizzaService favourite) {
        this.favourite = favourite;
    }

}
