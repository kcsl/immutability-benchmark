# Benchmark Applications - ReImInfer OOPSLA 2012

This folder contains Java source and Jimple Eclipse projects of the benchmark applications used in the [ReIm & ReImInfer: Checking and Inference of Reference Immutability and Method Purity](https://huangw5.github.io/docs/oopsla12.pdf) paper.

Each application was modified in the following way.

1. An eclipse project with compiler compliance level of JDK 8 was created
2. The [original benchmark application source](./2012-oopsla-eval.zip) was imported into the project, however test code or example programs were excluded.
3. The ReImInfer specific import statement `import checkers.inference.ownership.quals.*` was commented out in all class files.
4. Library dependencies were added to the project
5. Empty implementations of unimplemented methods for JDK 8 (migration from JDK 6) were added until the project compiled.
6. A Jimple project was generated from the project class files of the compiled source.

## Applications
- [ejc](./source/ejc) (version 3.2.0) is the Java Compiler for the Eclipse IDE
- [javad](./source/javad) is a Java class file disassembler

## Libraries
- [TinySQL](./source/TinySQL) (version 1.1) is a database engine
- [HTMLParser](./source/HTMLParser) (version 1.4) is a library for parsing HTML
- [Jdbm](./source/Jdbm) (version 1.0) is a lightweight transactional persistence engine
- [Jdbf](./source/Jdbf) (version 0.0.1) is an object-relational mapping system
- [commons-pool](./source/commons-pool) (version 1.2) is a generic object-pooling library
- [jTDS](./source/jTDS) (version 1.0) is a JDBC driver for Microsoft SQL Server and Sybase
- [Xalan](./source/Xalan) (version 2.7.1) is a library for transforming XML documents to HTML from the DaCapo 9.12 benchmark suite

## Excluded Sources
- SPECjbb (2005 version) is SPEC's benchmark for evaluating server side Java
- java.lang is the package from JDK 1.6
- java.util is the package from JDK 1.6

The java.lang and java.util source was not included with the original benchmark and the minor version and OS platform was not specified so it is not included here because there are multiple versions. The SPECjbb application source was also not included with the original benchmarks so it has been excluded from this dataset.