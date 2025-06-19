package com.example;

//Main.java
public class Test {
 public static void main(String[] args) {
     Product[] products = {
         new Product(1, "Laptop", "Electronics"),
         new Product(2, "Shoes", "Fashion"),
         new Product(3, "Keyboard", "Electronics"),
         new Product(4, "T-Shirt", "Fashion"),
         new Product(5, "Mouse", "Electronics")
     };

     System.out.println("=== Linear Search ===");
     Product result1 = SearchEngine.linearSearch(products, "Keyboard");
     System.out.println(result1 != null ? "Product Id: "+result1.ProductId+"\nProduct Name: "+result1.ProductName+"\nCategory: "+result1.Category : "Product not found");
     System.out.println("\n=== Binary Search ===");
     SearchEngine.sortProductsByName(products); // Sorting before binary search
     Product result2 = SearchEngine.binarySearch(products, "Keyboard");
     System.out.println(result2 != null ? "Product Id: "+result1.ProductId+"\nProduct Name: "+result1.ProductName+"\nCategory: "+result1.Category : "Product not found");
 }
}
