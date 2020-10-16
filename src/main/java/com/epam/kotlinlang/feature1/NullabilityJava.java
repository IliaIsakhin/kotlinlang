package com.epam.kotlinlang.feature1;

import com.epam.kotlinlang.basics.*;
import com.epam.kotlinlang.basics.feature1.NullabilityKt;

public class NullabilityJava {

    public static void main(String[] args) {
        String isDead = null;

        Chest chest = NullabilityKt.getKosheysDeath().getChest();
        if (chest != null) {
            Hare hare = chest.getHare();
            if (hare != null) {
                Duck duck = hare.getDuck();
                if (duck != null) {
                    Egg egg = duck.getEgg();
                    if (egg != null) {
                        Spine spine = egg.getSpine();
                        if (spine != null) {
                            isDead = spine.isDead() ? "умер" : "живой";
                        }
                    }
                }
            }

            System.out.println("Кощей " + isDead);
        }
    }
}
