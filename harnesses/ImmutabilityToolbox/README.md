# Immutability Toolbox Test Harness

This test harness runs the collects benchmark results for the [immutability-toolbox](https://ensoftcorp.github.io/immutability-toolbox/). To run the test harness import the `immutability.harness` into the Eclipse workspace. Add a shell dependency on the `immutability.harness` project and then run `immutability.harness.grader.Grader.score(new java.io.File("benchmark-results.csv"))`.

Note: A virtual machine is currently being constructed to run this test harness in a vagrant setup.
