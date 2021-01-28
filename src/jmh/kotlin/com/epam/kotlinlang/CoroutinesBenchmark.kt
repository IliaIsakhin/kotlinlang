package com.epam.kotlinlang

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole

@BenchmarkMode(value = [Mode.AverageTime])
@Measurement(iterations = 1)
open class CoroutinesBenchmark {
    
    @Benchmark
    fun benchmarkAsync(blackhole: Blackhole) = runBlocking{
        val a = async {
            delay(1000L)
            5
        }
        
        val b = async {
            delay(1000L)
            10
        }
        
        blackhole.consume(a.await() + b.await())
    }
    
    @Benchmark
    fun benchmark(blackhole: Blackhole) {
        val a = runBlocking { 
            delay(1000L)
            5
        }
        
        val b = runBlocking { 
            delay(1000L)
            10
        }
        
        blackhole.consume(a + b)
    }
}
