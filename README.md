# Sentence-Reversal-Patterns-in-Java
___

## Strings – Sentence Reversal Patterns in Java

**Problem**
You're building a text processing utility for a secure communication tool that encrypts messages by manipulating the structure of input sentences. To understand how different string manipulation methods affect readability and recovery, you're asked to implement a program that performs three distinct reverse transformations on an input sentence.

Each transformation reveals a different structural view of the sentence:

1. **Full Reverse**: Reverses the entire input string character by character but keeps spaces in their original positions.
2. **Reverse Word Order**: Reverses the order of words in the sentence while maintaining each word's characters in the correct order.
3. **Reverse Characters in Each Word**: Reverses the characters within each word, preserving the original word order.

Given a string containing words separated by spaces, implement a Java program that performs all three transformations and outputs each result on a new line.

### Input Format

A single line of text `input`, which may contain multiple words separated by spaces.

### Constraints

* The input will not exceed 10⁴ characters.
* The input will contain only printable ASCII characters, primarily lowercase/uppercase letters and spaces.
* The input string will not start or end with spaces.
* No consecutive spaces are present.

### Output Format

Three lines:

1. Full character reverse (spaces preserved).
2. Sentence with word order reversed.
3. Sentence with characters of each word reversed.

### Sample Input 0

```
hello world openai
```

### Sample Output 0

```
ianepo dlrow olleh  
openai world hello  
olleh dlrow ianepo  
```

### Explanation

* **First Line**: Characters are reversed from end to start, maintaining the original spaces.
* **Second Line**: Words are re-ordered from end to start.
* **Third Line**: Each word's characters are reversed in place.

---

Would you like me to format this as a file or export it for a coding platform like HackerRank or LeetCode?
