# Functional Programming – Exercise Solutions

**Author:** Taha El Amine Kassabi
**Course:** Functional Programming (WS 2023/24)
**Instructor:** Prof. (add instructor)
**University:** Heinrich Heine University Düsseldorf (HHU)

---

## 📚 Overview

This repository contains **REPL session exercises**, **reading guides**, and **lecture exercise solutions** for the Functional Programming course at HHU.
It covers core Clojure concepts—from syntax, data structures, and recursion to macros, concurrency primitives, and polymorphism—along with project work.

---

## 📂 Repository Structure

```
project.clj              # Leiningen project configuration
repl/                    # Interactive REPL session source files
src/                     # Lecture exercise implementations (by unit)
problems/                # 4clojure problems
```

---

## 🧠 Topics Covered


| Unit | Topic                                                        |
| ---- | ------------------------------------------------------------ |
| 1    | Syntax, tooling & REPL fundamentals                          |
| 2    | First steps: lambdas, special forms, sequence operations     |
| 3    | Higher-order functions (map, filter, reduce, partial)        |
| 4    | Data structures & laziness (vectors, lists, maps, lazy-seqs) |
| 5    | Recursion & destructuring                                    |
| 6    | Fixed points, Newton’s method, abstraction                  |
| 7    | Macros I: code-as-data & basic macro-writing                 |
| 8    | Macros II: syntax-quote, reader macros & DSL                 |
| 9    | Theory: epochal time model & identity vs value               |
| 10   | Atoms & agents: state management in Clojure                  |
| 11   | The expression problem                                       |
| 12   | Refs, futures & promises: transactional state                |
| 13   | Polymorphism: multimethods & protocols                       |
| 14   | Philosophy: simplicity, debugging, and groove-driven dev     |

---

## 💾 Setup

```bash
# Ensure Leiningen and JDK 11+ are installed
# No additional dependencies; REPL uses Clojure core and standard libs
lein deps
```

---

## 🚀 Usage

1. **REPL Sessions**:
   ```bash
   cd repl
   lein repl
   (load-file "src/repl/00_syntax.clj")
   ; or evaluate other session files
   ```
2. **Lecture Exercises**:
   ```bash
   lein repl
   (load-file "src/lX/eX_Y.clj")  ; replace X and Y with unit/exercise numbers
   ```

---

## 📝 Notes

- Solutions demonstrate idiomatic Clojure using **core functions**, **functional abstractions**, and **immutability**.
- Macros and DSL exercises illustrate **code-as-data** and **meta-programming**.
- Concurrency units leverage **atoms**, **agents**, and **refs** to teach Clojure’s time-and-value model.
