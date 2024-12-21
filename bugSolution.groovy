```groovy
def calculate(a, b) {
  a = a ?: 0 // Assign 0 if a is null
  b = b ?: 0 // Assign 0 if b is null
  return a + b
}

println calculate(5, 3)  // Output: 8
println calculate(null, 3) // Output: 3
println calculate(5, null) // Output: 5
println calculate(null, null) // Output: 0
```