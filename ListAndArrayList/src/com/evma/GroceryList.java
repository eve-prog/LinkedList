package com.evma;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();  // ArrayList is a class... () => can have an empty constructor

    public void addGroseryItem(String item){
        groceryList.add(item); //automaticly adds an item and alocates memory with .add method from ArrayList Class
    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items " +
                "in your grocery list");
        for (int i=0; i< groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been " +
                "modified");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
 //       boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
}
