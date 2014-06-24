package com.demo

class Product {
    String productNumber
    Vendor vendor

    public String toString() {
        """[productNumber: "${productNumber ?: ''}", vendor: "${vendor}"]"""
    }
}
