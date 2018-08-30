package com.worth.exercises;

class Checkout {

    public Checkout() {
    }

    double calculatePrice(Basket basket) {

        double total = (calculateBananaPrice(basket) +
                calculateOrangePrice(basket) +
                calculateApplePrice(basket) +
                calculatePepperPrice(basket) +
                calculateCarrotPrice(basket) +
                calculateCourgettePrice(basket));

        return total - allDiscounts(basket);
    }

    double allDiscounts(Basket basket) {

        return freeCarrotsPrice(basket) + freeCourgettePrice(basket) + appleDiscount(basket) + pepperDiscount(basket);
    }

    // FRUITS: apples, bananas, oranges    VEGETABLES: courgettes, carrots, peppers
    // Free kilos of carrots for every 4 fruits
    double freeCarrotsPrice(Basket basket) {

        int fruits = basket.getBananas() + basket.getOranges() + basket.getApples();

        if (fruits >= 4) {
            int freeCarrots = fruits / 4;
            double carrotDiscount = freeCarrots * .65;

            System.out.println("Free " + freeCarrots + " kilos of carrots!");

            if (basket.getKilosOfCarrots() != 0) {
                if (basket.getKilosOfCarrots() > freeCarrots) {
                    return carrotDiscount;
                }
                return calculateCarrotPrice(basket);  // if only 1 kilo of carrots bought (included on the basket)
            }                                   // and they are entitled to 4 kilos free, only the price of
        }                                       // the 1 kilo will be deducted to the total amount as
                                                // the other 3 will be given without deducting from the total amount.
        return 0;
    }

    // Free courgette if fruits are more than 5
    double freeCourgettePrice(Basket basket) {
        if ((basket.getBananas() + basket.getOranges() + basket.getApples()) > 5) {
            System.out.println("You got yourself a free courgette!");

            if (basket.getCourgettes() != 0) {
                return .20;              // Only 1 courgette is free when sum of the fruits is more than 5,
            }                            // this is deducted if a courgette is in the basket
        }
        return 0;
    }

    // 30% off apples when you buy more than 3 apples,
    // 50% off apples when you buy more than 7 apples.
    double appleDiscount(Basket basket) {

        int numberOfApples = basket.getApples();
        double priceOfApple = numberOfApples * .25;

        if (numberOfApples > 3 && numberOfApples <= 7) {
            return priceOfApple * .30;
        } else if (numberOfApples > 7) {
            return priceOfApple * .50;
        } else {
            return 0;
        }
    }

    // 3 for 2 on peppers
    double pepperDiscount(Basket basket) {
        int numberOfPeppers = basket.getPeppers();

        if (numberOfPeppers >= 3) {
            int freePepper = numberOfPeppers / 3;
            return freePepper * .55;
        }
        return 0;
    }

    double calculateBananaPrice(Basket basket) {
        return basket.getBananas() * .18;
    }

    double calculateOrangePrice(Basket basket) {
        return basket.getOranges() * .35;
    }

    double calculateApplePrice(Basket basket) {
        return basket.getApples() * .25;
    }

    double calculateCarrotPrice(Basket basket) {
        return basket.getKilosOfCarrots() * .65;
    }

    double calculateCourgettePrice(Basket basket) {
        return basket.getCourgettes() * .20;
    }

    double calculatePepperPrice(Basket basket) {

        return basket.getPeppers() * .55;
    }


}

// Goal:
// The shopping basket contains an order for apples (25p), bananas (18p) , oranges (35p), carrots (65p per kilo),
// courgettes (20p) and peppers (55p).
//
// Current deals are 3 for 2 on peppers. 30% off apples when you buy more than 3 apples,
// 50% off apples when you buy more than 7 apples. Get a free courgette if you buy more than 5 fruit.
// Get a free kilo of carrots for every 4 items of fruit bought.
// Implement the method Checkout.calculatePrice() to return the correct price of the basket.