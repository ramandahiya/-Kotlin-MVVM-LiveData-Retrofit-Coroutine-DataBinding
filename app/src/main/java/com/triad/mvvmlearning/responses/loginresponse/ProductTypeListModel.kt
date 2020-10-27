package com.triad.mvvmlearning.responses.loginresponse

/**
 * Created by Raman on 04-04-2018.
 */
 data class ProductTypeListModel (
    var message: String? ,
    var status: String?  ,
    var data: Array<Data>?
    ){


    override fun toString(): String {
        return "ClassPojo [message = $message, status = $status, data = $data]"
    }

    inner class Data {
        var product: Array<Product>? = null
        var category: String? = null
        var category_image: String? = null

        override fun toString(): String {
            return "ClassPojo [product = $product, category = $category, category_image = $category_image]"
        }
    }

    inner class Product {
        var no_of_fsn: String? = null
        var accessory: Array<Accessory>? = null
        var dsn_required: String? = null
        var sub_category_image: String? = null
        var category_image: String? = null
        var device: Array<Device>? = null
        var sub_category: String? = null
        var category: String? = null

        override fun toString(): String {
            return "ClassPojo [ no_of_fsn = $no_of_fsn, accessory = $accessory, dsn_required = $dsn_required, sub_category_image = $sub_category_image, device = $device, sub_category = , category = $category, category_image = $category_image]"
        }
    }

    inner class Accessory {

        var type: String? = null
        var category: String? = null
        var asin: String? = null
        var item_description: String? = null
        var mrp: String? = null
        var internal_name: String? = null
        var upc: String? = null
        var special_value: String? = null

        override fun toString(): String {
            return "ClassPojo [category = " + category + ", special_value = " + special_value + ", asin = " + asin + ", description = " + item_description + ", mrp = " + mrp + ", internal_name = " + internal_name + ", upc = " + upc + "]"
        }
    }

    inner class Device {

        var category: String? = null

        var position = 0

        var qty: String? = null

        var sku: String? = null

        var type: String? = null
        var asin: String? = null
        var item_description: String? = null
            get() = field
            set(description) {
                field = description
            }
        var mrp: String? = null
        var internal_name: String? = null
        var special_value: String? = null
        var checked: String? = null

        override fun toString(): String {
            return "ClassPojo [asin = " + asin + ", special_value = " + special_value + ", description = " + item_description + ", mrp = " + mrp + ", internal_name = " + internal_name + "]"
        }
    }
}