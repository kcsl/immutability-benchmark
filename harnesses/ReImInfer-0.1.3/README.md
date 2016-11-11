# Vagrant ReImInfer Benchmark Test Harness

ReImInfer is a reference immutability and purity analysis utility. This test harness runs ReImInfer over the Immutability Benchmark in a Vagrant virtual machine.

This test harness runs the OOPSLA 2012 release of ReImInfer. Since the official Google Code hosting is no longer available this repository uses an official clone of the tool hosted at: [https://github.com/SoftwareEngineeringToolDemos/FSE-2012-ReImInfer](https://github.com/SoftwareEngineeringToolDemos/FSE-2012-ReImInfer).

## Setup
1. Download and install [VirtualBox](https://www.virtualbox.org/) and [Vagrant](http://www.vagrantup.com/) for your host machine.

2. Clone this repository `git clone https://github.com/kcsl/immutability-benchmark` on your host machine.

3. On the command line, navigate to the [vm](./vm) directory of the harness and run `vagrant up`.

4. When the virtual machine setup has complete the results will be saved as [RESULTS.zip](./vm/RESULTS.zip).
