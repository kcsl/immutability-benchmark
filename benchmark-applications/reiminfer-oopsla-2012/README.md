# Benchmark Applications - ReImInfer OOPSLA 2012

This folder contains Java source and Jimple Eclipse projects of the benchmark applications used in the [ReIm & ReImInfer: Checking and Inference of Reference Immutability and Method Purity](https://huangw5.github.io/docs/oopsla12.pdf) paper.

Each application was modified in the following way.

1. An eclipse project with compiler compliance level of JDK 8 was created
2. The [original benchmark application source](./2012-oopsla-eval.zip) was imported into the project, however test code or example programs were excluded.
3. Library dependencies were added to the project
4. Empty implementations of unimplemented methods for JDK 8 (migration from JDK 6) were added until the project compiled.
5. A Jimple project was generated from the project class files of the compiled source.