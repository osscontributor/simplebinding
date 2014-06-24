package com.demo

class Vendor {
    String phoneNumber

    public String toString() {
        """[phoneNumber: "${phoneNumber ?: ''}"]"""
    }
}
