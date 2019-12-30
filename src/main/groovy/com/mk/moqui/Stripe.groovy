// package com.mk.moqui;
// import org.moqui.context.ExecutionContext;
// import java.util.HashMap;
// import java.util.Map;
// import com.stripe.Stripe;
// import com.stripe.exception.StripeException;
// import com.stripe.model.Charge;
// import com.stripe.net.RequestOptions;

// class Stripe {
//     public static void hitStripe(ExecutionContext ec) {
//         Stripe.apiKey = "sk_test_s0RUnYfOojvlUByKuSLMjp5m00ykcgNxrE";
//         //  String token = request.getParameter("stripeToken");
//         Map<String, Object> params = new HashMap<String, Object>();

//         params.put("amount", 999);
//         params.put("currency", "usd");
//         params.put("source", "tok_visa");
//         params.put("receipt_email", "jenny.rosen@example.com");
//         Charge charge = Charge.create(params);
//     }
// }

// Stripe.apiKey = "sk_test_s0RUnYfOojvlUByKuSLMjp5m00ykcgNxrE";

// Charge charge = Charge.retrieve("ch_P6nZvewUw6NI74kvmgoe");
// charge.capture();