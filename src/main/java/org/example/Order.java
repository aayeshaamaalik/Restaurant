package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Table table;
    private Party party;
    private List<Meal> meals;

    public Order(Table table, Party party) {
        this.table = table;
        this.party = party;
        this.meals = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public float getTotalPrice() {
        float total = 0f;
        for (Meal meal : meals) {
            total += meal.getPrice();
        }
        return total;
    }

    public Table getTable() {
        return table;
    }

    public Party getParty() {
        return party;
    }

    public List<Meal> getMeals() {
        return meals;
    }
}

