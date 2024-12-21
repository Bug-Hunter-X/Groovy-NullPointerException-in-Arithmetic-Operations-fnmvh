# Groovy NullPointerException in Arithmetic Operations

This repository demonstrates a common error in Groovy related to null values in arithmetic operations.  Groovy's dynamic typing can make it easy to accidentally perform arithmetic operations on null values, leading to `NullPointerExceptions`.

The `bug.groovy` file shows an example where null values are not explicitly handled. The `bugSolution.groovy` file demonstrates a corrected version that handles null values gracefully.

This example highlights the importance of defensive programming and explicitly checking for null values before performing arithmetic operations in Groovy.