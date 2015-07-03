package com.mogobiz.pay.common

import java.util.{Calendar, Date}

import org.joda.time.DateTime

case class CartRate(code: String,
                    numericCode: Int,
                    rate: Double = 0.01,
                    fractionDigits: Int = 2)

case class Cart(count: Int,
                rate: CartRate,
                price: Long = 0,
                endPrice: Long = 0,
                taxAmount: Long = 0,
                reduction: Long = 0,
                finalPrice: Long = 0,
                cartItems: Array[CartItem] = Array(),
                coupons: Array[Coupon] = Array(),
                customs: Map[String, Any] = Map())

case class CartItem(quantity: Int,
                    price: Long,
                    endPrice: Long,
                    tax: Float,
                    taxAmount: Long = 0,
                    totalPrice: Long,
                    totalEndPrice: Long,
                    totalTaxAmount: Long = 0,
                    salePrice: Long,
                    saleEndPrice: Long,
                    saleTaxAmount: Long = 0,
                    saleTotalPrice: Long,
                    saleTotalEndPrice: Long,
                    saleTotalTaxAmount: Long = 0,
                    registeredCartItems: Array[RegisteredCartItem],
                    shipping: Option[Shipping],
                    customs: Map[String, Any] = Map())

case class Coupon(code: String,
                  startDate: Option[DateTime] = None,
                  endDate: Option[DateTime] = None,
                  price: Long = 0,
                  customs: Map[String, Any] = Map())

case class Shipping(weight: Long,
                    weightUnit: String,
                    width: Long,
                    height: Long,
                    depth: Long,
                    linearUnit: String,
                    amount: Long,
                    free: Boolean,
                    customs: Map[String, Any] = Map())


case class RegisteredCartItem(email: String,
                              firstname: Option[String] = None,
                              lastname: Option[String] = None,
                              phone: Option[String] = None,
                              birthdate: Option[DateTime] = None,
                              customs: Map[String, Any])
