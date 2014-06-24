package com.demo

class DemoController {

    def save(SaveProductCommand cmd) {
        render "Product Number: ${cmd.product?.productNumber}, Product Vendor Phone Number: ${cmd.product?.vendor?.phoneNumber}"
    }
}

class SaveProductCommand {
    Product product
}
