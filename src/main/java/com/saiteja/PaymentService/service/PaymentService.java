package com.saiteja.PaymentService.service;

import com.saiteja.PaymentService.model.PaymentRequest;
import com.saiteja.PaymentService.model.PaymentResponse;
import org.springframework.http.HttpStatusCode;

public interface PaymentService {

    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
