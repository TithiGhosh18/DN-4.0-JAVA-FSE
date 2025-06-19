package com.example;

import java.util.*;

public class SearchEngine {
    // Linear Search by Product Name
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.ProductName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search by Product Name (array must be sorted)
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].ProductName.compareToIgnoreCase(name);
            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }
    
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.ProductName.toLowerCase()));
    }

}
