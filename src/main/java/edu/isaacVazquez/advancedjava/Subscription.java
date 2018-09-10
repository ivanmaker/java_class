package com.company;

    public class Subscription {
        private int price ; // subscription total price in euro
        private int length ; // length of subscription in months
        // constructor :
        public Subscription(int price, int length) {
            this.price = price ;
            this.length = length ;
        }
        /**
         * Calculate the monthly subscription price in euro,
         * rounded up to the nearest cent.
         */
        public double pricePerMonth() {
            return (double) price / (double) length;
        }
        /**
         * Call this to cancel/nulify this subscription.
         */
        public void cancel() { length = 0 ; }
    public static void main(String[] args) {

        }
    }
