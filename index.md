---
layout: default
---

## Overview
Many applications in software analysis, testing and verification call for tools that analyze the immutability of objects. An immutability analysis boils down to answering the question: *given code C and reference R, is the object O referenced by R mutated in the code C?*. The immutability benchmark was created to rigorously tests the relative accuracy boundaries of different approaches to immutability analysis.

## Benchmark Design Features
- **Independently Analyzable:** Each test case is individually testable, with all of its dependencies encapsulated.
- **Human-comprehensible:** The test cases are simple enough that developers and users can understand the accuracy boundaries of a tool by browsing the tests cases in which the tool failed to produce correct analysis results.
- **Annotated:** Each test case has been annotated to facilitate programmatic querying of the answer key. This makes it easy to write a test harness and evaluate whether a static analysis tool answered correctly for a given test case.
- **Executable:** Test cases are executable, with its output serving as a proof of correctness of the test case's annotated answer key.
- **Reproducible:** The test cases are deterministic and bundled with an environment that easily reproduces the results for a given implementation. The benchmark is released with [Vagrant](https://en.wikipedia.org/wiki/Vagrant_(software)) virtual machines configured with a test harness to run current tools over the benchmark.
- **Individually Citable:** To promote sharing of results, collaboration between researchers, and to support reproducibility, each test case is individually referable. Each version of the benchmark has an associated [Digital Object Identifier](http://en.wikipedia.org/wiki/Digital_object_identifier) (DOI) reference number.

## Source Code
Want additional resources?  Grab a copy of the [source](https://github.com/kcsl/immutability-benchmark).