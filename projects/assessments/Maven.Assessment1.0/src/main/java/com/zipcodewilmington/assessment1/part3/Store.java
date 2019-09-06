package com.zipcodewilmington.assessment1.part3;

public class Store {
    // FIELDS
    //
    // 1. Create a field called "products" of type Product array
    // 2. Create a field called "name" of type String
    //
    // Create any other fields necessary to make the code work

    public Store(){
        // initialize the products to an array of size 0
    }


    public Store(Product[] products){
        //set the instance products field to the parameter products
    }

    /**
     * Set the store name to the name given
     * @param name new name of the store
     */
    public void setName(String name){

    }

    /**
     * @return the name of the store
     */
    public String getName() {
        return null;
    }


    /**
     * @return the number of items in the store
     */
    public int size(){
        return -1;
    }

    /**
     * @param product to add
     */
    public void addProduct(Product product){
    }


    /**
     * @param product to remove from the store
     */
    public void removeProduct(Product product) {
    }

    /**
     * Check if the store has the product
     * @param product to check
     * @return true if the store has the product, false otherwise
     */
    public Boolean hasProduct(Product product) {
        return null;
    }

    /**
     * @return the product with the lowest price
     */
    public Product getCheapestProduct(){
        return null;
    }

    /**
     * @return the average price of the product in the store
     */
    public double getAveragePrice(){
        return -1;
    }

    /**
     * @return all the products in the store
     */
    public Product[] getProducts(){
        return null;
    }

}
