package com.epam.kotlinlang.feature1;

import com.epam.kotlinlang.basics.*;
import com.epam.kotlinlang.basics.feature1.NullabilityKt;

import java.util.Optional;

public class NullabilityJava2 {
    public static void main(String[] args) {
        Oak oak = NullabilityKt.getKosheysDeath();

        String isDead = Optional.of(oak)
                .map(Oak::getChest)
                .map(Chest::getHare)
                .map(Hare::getDuck)
                .map(Duck::getEgg)
                .map(Egg::getSpine)
                .map(Spine::isDead)
                .orElse(false) ? "умер" : "живой";

        System.out.println("Кощей " + isDead);
    }
}
