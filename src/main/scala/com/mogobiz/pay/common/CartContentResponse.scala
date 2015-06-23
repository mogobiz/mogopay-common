package com.mogobiz.pay.common

import org.joda.time.DateTime

/**
 * Created by yoannbaudy on 22/06/2015.
 */

case class Cart(currencyCode: String,
                price: Long = 0,
                endPrice: Long = 0,
                reduction: Long = 0,
                finalPrice: Long = 0,
                cartItems: Array[CartItem] = Array(),
                coupons: Array[Coupon] = Array(),
                customs: Map[String, Any])

case class CartItem(quantity: Int,
                    price: Long,
                    endPrice: Option[Long],
                    tax: Option[Float],
                    totalPrice: Long,
                    totalEndPrice: Option[Long],
                    salePrice: Long,
                    saleEndPrice: Option[Long],
                    saleTotalPrice: Long,
                    saleTotalEndPrice: Option[Long],
                    registeredCartItems: Array[RegisteredCartItem],
                    shipping: Option[Shipping],
                    customs: Map[String, Any])

case class Coupon(code: String,
                  startDate: Option[DateTime] = None,
                  endDate: Option[DateTime] = None,
                  price: Long = 0,
                  customs: Map[String, Any])

case class Shipping(weight: Long,
                    weightUnit: String,
                    width: Long,
                    height: Long,
                    depth: Long,
                    linearUnit: String,
                    amount: Long,
                    free: Boolean,
                    customs: Map[String, Any])


case class RegisteredCartItem(email: String,
                              firstname: Option[String] = None,
                              lastname: Option[String] = None,
                              phone: Option[String] = None,
                              birthdate: Option[DateTime] = None,
                              customs: Map[String, Any])
