package com.epam.kotlinlang.basics

/**
 * дуб стоит,
 * под дубом сундук зарыт,
 * в сундуке — заяц,
 * в зайце — утка,
 * в утке — яйцо,
 * в яйце — игла,
 * в игле — смерть Кощея».
 */
data class Oak(val chest: Chest?)

data class Chest(val hare: Hare?)

data class Hare(val duck: Duck?)

data class Duck(val egg: Egg?)

data class Egg(val spine: Spine?)

data class Spine(val isDead: Boolean)
