# 📈 Financial Forecasting – Recursive Algorithm Analysis

This document contains the theoretical explanation and analysis for the financial forecasting tool using recursion, as per the assignment requirements.

---

## 1. 🧠 Understanding Recursive Algorithms

### What is Recursion?

Recursion is a technique where a function calls itself to solve smaller parts of a problem until a base condition is met. It simplifies problems that have a repetitive or divide-and-conquer nature.

### Why use Recursion in Forecasting?

In financial forecasting, future values often depend on previous values and a consistent growth rate. This makes it a good use case for recursion.

Example recurrence:

FV(n) = FV(n-1) * (1 + r)

Where:
- `FV(n)` = value after n years
- `r` = annual growth rate
- `FV(0)` = initial amount

---


## 2. ⏱️ Time Complexity Analysis

In a basic recursive implementation:

- **Time Complexity:** O(n)
  - One recursive call per year
- **Space Complexity:** O(n)
  - Due to the recursion call stack

This means the function's time and space usage grow linearly with the number of years being forecasted.

---

## 3. ⚙️ Optimization Strategies

### a. Iterative Approach
To avoid the overhead of recursion, especially for large inputs, an **iterative solution** is preferred. It uses a simple loop and constant memory, making it more efficient.

### b. Memoization
If the recursive method is used in simulations or repeatedly with the same input values, **memoization** (caching results) can significantly reduce computation time by storing previously calculated results.

---

## ✅ Summary

- Recursion simplifies the logic but can lead to performance issues.
- Use recursion for readability and small input sizes.
- Use iteration or memoization for better performance with larger datasets.
