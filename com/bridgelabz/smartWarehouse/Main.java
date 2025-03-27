package com.bridgelabz.smartWarehouse;

public class Main {
    public static void main(String[] args) {
        // Storage for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Mobile", 20000));
        electronicsStorage.addItem(new Electronics("Charger", 500));

        // Storage for Groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Wheat", 200));
        groceriesStorage.addItem(new Groceries("Milk", 31));

        // Storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Dining table", 10000));
        furnitureStorage.addItem(new Furniture("Chair", 1500));

        // Display items from each storage
        System.out.println("Electronics Storage:");
        electronicsStorage.displayItems();

        System.out.println("\nGroceries Storage:");
        groceriesStorage.displayItems();

        System.out.println("\nFurniture Storage:");
        furnitureStorage.displayItems();

        // Using Wildcard Method to display all items from different storages
        System.out.println("\nDisplaying all items using Wildcard:");
        WarehouseUtil.displayAllItems(electronicsStorage.getItems());
        WarehouseUtil.displayAllItems(groceriesStorage.getItems());
        WarehouseUtil.displayAllItems(furnitureStorage.getItems());
    }
}

